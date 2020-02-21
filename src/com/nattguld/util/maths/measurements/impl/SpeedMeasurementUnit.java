package com.nattguld.util.maths.measurements.impl;

import com.nattguld.util.maths.measurements.MeasurementCalculator;
import com.nattguld.util.maths.measurements.MeasurementUnit;

/**
 * 
 * @author randqm
 *
 */

public enum SpeedMeasurementUnit implements MeasurementUnit {
	
	KMH(1, "kmh"),
	METER_PER_SECOND(0.28, "m/s"),
	KNOP(0.54, "k"),
	MPH(0.62, "mph"),
	FEET_PER_SECOND(0.91, "f/s");

	
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
	private SpeedMeasurementUnit(double modifier, String abbreviation) {
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
		return 1;
	}

}
