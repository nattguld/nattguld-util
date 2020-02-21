package com.nattguld.util.locale.models.impl;

import com.nattguld.util.locale.Language;
import com.nattguld.util.locale.models.CountryDataModel;

/**
 * 
 * @author randqm
 *
 */

public class CountryLanguages extends CountryDataModel {
	
	/**
	 * The languages.
	 */
	private final Language[] languages;
	
	
	/**
	 * Creates new country geographics.
	 * 
	 * @param countryCode The country code.
	 * 
	 * @param countryName The country name.
	 * 
	 * @param regions The languages.
	 */
	public CountryLanguages(String countryCode, String countryName, Language[] languages) {
		super(countryCode, countryName);
		
		this.languages = languages;
	}
	
	/**
	 * Retrieves the languages.
	 * 
	 * @return The languages.
	 */
	public Language[] getLanguages() {
		return languages;
	}

}
