package com.nattguld.util.maths.measurements.impl;

import com.nattguld.util.maths.measurements.MeasurementCalculator;
import com.nattguld.util.maths.measurements.MeasurementUnit;

/**
 * 
 * @author randqm
 *
 */

public enum HeightMeasurementUnit implements MeasurementUnit {
	
	METER(1.0, "m"),
	CENTIMETER(100.0, "cm"),
	
	INCHES(39.37008, "in");

	
	/**
	 * The modifier.
	 */
	private final double modifier;
	
	/**
	 * The abbreviation.
	 */
	private final String abbreviation;
	
	
	/**
	 * Creates a new measurement unit.
	 * 
	 * @param modifier the modifier.
	 * 
	 * @param abbreviation The abbreviation.
	 */
	private HeightMeasurementUnit(double modifier, String abbreviation) {
		this.modifier = modifier;
		this.abbreviation = abbreviation;
	}
	
	@Override
	public String getAbbreviation() {
		return abbreviation;
	}
	
	/**
	 * Retrieves the modifier.
	 * 
	 * @return The modifier.
	 */
	public double getModifier() {
		return modifier;
	}
	
	/**
	 * Retrieves the feet and inches from a given source value.
	 * 
	 * @param sourceValue The source value.
	 * 
	 * @return The feet and inches.
	 */
	public int[] toFeetAndInches(double sourceValue) {
		double converted = convert(sourceValue, INCHES);
		int feet = (int)Math.floor(converted / 12);
		int rest = (int)(converted % 12);
		return new int[] {feet, rest};
	}
	
	/**
	 * Retrieves the feet and inches from a given source value in string format.
	 * 
	 * @param sourceValue The source value.
	 * 
	 * @return The feet and inches in string format.
	 */
	public String toFeetAndInchesString(double sourceValue) {
		int[] fi = toFeetAndInches(sourceValue);
		return fi[0] + "'" + fi[1] + "\"";
	}
	
	@Override
	public double convert(double sourceValue, MeasurementUnit targetUnit) {
		return MeasurementCalculator.convert(this, sourceValue, targetUnit, getDecimals());
	}

	@Override
	public int getDecimals() {
		return 1;
	}
	
	/**
	 * Retrieves the inches for a given feet and inches.
	 * 
	 * @param feet The feet.
	 * 
	 * @param inches The inches.
	 * 
	 * @return The inches.
	 */
	public static int feetAndInchesToInches(int feet, int inches) {
		return (feet * 12) + inches;
	}

}
