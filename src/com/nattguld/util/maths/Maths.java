package com.nattguld.util.maths;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.UUID;

/**
 * 
 * @author randqm
 *
 */

public class Maths {
	
	
	/**
	 * Retrieves a universal unique ID.
	 * 
	 * @return The unique ID.
	 */
	public static String getUniqueId() {
		return String.valueOf(UUID.randomUUID());
	}
	
	/**
	 * Formats a double with a given amount of decimals.
	 * 
	 * @param value The value.
	 * 
	 * @param decimals The decimals.
	 * 
	 * @return The formatted double.
	 */
	public static double formatDoubleDecimals(double value, int decimals) {
		if (value == 0d || Double.isNaN(value)) {
			return 0d;
		}
		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(decimals, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	/**
	 * Parses a string to a float value.
	 * 
	 * @param value The value.
	 * 
	 * @param defaultValue The default value.
	 * 
	 * @return The float value.
	 */
	public static float parseFloat(String value, float defaultValue) {
		try {
			return Float.parseFloat(value);
		} catch (NumberFormatException ex) {
			return defaultValue;
		}
	}
	
	/**
	 * Parses a string to a double value.
	 * 
	 * @param value The value.
	 * 
	 * @param defaultValue The default value.
	 * 
	 * @return The double value.
	 */
	public static double parseDouble(String value, double defaultValue) {
		try {
			return Double.parseDouble(value);
		} catch (NumberFormatException ex) {
			return defaultValue;
		}
	}
	
	/**
	 * Parses a string to an integer value.
	 * 
	 * @param value The value.
	 * 
	 * @param defaultValue The default value.
	 * 
	 * @return The integer value.
	 */
	public static int parseInt(String value, int defaultValue) {
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException ex) {
			return defaultValue;
		}
	}
	
	/**
	 * Parses a string to a long value.
	 * 
	 * @param value The value.
	 * 
	 * @param defaultValue The default value.
	 * 
	 * @return The long value.
	 */
	public static long parseLong(String value, long defaultValue) {
		try {
			return Long.parseLong(value);
		} catch (NumberFormatException ex) {
			return defaultValue;
		}
	}
	
	/**
	 * Retrieves whether a given string value is an integer or not.
	 * 
	 * @param value The value.
	 * 
	 * @return The result.
	 */
	public static boolean isInteger(String value) {
		try {
			Integer.parseInt(value);
			return true;
			
		} catch (NumberFormatException ex) {
			return false;
		}
	}
	
	/**
	 * Retrieves whether a given string value is a double or not.
	 * 
	 * @param value The value.
	 * 
	 * @return The result.
	 */
	public static boolean isDouble(String value) {
		try {
			Double.parseDouble(value);
			return true;
			
		} catch (NumberFormatException ex) {
			return false;
		}
	}
	
	/**
	 * Retrieves whether a given string value is a float or not.
	 * 
	 * @param value The value.
	 * 
	 * @return The result.
	 */
	public static boolean isFloat(String value) {
		try {
			Float.parseFloat(value);
			return true;
			
		} catch (NumberFormatException ex) {
			return false;
		}
	}
	
	/**
	 * Retrieves whether a given string value is a long or not.
	 * 
	 * @param value The value.
	 * 
	 * @return The result.
	 */
	public static boolean isLong(String value) {
		try {
			Long.parseLong(value);
			return true;
			
		} catch (NumberFormatException ex) {
			return false;
		}
	}
	
	/**
	 * Retrieves a hax as an integer value.
	 * 
	 * @param hex The hex.
	 * 
	 * @return The integer value.
	 */
	public static int hexToInteger(String hex) {
		return Integer.parseInt(hex.trim(), 16);
	}
	
    /**
     * Retrieves a random integer up to a specific range.
     * 
     * @param range The range.
     * 
     * @return The random integer.
     */
    public static int random(int range) {
    	return random(0, range);
    }
    
    /**
     * Retrieves a random integer up to a specific range.
     * 
     * @param range The range.
     * 
     * @return The random integer.
     */
    public static int random(Range range) {
    	return random(range.getMin(), range.getMax());
    }
    
    /**
     * Retrieves a random integer up to a specific range.
     * 
     * @param min The minimum.
     * 
     * @param max The max.
     * 
     * @return The random integer.
     */
    public static int random(int min, int max) {
    	if (min == max) {
    		return min;
    	}
    	if (max < min) {
    		System.err.println("Range can't be less than minimum");
    		return 0;
    	}
    	if (min == max) {
    		return min;
    	}
    	return min + new Random().nextInt(max - min);
    }

}
