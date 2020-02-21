package com.nattguld.util.geo.models.impl;

import com.nattguld.util.geo.location.City;
import com.nattguld.util.locale.models.CountryDataModel;
import com.nattguld.util.maths.Maths;

/**
 * 
 * @author randqm
 *
 */

public class CountryCities extends CountryDataModel {
	
	/**
	 * The country's cities.
	 */
	private final City[] cities;
	
	
	/**
	 * Creates a new human heights model.
	 * 
	 * @param countryCode The country code.
	 * 
	 * @param countryName The country name.
	 * 
	 * @param cities The country's cities.
	 */
	public CountryCities(String countryCode, String countryName, City[] cities) {
		super(countryCode, countryName);
		
		this.cities = cities;
	}
	
	/**
	 * Retrieves the country's cities.
	 * 
	 * @return The country's cities.
	 */
	public City[] getCities() {
		return cities;
	}
	
	/**
	 * Retrieves a random city.
	 * 
	 * @return The city.
	 */
	public City getRandomCity() {
		return getCities()[Maths.random(getCities().length)];
	}

}
