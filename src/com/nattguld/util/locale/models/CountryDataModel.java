package com.nattguld.util.locale.models;

/**
 * 
 * @author randqm
 *
 */

public class CountryDataModel {
	
	/**
	 * The country code.
	 */
	private final String countryCode;
	
	/**
	 * The country name.
	 */
	private final String countryName;
	
	
	/**
	 * Creates a new country data model.
	 * 
	 * @param countryCode The country code.
	 * 
	 * @param countryName The country name.
	 */
	public CountryDataModel(String countryCode, String countryName) {
		this.countryCode = countryCode;
		this.countryName = countryName;
	}
	
	/**
	 * Retrieves the country code.
	 * 
	 * @return The country code.
	 */
	public String getCountryCode() {
		return countryCode;
	}
	
	/**
	 * Retrieves the country name.
	 * 
	 * @return The country name.
	 */
	public String getCountryName() {
		return countryName;
	}

}
