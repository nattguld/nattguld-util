package com.nattguld.util.generics.kvps.impl;

import com.nattguld.util.generics.kvps.KeyValuePair;

/**
 * 
 * @author randqm
 *
 */

public class StringNameValuePair extends KeyValuePair<String, String> {

	
	/**
	 * Creates a string key-value pair.
	 * 
	 * @param key The key.
	 * 
	 * @param value The value.
	 */
	public StringNameValuePair(String key, String value) {
		super(key, value);
	}
	
	@Override
	public String getKey() {
		return super.getKey();
	}
	
	@Override
	public String getValue() {
		return super.getValue();
	}

}
