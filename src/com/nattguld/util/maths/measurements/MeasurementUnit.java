package com.nattguld.util.maths.measurements;

/**
 * 
 * @author randqm
 *
 */

public interface MeasurementUnit {
	
	
	/**
	 * Retrieves the abbreviation.
	 * 
	 * @return The abbreviation.
	 */
	public String getAbbreviation();
	
	/**
	 * Retrieves the modifier.
	 * 
	 * @return The modifier.
	 */
	public double getModifier();
	
	/**
	 * Converts a given value to a target unit.
	 * 
	 * @param sourceValue The source value.
	 * 
	 * @param targetUnit The target unit.
	 * 
	 * @return The converted value.
	 */
	public double convert(double sourceValue, MeasurementUnit targetUnit);
	
	/**
	 * Retrieves the decimals.
	 * 
	 * @return The decimals.
	 */
	public int getDecimals();

}
