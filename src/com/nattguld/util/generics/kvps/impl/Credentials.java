package com.nattguld.util.generics.kvps.impl;

/**
 * 
 * @author randqm
 *
 */

@Deprecated
public class Credentials {
	
	/**
	 * The username.
	 */
	private String username;
	
	/**
	 * The password.
	 */
	private String password;
	
	
	/**
	 * Creates new credentials.
	 * 
	 * @param username The username.
	 * 
	 * @param password The password.
	 */
	public Credentials(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	/**
	 * Retrieves the username.
	 * 
	 * @return The username.
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * Retrieves the password.
	 * 
	 * @return The password.
	 */
	public String getPassword() {
		return password;
	}
	
	@Override
	public String toString() {
		return "Credentials [" + getUsername() + ":" + getPassword() + "]";
	}

}
