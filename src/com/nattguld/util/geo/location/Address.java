package com.nattguld.util.geo.location;

/**
 * 
 * @author randqm
 *
 */

public class Address {
	
	/**
	 * The city.
	 */
	private final City city;
	
	/**
	 * The street.
	 */
	private final String street;
	
	/**
	 * The street number.
	 */
	private final String streetNumber;
	
	
	/**
	 * Creates a new address.
	 * 
	 * @param city The city.
	 * 
	 * @param street The street.
	 * 
	 * @param streetNumber The street number.
	 */
	public Address(City city, String street, String streetNumber) {
		this.city = city;
		this.street = street;
		this.streetNumber = streetNumber;
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
	 * Retrieves the street.
	 * 
	 * @return The street.
	 */
	public String getStreet() {
		return street;
	}
	
	/**
	 * Retrieves the street number.
	 * 
	 * @return The street number.
	 */
	public String getStreetNumber() {
		return streetNumber;
	}
	
	@Override
	public String toString() {
		return getStreet() + " " + getStreetNumber() + ", " + getCity().getPostalCode() + " " + getCity().getName() + ", " + getCity().getState().getName();
	}

}
