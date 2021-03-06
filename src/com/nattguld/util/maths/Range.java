package com.nattguld.util.maths;

import java.util.Random;

/**
 * 
 * @author randqm
 *
 */

public class Range {
	
	/**
	 * The minimum range.
	 */
	private final int minimum;
	
	/**
	 * The maximum range.
	 */
	private final int maximum;
	
	
	/**
	 * Creates a new range.
	 * 
	 * @param minimum The minimum range.
	 * 
	 * @param maximum The maximum range.
	 */
	public Range(int minimum, int maximum) {
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
	public boolean isInRange(int value) {
		return value >= getMin() && value <= getMax();
	}
	
	/**
	 * Retrieves a random value from the range.
	 * 
	 * @return The random value.
	 */
	public int getRandom() {
		if (getMin() == getMax()) {
    		return getMin();
    	}
    	if (getMax() < getMin()) {
    		System.err.println("Range can't be less than minimum [Min: " + getMin() + "][Max: " + getMax() + "]");
    		return getMax();
    	}
    	return getMin() + new Random().nextInt(getMax() - getMin());
	}
	
	/**
	 * Retrieves the minimum range.
	 * 
	 * @return The minimum range.
	 */
	public int getMin() {
		return minimum;
	}
	
	/**
	 * Retrieves the maximum range.
	 * 
	 * @return The maximum range.
	 */
	public int getMax() {
		return maximum;
	}
	
	@Override
	public String toString() {
		return "Range (" + getMin() + ", " + getMax() + ")";
	}

}
