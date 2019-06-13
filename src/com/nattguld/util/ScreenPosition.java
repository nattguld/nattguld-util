package com.nattguld.util;

/**
 * 
 * @author randqm
 *
 */

public enum ScreenPosition {
	
	BOTTOM("Bottom"),
	BOTTOM_LEFT("Bottom left"),
	BOTTOM_RIGHT("Bottom right"),
	CENTER("Center"),
	//CENTER_LEFT("Center left"),
	//CENTER_RIGHT("Center right"),
	TOP("Top"),
	TOP_LEFT("Top left"),
	TOP_RIGHT("Top right");
	
	
	/**
	 * The name.
	 */
	private final String name;
	
	
	/**
	 * Creates a new screen position.
	 * 
	 * @param name The name.
	 */
	private ScreenPosition(String name) {
		this.name = name;
	}
	
	/**
	 * Retrieves the name.
	 * 
	 * @return The name.
	 */
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return getName();
	}

}
