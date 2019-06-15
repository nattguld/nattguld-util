package com.nattguld.util.chrono.format;

import com.nattguld.util.text.Delimiter;

/**
 * 
 * @author randqm
 *
 */

public enum DateFormat {
	
	DD_MM_YYYY("dd-MM-yyyy"),
	YYYY_MM_DD("yyyy-MM-dd"),
	YYYY_DD_MM("yyyy-dd-MM"),
	DD_MM("dd-MM"),
	MM_DD("MM-dd"),
	MM_YYYY("MM-yyyy"),
	YYYY_MM("yyyy-MM"), 
	MM_DD_YYYY("MM-dd-yyyy");
	
	
	/**
	 * The format.
	 */
	private final String format;
	
	
	/**
	 * Creates a new date format.
	 * 
	 * @param format The format.
	 */
	private DateFormat(String format) {
		this.format = format;
	}
	
	/**
	 * Retrieves the format.
	 * 
	 * @param delimter The delimeter.
	 * 
	 * @return The format.
	 */
	public String getFormat(Delimiter delimiter) {
		return format.replace("-", delimiter.getCharacter());
	}
	
	@Override
	public String toString() {
		return getFormat(Delimiter.MINUS);
	}
	
}
