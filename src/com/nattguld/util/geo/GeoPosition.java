package com.nattguld.util.geo;

import com.nattguld.util.geo.location.City;
import com.nattguld.util.locale.Country;

/**
 * 
 * @author randqm
 *
 */

public class GeoPosition {
	
	/**
	 * The country.
	 */
	private final Country country;
	
	/**
	 * The city.
	 */
	private final City city;
	
	/**
	 * The position coordinates.
	 */
	private final GeoCoordinates geoCoords;
	
	
	/**
	 * Creates a new geo position.
	 * 
	 * @param country The country.
	 * 
	 * @param city The city.
	 * 
	 * @param geoCoords The position coordinates.
	 */
	public GeoPosition(Country country, City city, GeoCoordinates geoCoords) {
		this.country = country;
		this.city = city;
		this.geoCoords = geoCoords;
	}
	
	/**
	 * Retrieves the country.
	 * 
	 * @return The country.
	 */
	public Country getCountry() {
		return country;
	}
	
	/**
	 * Retrieves the city.
	 * 
	 * @return The city.
	 */
	public City getCity() {
		return city;
	}
	
	/**
	 * Retrieves the position coordinates.
	 * 
	 * @return The coordinates.
	 */
	public GeoCoordinates getGeoCoords() {
		return geoCoords;
	}

}
