package com.nattguld.util.maths;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author randqm
 *
 */

public class LongRange {
	
	/**
	 * The minimum range.
	 */
	private final long minimum;
	
	/**
	 * The maximum range.
	 */
	private final long maximum;
	
	
	/**
	 * Creates a new range.
	 * 
	 * @param minimum The minimum range.
	 * 
	 * @param maximum The maximum range.
	 */
	public LongRange(long minimum, long maximum) {
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
	public boolean isInRange(long value) {
		return value >= getMin() && value <= getMax();
	}
	
	/**
	 * Retrieves a random value from the range.
	 * 
	 * @return The random value.
	 */
	public long getRandom() {
		if (getMin() == getMax()) {
    		return getMin();
    	}
    	if (getMax() < getMin()) {
    		System.err.println("Range can't be less than minimum [Min: " + getMin() + "][Max: " + getMax() + "]");
    		return getMax();
    	}
    	return getMin() + ThreadLocalRandom.current().nextLong(getMax() - getMin());
	}
	
	/**
	 * Retrieves the minimum range.
	 * 
	 * @return The minimum range.
	 */
	public long getMin() {
		return minimum;
	}
	
	/**
	 * Retrieves the maximum range.
	 * 
	 * @return The maximum range.
	 */
	public long getMax() {
		return maximum;
	}
	
	@Override
	public String toString() {
		return "LongRange (" + getMin() + ", " + getMax() + ")";
	}

}
