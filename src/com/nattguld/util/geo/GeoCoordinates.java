package com.nattguld.util.geo;

import com.nattguld.util.geo.location.CityType;
import com.nattguld.util.maths.DoubleRange;
import com.nattguld.util.maths.Maths;

/**
 * 
 * @author randqm
 *
 */

public class GeoCoordinates {
	
	/**
	 * The latitude.
	 */
	private double latitude;
	
	/**
	 * The longitude.
	 */
	private double longitude;
	
	
	/**
	 * Creates a new GEO coordinate.
	 * 
	 * @param latitude The latitude.
	 * 
	 * @param longitude The longitude.
	 */
	public GeoCoordinates(double latitude, double longitude) {
		setLatitude(latitude);
		setLongitude(longitude);
	}
	
	/**
	 * Shifts the coordinates.
	 * 
	 * @param cityType The city type to calculate the shift.
	 * 
	 * @return The geo coordinates.
	 */
	public GeoCoordinates shift(CityType cityType) {
		double lat = getLatitude() + new DoubleRange(-cityType.getRadius(), cityType.getRadius()).getRandom();
		double lon = getLongitude() + new DoubleRange(-cityType.getRadius(), cityType.getRadius()).getRandom();
		setLatitude(lat);
		setLongitude(lon);
		return this;
	}
	
	/**
	 * Modifies the latitude.
	 * 
	 * @param latitude The new latitude.
	 * 
	 * @return The geo coordinate.
	 */
	public GeoCoordinates setLatitude(double latitude) {
		this.latitude = Maths.formatDoubleDecimals(latitude, 6);
		return this;
	}
	
	/**
	 * Retrieves the latitude.
	 * 
	 * @return The latitude.
	 */
	public double getLatitude() {
		return latitude;
	}
	
	/**
	 * Modifies the longitude.
	 * 
	 * @param longitude The new longitude.
	 * 
	 * @return The geo coordinate.
	 */
	public GeoCoordinates setLongitude(double longitude) {
		this.longitude = Maths.formatDoubleDecimals(longitude, 6);
		return this;
	}
	
	/**
	 * The longitude.
	 * 
	 * @return The longitude.
	 */
	public double getLongitude() {
		return longitude;
	}
	
	/**
	 * Retrieves whether a given geo coordinate equals this one.
	 * 
	 * @param other The other geo coordinate.
	 * 
	 * @return The result.
	 */
	public boolean equals(GeoCoordinates other) {
		return other.getLatitude() == getLatitude() && other.getLongitude() == getLongitude();
	}
	
	@Override
	public String toString() {
		return "[Lat: " + latitude + ", Lon: " + longitude + "]";
	}

}
