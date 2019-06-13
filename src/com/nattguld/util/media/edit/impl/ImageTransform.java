package com.nattguld.util.media.edit.impl;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import com.nattguld.util.media.AspectRatio;
import com.nattguld.util.media.MediaOperations;
import com.nattguld.util.media.edit.ImageEditOperation;

/**
 * 
 * @author randqm
 *
 */

public class ImageTransform extends ImageEditOperation {
	
	/**
	 * The prefered aspect ratio.
	 */
	private final AspectRatio aspectRatio;
	

	/**
	 * Creates a new image edit task.
	 * 
	 * @param in The input file.
	 * 
	 * @param out The output file.
	 * 
	 * @param aspectRatio The prefered aspect ratio.
	 */
	public ImageTransform(File in, File out, AspectRatio aspectRatio) {
		super(in, out);
		
		this.aspectRatio = aspectRatio;
	}
	
	@Override
	protected BufferedImage edit(BufferedImage bIn, Dimension originalDim, int channelType) throws Exception {
		Dimension croppedDim = MediaOperations.getCroppedDimension(originalDim, aspectRatio);
		
		int offsetX = 0;
		int offsetY = 0;
		
		if (originalDim.getWidth() != croppedDim.getWidth()) {
			double diff = getPositiveDifference(originalDim.getWidth(), croppedDim.getWidth());
			offsetX = (int)Math.floor(diff / 2);
		}
		if (originalDim.getHeight() != croppedDim.getHeight()) {
			double diff = getPositiveDifference(originalDim.getHeight(), croppedDim.getHeight());
			offsetY = (int)Math.floor(diff / 2);
		}
		BufferedImage zoom = bIn.getSubimage(offsetX, offsetY, (int)croppedDim.getWidth(), (int)croppedDim.getHeight());
		BufferedImage extractZoom = new BufferedImage(zoom.getWidth(), zoom.getHeight(), channelType);
		
		Graphics g = extractZoom.createGraphics();
		g.drawImage(zoom, 0, 0, null);
		g.dispose();
		
		return extractZoom;
	}

	/**
	 * Retrieves the positive difference between 2 values.
	 * 
	 * @param value1 The first value.
	 * 
	 * @param value2 The second value.
	 * 
	 * @return The positive difference.
	 */
	private static double getPositiveDifference(double value1, double value2) {
		return value1 > value2 ? (value1 - value2) : (value2 - value1);
	}
	
}
