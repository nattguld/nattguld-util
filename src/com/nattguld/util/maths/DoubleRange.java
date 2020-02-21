package com.nattguld.util.maths;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author randqm
 *
 */

public class DoubleRange {
	
	/**
	 * The minimum range.
	 */
	private final double minimum;
	
	/**
	 * The maximum range.
	 */
	private final double maximum;
	
	
	/**
	 * Creates a new range.
	 * 
	 * @param minimum The minimum range.
	 * 
	 * @param maximum The maximum range.
	 */
	public DoubleRange(double minimum, double maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}
	
	/**
	 * Retrieves whether a given value is in range or not.
	 * 
	 * @param value The value.
	 * 
	 * @return The result.
	 */
	public boolean isInRange(double value) {
		return value >= getMin() && value <= getMax();
	}
	
	/**
	 * Retrieves a random value from the range.
	 * 
	 * @return The random value.
	 */
	public double getRandom() {
		if (getMin() == getMax()) {
    		return getMin();
    	}
    	if (getMax() < getMin()) {
    		System.err.println("Range can't be less than minimum [Min: " + getMin() + "][Max: " + getMax() + "]");
    		return getMax();
    	}
    	return getMin() + ThreadLocalRandom.current().nextDouble(getMax() - getMin());
	}
	
	/**
	 * Retrieves the minimum range.
	 * 
	 * @return The minimum range.
	 */
	public double getMin() {
		return minimum;
	}
	
	/**
	 * Retrieves the maximum range.
	 * 
	 * @return The maximum range.
	 */
	public double getMax() {
		return maximum;
	}
	
	@Override
	public String toString() {
		return "DoubleRange (" + getMin() + ", " + getMax() + ")";
	}

}
