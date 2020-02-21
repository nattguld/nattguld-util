package com.nattguld.util.maths.measurements.impl;

import com.nattguld.util.maths.measurements.MeasurementCalculator;
import com.nattguld.util.maths.measurements.MeasurementUnit;

/**
 * 
 * @author randqm
 *
 */

public enum MassMeasurementUnit implements MeasurementUnit {
	
	TONS(0.001, "t"),
	KILOGRAM(1.0, "kg"),
	GRAM(1000.0, "g"),
	MILLIGRAM(1000000.0, "mg"),
	
	OUNCE_US(35.2739619, "ounce"),
	POUND_US(2.20462262, "lb"),
	
	OUNCE_UK(32.15, "ounce"),
	POUND_UK(2.68, "pound");

	
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
	private MassMeasurementUnit(double modifier, String abbreviation) {
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
	
	@Override
	public double convert(double sourceValue, MeasurementUnit targetUnit) {
		return MeasurementCalculator.convert(this, sourceValue, targetUnit, getDecimals());
	}

	@Override
	public int getDecimals() {
		return 2;
	}

}
