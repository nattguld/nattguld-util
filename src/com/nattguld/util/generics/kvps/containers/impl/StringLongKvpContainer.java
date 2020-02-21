package com.nattguld.util.generics.kvps.containers.impl;

import java.util.ArrayList;
import java.util.List;

import com.nattguld.util.generics.kvps.KeyValuePair;
import com.nattguld.util.generics.kvps.containers.KeyValuePairContainer;

/**
 * 
 * @author randqm
 *
 */

public class StringLongKvpContainer extends KeyValuePairContainer<KeyValuePair<String, Long>, String, Long> {
	
	
	/**
	 * Creates a new key-value pair container.
	 */
	public StringLongKvpContainer() {
		this(new ArrayList<KeyValuePair<String, Long>>());
	}
	
	/**
	 * Creates a new key-value pair container.
	 * 
	 * @param entries The entries storage list.
	 */
	public StringLongKvpContainer(List<KeyValuePair<String, Long>> entries) {
		super(entries);
	}
	
	/**
	 * Sets a new key-value pair.
	 * 
	 * @param key The key.
	 * 
	 * @param value The value.
	 * 
	 * @return The storage.
	 */
	public StringLongKvpContainer set(String key, long value) {
		return (StringLongKvpContainer)super.set(new KeyValuePair<String, Long>(key, value));
	}

	@Override
	public StringLongKvpContainer duplicate() {
		StringLongKvpContainer kvpc = new StringLongKvpContainer();
		kvpc.importEntries(getEntries());
		kvpc.setCaseSensitive(isCaseSensitive());
		return kvpc;
	}
	
}
