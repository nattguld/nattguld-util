package com.nattguld.util.chrono;

/**
 * 
 * @author randqm
 *
 */

public class Timestamp {
	
	/**
	 * The milliseconds.
	 */
	private final long ms;
	
	
	/**
	 * Creates a new timestamp.
	 */
	public Timestamp() {
		this(System.currentTimeMillis());
	}
	
	/**
	 * Creates a new time stamp.
	 * 
	 * @param ms The milliseconds.
	 */
	public Timestamp(long ms) {
		this.ms = ms;
	}
	
	/**
	 * Retrieves the milliseconds.
	 * 
	 * @return The milliseconds.
	 */
	public long getMs() {
		return ms;
	}
	
	@Override
	public String toString() {
		return DateTimeUtil.formatDateTime(new DateTime(ms).getLocalDateTime());
	}

}
