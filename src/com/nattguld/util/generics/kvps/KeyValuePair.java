package com.nattguld.util.generics.kvps;

/**
 * 
 * @author randqm
 *
 */

public abstract class KeyValuePair<T, V> {
	
	/**
	 * The key.
	 */
	private final T key;
	
	/**
	 * The value.
	 */
	private final V value;
	
	
	/**
	 * Creates a new key value pair.
	 * 
	 * @param key The key.
	 * 
	 * @param value The value.
	 */
	public KeyValuePair(T key, V value) {
		this.key = key;
		this.value = value;
	}
	
	/**
	 * Retrieves the key.
	 * 
	 * @return The key.
	 */
	public T getKey() {
		return key;
	}
	
	/**
	 * Retrieves the key as string.
	 * 
	 * @return The key.
	 */
	public String getKeyAsString() {
		return (String)getKey();
	}
	
	/**
	 * Retrieves the key as char.
	 * 
	 * @return The key.
	 */
	public char getKeyAsChar() {
		return (char)getKey();
	}
	
	/**
	 * Retrieves the key as byte.
	 * 
	 * @return The key.
	 */
	public byte getKeyAsByte() {
		return (byte)getKey();
	}
	
	/**
	 * Retrieves the key as boolean.
	 * 
	 * @return The key.
	 */
	public boolean getKeyAsBoolean() {
		return (boolean)getKey();
	}
	
	/**
	 * Retrieves the key as float.
	 * 
	 * @return The key.
	 */
	public float getKeyAsFloat() {
		return (float)getKey();
	}
	
	/**
	 * Retrieves the key as double.
	 * 
	 * @return The key.
	 */
	public double getKeyAsDouble() {
		return (double)getKey();
	}
	
	/**
	 * Retrieves the key as integer.
	 * 
	 * @return The key.
	 */
	public int getKeyAsInt() {
		return (int)getKey();
	}
	
	/**
	 * Retrieves the key as long.
	 * 
	 * @return The key.
	 */
	public long getKeyAsLong() {
		return (long)getKey();
	}
	
	/**
	 * Retrieves the value.
	 * 
	 * @return The value.
	 */
	public V getValue() {
		return value;
	}
	
	/**
	 * Retrieves the value as string.
	 * 
	 * @return The value.
	 */
	public String getValueAsString() {
		return (String)getValue();
	}
	
	/**
	 * Retrieves the value as char.
	 * 
	 * @return The value.
	 */
	public char getValueAsChar() {
		return (char)getValue();
	}
	
	/**
	 * Retrieves the value as byte.
	 * 
	 * @return The value.
	 */
	public byte getValueAsByte() {
		return (byte)getValue();
	}
	
	/**
	 * Retrieves the value as boolean.
	 * 
	 * @return The value.
	 */
	public boolean getValueAsBoolean() {
		return (boolean)getValue();
	}
	
	/**
	 * Retrieves the value as float.
	 * 
	 * @return The value.
	 */
	public float getValueAsFloat() {
		return (float)getValue();
	}
	
	/**
	 * Retrieves the value as double.
	 * 
	 * @return The value.
	 */
	public double getValueAsDouble() {
		return (double)getValue();
	}
	
	/**
	 * Retrieves the value as integer.
	 * 
	 * @return The value.
	 */
	public int getValueAsInt() {
		return (int)getValue();
	}
	
	/**
	 * Retrieves the value as long.
	 * 
	 * @return The value.
	 */
	public long getValueAsLong() {
		return (long)getValue();
	}

}
