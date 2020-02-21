package com.nattguld.util.geo.location;

/**
 * 
 * @author randqm
 *
 */

public class StateRegion {
	
	/**
	 * The state/region/province name.
	 */
	private final String name;
	
	/**
	 * The abbreviation.
	 */
	private final String abbreviation;
	
	
	/**
	 * Creates a new country state.
	 * 
	 * @param name The state/region/province name.
	 * 
	 * @param abbreviation The abbreviation.
	 */
	public StateRegion(String name, String abbreviation) {
		this.name = name;
		this.abbreviation = abbreviation;
	}
	
	/**
	 * Retrieves the state/region/province name.
	 * 
	 * @return The state/region/province name.
	 */
	public String getName() {
		return name;
	}
	
	public String getAbbreviation() {
		return abbreviation;
	}
	
	@Override
	public String toString() {
		return getName();
	}

}
