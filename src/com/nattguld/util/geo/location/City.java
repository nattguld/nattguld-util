package com.nattguld.util.geo.location;

import com.nattguld.util.geo.GeoCoordinates;

/**
 * 
 * @author randqm
 *
 */

public class City {
	
	/**
	 * The name.
	 */
	private final String name;
	
	/**
	 * The geo coordinates.
	 */
	private final GeoCoordinates geoCoords;
	
	/**
	 * The city type.
	 */
	private final CityType cityType;
	
	/**
	 * The state/province/region.
	 */
	private final StateRegion state;
	
	/**
	 * The postal code.
	 */
	private final String postalCode;
	
	
	/**
	 * Creates a new country city.
	 * 
	 * @param name the name.
	 * 
	 * @param geoCoords The geo coordinates.
	 * 
	 * @param cityType The city type.
	 * 
	 * @param state The state/province/region.
	 */
	public City(String name, GeoCoordinates geoCoords, CityType cityType, StateRegion state) {
		this.name = name;
		this.geoCoords = geoCoords;
		this.cityType = cityType;
		this.state = state;
		int i = 02;
		this.postalCode = ""; //TODO
	}
	
	/**
	 * Retrieves the name.
	 * 
	 * @return The name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Retrieves the geo coordinates.
	 * 
	 * @return The geo coordinates.
	 */
	public GeoCoordinates getGeoCoords() {
		return geoCoords;
	}
	
	/**
	 * Retrieves the city type.
	 * 
	 * @return The city type.
	 */
	public CityType getCityType() {
		return cityType;
	}
	
	/**
	 * Retrieves the state/province/region.
	 * 
	 * @return The state/province/region.
	 */
	public StateRegion getState() {
		return state;
	}
	
	/**
	 * Retrieves the postal code.
	 * 
	 * @return The postal code.
	 */
	public String getPostalCode() {
		return postalCode;
	}
	
	@Override
	public String toString() {
		return getName();
	}

}
