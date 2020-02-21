package com.nattguld.util.maths.measurements.impl;

import com.nattguld.util.maths.measurements.MeasurementCalculator;
import com.nattguld.util.maths.measurements.MeasurementUnit;

/**
 * 
 * @author randqm
 *
 */

public enum TerrainMeasurementUnit implements MeasurementUnit {
	
	SQUARE_KILOMETER(0.000001, "km²"),
	HECTARE(0.0001, "ha"),
	ARE(0.01, "a"),
	SQUARE_METER(1, "m²"),
	SQUARE_DECIMETER(100.0, "dm²"),
	SQUARE_CENTIMETER(10000.0, "cm²"),
	SQUARE_MILLIMETER(1000000.0, "mm²"),
	
	SQUARE_YARD(1.1959900463, "yr²"),
	SQUARE_FEET(10.763910417, "ft²"),
	SQUARE_INCH(1550.0031, "in²"),
	ACRE(0.0002471054, "ac"),
	SQUARE_MILE(0.000000386, "mi²");

	
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
	private TerrainMeasurementUnit(double modifier, String abbreviation) {
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
		return 3;
	}

}
