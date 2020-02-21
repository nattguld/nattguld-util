package com.nattguld.util.maths.measurements.impl;

import com.nattguld.util.maths.measurements.MeasurementCalculator;
import com.nattguld.util.maths.measurements.MeasurementUnit;

/**
 * 
 * @author randqm
 *
 */

public enum VolumeMeasurementUnit implements MeasurementUnit {
	
	LITER(1, "l"),
	DECILITER(10.0, "dl"),
	CENTILITER(100.0, "cl"),
	MILLILITER(1000.0, "ml"),
	TABLESPOON(66.67, "tbsp"),
	TEASPOON(200, "tsp"),
	
	BARREL_US_LIQUID(0.01, "bar"),
	GALLON_US_LIQUID(0.26, "gal"),
	QUART_US_LIQUID(1.06, "qt"),
	PINT_US_LIQUID(2.11, "pt"),
	BARREL_US_SOLID(0.01, "bar"),
	GALLON_US_SOLID(0.23, "gal"),
	QUART_US_SOLID(0.91, "qt"),
	PINT_US_SOLID(1.82, "pt"),
	TABLESPOON_US(67.63, "tbsp"),
	TEASPOON_US(202.88, "tsp"),
	CUP_US(4.23, "cup"),
	
	BARREL_UK(0.01, "bar"),
	GALLON_UK(0.22, "gal"),
	PINT_UK(1.76, "pt");

	
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
	private VolumeMeasurementUnit(double modifier, String abbreviation) {
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
