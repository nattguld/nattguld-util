package com.nattguld.util.generics.kvps.containers.impl;

import java.util.ArrayList;
import java.util.List;

import com.nattguld.util.generics.kvps.containers.KeyValuePairContainer;
import com.nattguld.util.generics.kvps.impl.StringKeyValuePair;

/**
 * 
 * @author randqm
 *
 */

public class StringStringKvpContainer extends KeyValuePairContainer<StringKeyValuePair, String, String> {
	
	
	/**
	 * Creates a new key-value pair container.
	 */
	public StringStringKvpContainer() {
		this(new ArrayList<StringKeyValuePair>());
	}
	
	/**
	 * Creates a new key-value pair container.
	 * 
	 * @param entries The entries storage list.
	 */
	public StringStringKvpContainer(List<StringKeyValuePair> entries) {
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
	public StringStringKvpContainer set(String key, String value) {
		return (StringStringKvpContainer)super.set(new StringKeyValuePair(key, value));
	}

	@Override
	public StringStringKvpContainer duplicate() {
		StringStringKvpContainer kvpc = new StringStringKvpContainer();
		kvpc.importEntries(getEntries());
		kvpc.setCaseSensitive(isCaseSensitive());
		return kvpc;
	}
	
}
