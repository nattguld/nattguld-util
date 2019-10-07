package com.nattguld.util.media;

import java.awt.Dimension;

/**
 * 
 * @author randqm
 *
 */

public enum ProductionType {

	NTSC("240p 4:3", 320, 240, "240p"),
	NTSC_WIDE("240p 16:9", 426, 240, "240p"),
	WIDE("360p 16:9", 640, 360, "360p"),
	VGA("VGA", 640, 480, "480p"),
	SVGA("SVGA", 800, 600, "600p"),
	XGA("XGA", 1024, 768, "768p"),
	HD("HD 720p", 1280, 720, "720p"),
	HD_PLUS("HD+ 900p", 1600, 900, "900p"),
	FHD("FHD 1080p", 1920, 1080, "1080p"),
	QHD("QHD 1440p", 2560, 1440, "1440p"),
	UHD("UHD 2160p", 3840, 2160, "2160p"),
	EIGHT_K("8K 4320p", 7680, 4320, "4320p");
	
	
	/**
	 * The name.
	 */
	private final String name;
	
	/**
	 * The width.
	 */
	private final int width;
	
	/**
	 * The height.
	 */
	private final int height;
	
	/**
	 * The pixel notation.
	 */
	private final String pixelNotation;
	
	
	/**
	 * Creates a new production type.
	 * 
	 * @param name The name.
	 * 
	 * @param width The width.
	 * 
	 * @param height The height.
	 * 
	 * @param pixelNotation The pixel notation.
	 */
	private ProductionType(String name, int width, int height, String pixelNotation) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.pixelNotation = pixelNotation;
	}
	
	/**
	 * Retrieves whether the production type is HD or not.
	 * 
	 * @return The result.
	 */
	public boolean isHD() {
		return this == HD || this == HD_PLUS
				|| this == FHD || this == QHD
				|| this == UHD;
	}
	
	/**
	 * Retrieves the name.
	 * 
	 * @return The name.
	 */
	private String getName() {
		return name;
	}
	
	/**
	 * Retrieves the width.
	 * 
	 * @return The width.
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Retrieves the height.
	 * 
	 * @return The height.
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * Retrieves the pixel notation.
	 * 
	 * @return The pixel notation.
	 */
	public String getPixelNotation() {
		return pixelNotation;
	}
	
	/**
	 * Retrieves the dimension.
	 * 
	 * @return The dimension.
	 */
	public Dimension getDimension() {
		return new Dimension(getWidth(), getHeight());
	}
	
	@Override
	public String toString() {
		return getName() + " (" + getWidth() + ":" + getHeight() + "px)";
	}
	
	/**
	 * Retrieves the production types from high to low quality.
	 * 
	 * @return The result.
	 */
	public static ProductionType[] getHightToLow() {
		ProductionType[] pts = new ProductionType[ProductionType.values().length];
		
		pts[0] = ProductionType.EIGHT_K;
		pts[1] = ProductionType.UHD;
		pts[2] = ProductionType.QHD;
		pts[3] = ProductionType.FHD;
		pts[4] = ProductionType.HD_PLUS;
		pts[5] = ProductionType.HD;
		pts[6] = ProductionType.XGA;
		pts[7] = ProductionType.SVGA;
		pts[8] = ProductionType.VGA;
		pts[9] = ProductionType.WIDE;
		pts[10] = ProductionType.NTSC_WIDE;
		pts[11] = ProductionType.NTSC;
		
		return pts;
	}
	
	/**
	 * Retrieves if a given production type is considered higher quality than another.
	 * 
	 * @param original The original.
	 * 
	 * @param toCheck The production type to compare.
	 * 
	 * @return The result.
	 */
	public static boolean isHigherQualityThan(ProductionType original, ProductionType toCheck) {
		for (ProductionType pt : getHightToLow()) {
			if (pt == original) {
				return false;
			}
			if (pt == toCheck) {
				return true;
			}
		}
		return true;
	}
	
	/**
	 * Retrieves a production type by it's pixel notation.
	 * 
	 * @param pixelNotation The pixel notation.
	 * 
	 * @return The production type.
	 */
	public static ProductionType getByPixelNotation(String pixelNotation) {
		if (!pixelNotation.endsWith("p")) {
			pixelNotation += "p";
		}
		pixelNotation.replace(" ", "");
		
		for (ProductionType pt : ProductionType.values()) {
			if (pt.getPixelNotation().equals(pixelNotation)) {
				return pt;
			}
		}
		return null;
	}
	
	/**
	 * Retrieves the production type for a given resolution.
	 * 
	 * @param width The width.
	 * 
	 * @param height The height.
	 * 
	 * @return The production type.
	 */
	public static ProductionType getByResolution(int width, int height, boolean closest) {
		ProductionType pt = null;
		
		for (ProductionType o : values()) {
			if (o.getWidth() == width && o.getHeight() == height) {
				return o;
			}
			if (!closest) {
				continue;
			}
			if (pt == null) {
				pt = o;
				continue;
			}
			int currWidthDiff = Math.abs(pt.getWidth() - width);
			int currHeightDiff = Math.abs(pt.getHeight() - height);
			
			int newWidthDiff = Math.abs(pt.getWidth() - width);
			int newHeightDiff = Math.abs(pt.getHeight() - height);
			
			if ((currWidthDiff + currHeightDiff) >= (newWidthDiff + newHeightDiff)) {
				pt = o;
			}
		}
		System.out.println("Dimensions[" + width + ":" + height + "] Closest[" + pt.getWidth() + ":" + pt.getHeight() + " (" + pt.getName() + ")]");
		return pt;
	}

}
