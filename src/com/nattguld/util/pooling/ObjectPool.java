package com.nattguld.util.pooling;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

import com.nattguld.util.Misc;

/**
 * 
 * @author randqm
 *
 */

public abstract class ObjectPool<T extends Object> {
	
	/**
	 * The pool elements.
	 */
	private final List<T> idlePool;
	
	/**
	 * The elements in use.
	 */
	private final List<T> activePool;
	
	/**
	 * The maximum pool size.
	 */
	private int maxPoolSize;
	
	
	/**
	 * Creates a new basic pool.
	 * 
	 * @param maxPoolSize The maximum pool size.
	 */
	public ObjectPool(int maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
		this.idlePool = new CopyOnWriteArrayList<>();
		this.activePool = new CopyOnWriteArrayList<>();
	}
	
	/**
	 * Creates a new element.
	 * 
	 * @return The element.
	 */
	protected abstract T createElement();

	
	/**
	 * Retrieves an element to use.
	 * 
	 * @param force Whether to force an element if no room is available.
	 * 
	 * @return The element.
	 */
	public T getElement() {
		T element = callIdleElement();
		
		if (Objects.isNull(element)) {
			if (!hasRoom()) {
				System.out.println("[" + getClass().getSimpleName() + "]: All pool elements currently in use, trying again in 10 seconds");
				Misc.sleep(10 * 1000);
				return getElement();
			}
			element = createElement();
			
			if (Objects.isNull(element)) {
				System.out.println("[" + getClass().getSimpleName() + "]: Failed to create a new pool element");
				return null;
			}
		}
		activePool.add(element);
		return element;
	}
	
	/**
	 * Calls an idle element for use.
	 * 
	 * @return The element.
	 */
	protected T callIdleElement() {
		if (idlePool.isEmpty()) {
			return null;
		}
		return idlePool.remove(idlePool.size() - 1);
	}
	
	/**
	 * Releases an element.
	 * 
	 * @param element The element to release.
	 * 
	 * @return The pool.
	 */
	public ObjectPool<T> release(T element) {
		if (Objects.isNull(element)) {
			return this;
		}
		activePool.remove(element);
		
		if (hasRoom()) {
			idlePool.add(element);
		}
		return this;
	}
	
	/**
	 * Modifies the maximum pool size.
	 * 
	 * @param maxPoolSize The new maximum pool size.
	 * 
	 * @return The pool.
	 */
	public ObjectPool<T> setMaxPoolSize(int maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
		return this;
	}
	
	/**
	 * Retrieves the maximum pool size.
	 * 
	 * @return The maximum pool size.
	 */
	public int getMaxPoolSize() {
		return maxPoolSize;
	}
	
	/**
	 * Retrieves the idle pool size.
	 * 
	 * @return The idle pool size.
	 */
	public int getIdlePoolSize() {
		return idlePool.size();
	}
	
	/**
	 * Retrieves the active pool size.
	 * 
	 * @return The active pool size.
	 */
	public int getActivePoolSize() {
		return activePool.size();
	}
	
	/**
	 * Retrieves the current pool size.
	 * 
	 * @return The current pool size.
	 */
	public int getPoolSize() {
		return getIdlePoolSize() + getActivePoolSize();
	}
	
	/**
	 * Retrieves whether there's room in the pool for new elements.
	 * 
	 * @return The result.
	 */
	public boolean hasRoom() {
		return getMaxPoolSize() < 1 || getPoolSize() < getMaxPoolSize();
	}
	
	/**
	 * Clears the idles.
	 * 
	 * @return The pool.
	 */
	public ObjectPool<T> clearIdles() {
		idlePool.clear();
		return this;
	}
	
	/**
	 * Shuts down the pool.
	 * 
	 * @return The pool.
	 * 
	 * @throws SQLException 
	 */
	public ObjectPool<T> shutdown() {
		idlePool.clear();
		activePool.clear();
		return this;
	}

}
