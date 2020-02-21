package com.nattguld.util.locale.models.impl;

import com.nattguld.util.locale.models.CountryDataModel;

/**
 * 
 * @author randqm
 *
 */

public class CountryNumber extends CountryDataModel {
	
	/**
	 * The number.
	 */
	private final int number;
	
	
	/**
	 * Creates new country geographics.
	 * 
	 * @param countryCode The country code.
	 * 
	 * @param countryName The country name.
	 * 
	 * @param number The number.
	 */
	public CountryNumber(String countryCode, String countryName, int number) {
		super(countryCode, countryName);
		
		this.number = number;
	}
	
	/**
	 * Retrieves the number.
	 * 
	 * @return The number.
	 */
	public int getNumber() {
		return number;
	}

}
