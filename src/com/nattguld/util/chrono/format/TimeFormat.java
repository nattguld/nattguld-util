package com.nattguld.util.chrono.format;

import com.nattguld.util.chrono.Clock;
import com.nattguld.util.text.Delimiter;

/**
 * 
 * @author randqm
 *
 */

public enum TimeFormat {
	
	HH_MM("HH:mm"),
	HH_MM_SS("HH:mm:ss"),
	HH_MM_SS_SSSS("HH:mm:ss:SSS");
	
	
	/**
	 * The format.
	 */
	private final String format;
	
	
	/**
	 * Creates a new time format.
	 * 
	 * @param format The format.
	 */
	private TimeFormat(String format) {
		this.format = format;
	}
	
	/**
	 * Retrieves the format.
	 * 
	 * @param clock The clock.
	 * 
	 * @param delimter The delimeter.
	 * 
	 * @return The format.
	 */
	public String getFormat(Clock clock, Delimiter delimeter) {
		String buildFormat = format.replace("-", delimeter.getCharacter());
		
		if (clock == Clock.HOUR_12) {
			buildFormat = buildFormat.replace("HH", "hh");
		}
		return buildFormat;
	}
	
	@Override
	public String toString() {
		return getFormat(Clock.HOUR_24, Delimiter.MINUS);
	}
	
}
