package com.nattguld.util.generics;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 
 * @author randqm
 *
 * @param <T>
 */

public class Container<T> {
	
	/**
	 * Holds the elements in the container.
	 */
	private final List<T> elements = new LinkedList<>();
	
	/**
	 * The container deque.
	 */
	private final Deque<T> deque = new LinkedBlockingDeque<>();
	
	
	/**
	 * Adds an element to the container.
	 * 
	 * @param element The element to add.
	 */
	public void add(T element) {
		elements.add(element);
		deque.offer(element);
	}
	
	/**
	 * Retrieves and removes the next element in the deque.
	 * 
	 * @return The element.
	 */
	public T next() {
		return deque.poll();
	}
	
	/**
	 * Resets the deque.
	 */
	public void resetDeque() {
		deque.clear();
		deque.addAll(elements);
	}
	
	/**
	 * Retrieves whether the container is empty or not.
	 * 
	 * @return The result.
	 */
	public boolean isContainerEmpty() {
		return elements.isEmpty();
	}
	
	/**
	 * Retrieves whether the deque is empty or not.
	 * 
	 * @return The result.
	 */
	public boolean isDequeEmpty() {
		return deque.isEmpty();
	}
	
	/**
	 * Retrieves the container size.
	 * 
	 * @return The container size.
	 */
	public int getContainerSize() {
		return elements.size();
	}
	
	/**
	 * Retrieves the deque size.
	 * 
	 * @return The deque size.
	 */
	public int getDequeSize() {
		return deque.size();
	}
	
	/**
	 * Retrieves the elements.
	 * 
	 * @return The elements.
	 */
	protected List<T> getElements() {
		return elements;
	}
	
	/**
	 * Copies the file container.
	 * 
	 * @return The copied file container.
	 */
	public Container<T> copy() {
		Container<T> copy = new Container<T>();
		
		for (T element : getElements()) {
			add(element);
		}
		return copy;
	}

}
