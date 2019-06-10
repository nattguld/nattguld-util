package com.nattguld.util.chrono;

import java.time.ZoneId;

/**
 * 
 * @author randqm
 *
 */

public class SystemDateTime extends DateTime {
	
	
	/**
	 * Creates a new system date time instance.
	 */
	public SystemDateTime() {
		this(System.currentTimeMillis());
	}
	
	/**
	 * Creates a new system date time instance with a given time.
	 * 
	 * @param ms The time.
	 */
	public SystemDateTime(long ms) {
		super(ms, ZoneId.systemDefault());
	}

}
