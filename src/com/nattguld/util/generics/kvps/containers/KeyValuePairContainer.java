package com.nattguld.util.generics.kvps.containers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.nattguld.util.generics.kvps.KeyValuePair;

/**
 * 
 * @author randqm
 *
 */

public abstract class KeyValuePairContainer<KVP extends KeyValuePair<K, V>, K extends Object, V extends Object> {

	/**
	 * Holds the entries.
	 */
	private final List<KVP> entries;
	
	/**
	 * Whether to threat the key's case sensitive or not.
	 */
	private boolean caseSensitive;
	
	
	/**
	 * Creates a new key-value pair container.
	 */
	public KeyValuePairContainer() {
		this(new ArrayList<KVP>());
	}
	
	/**
	 * Creates a new key-value pair container.
	 * 
	 * @param entries The entries storage list.
	 */
	public KeyValuePairContainer(List<KVP> entries) {
		this.entries = entries;
	}
	
	/**
	 * Sets a new key-value pair.
	 * 
	 * @param kvp The key value pair.
	 * 
	 * @return The storage.
	 */
	public KeyValuePairContainer<KVP, K, V> set(KVP kvp) {
		KVP exists = getKvp(kvp.getKey());
		
		if (Objects.nonNull(exists)) {
			remove(exists);
		}
		entries.add(kvp);
		return this;
	}
	
	/**
	 * Removes a key-value pair by it's key.
	 * 
	 * @param key The key.
	 * 
	 * @return The storage.
	 */
	public KeyValuePairContainer<KVP, K, V> remove(K key) {
		return remove(getKvp(key));
	}
	
	/**
	 * Removes a key-value pair.
	 * 
	 * @param kvp The key-value pair.
	 * 
	 * @return The storage.
	 */
	public KeyValuePairContainer<KVP, K, V> remove(KVP kvp) {
		if (Objects.isNull(kvp)) {
			return this;
		}
		entries.remove(kvp);
		return this;
	}
	
	/**
	 * Retrieves whether an entry with a given key is present or not.
	 * 
	 * @param key The key.
	 * 
	 * @return The result.
	 */
	public boolean has(K key) {
		return Objects.nonNull(getKvp(key));
	}
	
	/**
	 * Retrieves the value for a given key.
	 * 
	 * @param key The key.
	 * 
	 * @return The value.
	 */
	public V getValue(K key) {
		KVP kvp = getKvp(key);
		return Objects.nonNull(kvp) ? kvp.getValue() : null;
	}
	
	/**
	 * Retrieves the kev-value pair for a given key.
	 * 
	 * @param key The key.
	 * 
	 * @return The key-value pair.
	 */
	public KVP getKvp(K key) {
		for (KVP kvp : entries) {
			if (kvp.getKey() instanceof String) {
				String keyStr = (String)kvp.getKey();
				
				if (caseSensitive ? keyStr.equals((String)key) : keyStr.equalsIgnoreCase((String)key)) {
					return kvp;
				}
				continue;
			}
			if (kvp.getKey().equals(key)) {
				return kvp;
			}
		}
		return null;
	}
	
	/**
	 * Imports given entries.
	 * 
	 * @param entries The entries to import.
	 * 
	 * @return The storage.
	 */
	public KeyValuePairContainer<KVP, K, V> importEntries(List<KVP> entries) {
		for (KVP kvp : entries) {
			set(kvp);
		}
		return this;
	}
	
	/**
	 * Clears the local storage.
	 * 
	 * @return The storage.
	 */
	public KeyValuePairContainer<KVP, K, V> clear() {
		entries.clear();
		return this;
	}
	
	/**
	 * Retrieves the entries.
	 * 
	 * @return The entries.
	 */
	public List<KVP> getEntries() {
		return entries;
	}
	
	/**
	 * Modifies Whether to threat the key's case sensitive or not.
	 * 
	 * @param caseSensitive The new state.
	 * 
	 * @return The container.
	 */
	public KeyValuePairContainer<KVP, K, V> setCaseSensitive(boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
		return this;
	}
	
	/**
	 * Retrieves Whether to threat the key's case sensitive or not.
	 * 
	 * @return The result.
	 */
	public boolean isCaseSensitive() {
		return caseSensitive;
	}
	
	/**
	 * Retrieves a duplicate instance of the storage.
	 * 
	 * @return The duplicate storage.
	 */
	public abstract KeyValuePairContainer<KVP, K, V> duplicate();

}
