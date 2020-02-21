package com.nattguld.util.maths.measurements;

import com.nattguld.util.maths.Maths;

/**
 * 
 * @author randqm
 *
 */

public class MeasurementCalculator {

	
	/**
	 * Converts a given source value to a given unit.
	 * 
	 * @param sourceUnit The source unit.
	 * 
	 * @param sourceValue The source value.
	 * 
	 * @param targetUnit The target unit.
	 * 
	 * @param decimals The decimals.
	 * 
	 * @return The modified source value.
	 */
	public static double convert(MeasurementUnit sourceUnit, double sourceValue, MeasurementUnit targetUnit, int decimals) {
		double base = toBaseUnit(sourceValue, sourceUnit.getModifier());
		double converted = base * targetUnit.getModifier();
		return Maths.formatDoubleDecimals(converted, decimals);
	}
	
	/**
	 * Converts a given source value for a given target unit to the base unit.
	 * 
	 * @param sourceValue The source value.
	 * 
	 * @param sourceUnit The source unit.
	 * 
	 * @return The modified source value.
	 */
	public static double toBaseUnit(double sourceValue, MeasurementUnit sourceUnit) {
		return toBaseUnit(sourceValue, sourceUnit.getModifier());
	}
	
	/**
	 * Converts a given source value for a given modifier.
	 * 
	 * @param sourceValue The source value.
	 * 
	 * @param modifier The modifier.
	 * 
	 * @return The modified source value.
	 */
	public static double toBaseUnit(double sourceValue, double modifier) {
		return modifier > 1.0 ? (sourceValue / modifier) : (sourceValue * modifier);
	}

}
