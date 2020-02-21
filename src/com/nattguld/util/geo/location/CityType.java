package com.nattguld.util.geo.location;

/**
 * 
 * @author randqm
 *
 */

public enum CityType {
	
	APPARTMENT("Appartment", 0.0001),
	HOUSE("House", 0.0002),
	BLOCK("Block", 0.001),
	VILLAGE("Village", 0.005),
	SMALL_CITY("Small city", 0.01),
	MEDIUM_CITY("Medium city", 0.02),
	BIG_CITY("Big City", 0.05),
	LARGE_CITY("Large City", 0.1),
	METROPOL("Metropol", 0.2);
	
	
	/**
	 * The name.
	 */
	private final String name;
	
	/**
	 * The radius coordinates shift.
	 */
	private final double radius;
	
	
	/**
	 * Creates a new city type.
	 * 
	 * @param name The name.
	 * 
	 * @param radius The radius coordinates shift.
	 */
	private CityType(String name, double radius) {
		this.name = name;
		this.radius = radius;
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
	 * Retrieves the radius.
	 * 
	 * @return The radius.
	 */
	public double getRadius() {
		return radius;
	}
	
	@Override
	public String toString() {
		return getName();
	}

}
