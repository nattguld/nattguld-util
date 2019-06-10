package com.nattguld.util.generics.kvps.impl;

import com.nattguld.util.generics.kvps.KeyValuePair;

/**
 * 
 * @author randqm
 *
 */

public class AttributeKeyValuePair extends KeyValuePair<String, Object> {

	
	/**
	 * Creates a new key value pair.
	 * 
	 * @param key The key.
	 * 
	 * @param value The value.
	 */
	public AttributeKeyValuePair(String key, Object value) {
		super(key, value);
	}
	
	@Override
	public String getKey() {
		return (String)super.getKey();
	}

}
