package com.nattguld.util.media;

/**
 * 
 * @author randqm
 *
 */

public enum AspectRatio {
	
	SQUARE("Square", 1, 1),
	WIDE("Wide", 2, 1),
	PANORAMIC("Panoramic", 4, 1),
	STANDARD("Standard", 4, 3),
	HD("HD", 16, 9),
	MONITOR("Monitor", 16, 10),
	PHONE("Phone", 9, 16),
	PHONE_WIDESCREEN("Phone Widescreen", 16, 9);
	
	
	/**
	 * The name.
	 */
	private final String name;
	
	/**
	 * The x aspect ratio.
	 */
	private final int xRatio;
	
	/**
	 * The y aspect ratio.
	 */
	private final int yRatio;
	
	
	/**
	 * Creates a new aspect ratio.
	 * 
	 * @param name The name.
	 * 
	 * @param xRatio The x aspect ratio.
	 * 
	 * @param yRatio The y aspect ratio.
	 */
	private AspectRatio(String name, int xRatio, int yRatio) {
		this.name = name;
		this.xRatio = xRatio;
		this.yRatio = yRatio;
	}
	
	/**
	 * Retrieves the name.
	 * 
	 * @return The name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Retrieves the x ratio.
	 * 
	 * @return The x ratio.
	 */
	private int getXRatio() {
		return xRatio;
	}
	
	/**
	 * Retrieves the y ratio.
	 * 
	 * @return The y ratio.
	 */
	private int getYRatio() {
		return yRatio;
	}
	
	/**
	 * Retrieves the ratio.
	 * 
	 * @return The ratio.
	 */
	public double getRatio() {
		return ((double)getXRatio() / (double)getYRatio());
	}
	
	@Override
	public String toString() {
		return getName() + " (" + getXRatio() + ":" + getYRatio() + ")";
	}

}
