package com.nattguld.util.generics.kvps.impl;

import com.nattguld.util.generics.kvps.KeyValuePair;

/**
 * 
 * @author randqm
 *
 */

public class BasicNameValuePair extends KeyValuePair<Object, Object> {

	
	/**
	 * Creates a new key value pair.
	 * 
	 * @param key The key.
	 * 
	 * @param value The value.
	 */
	public BasicNameValuePair(Object key, Object value) {
		super(key, value);
	}
	
	@Override
	public Object getKey() {
		return super.getKey();
	}
	
	@Override
	public Object getValue() {
		return super.getValue();
	}
 
}
