package com.nattguld.util.media.edit;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;

import com.nattguld.util.ScreenPosition;

/**
 * 
 * @author randqm
 *
 */

public abstract class WatermarkOperation extends ImageEditOperation {
	
	/**
	 * The prefered watermark position.
	 */
	private final ScreenPosition wmPos;
	
	
	public WatermarkOperation(File in, File out, ScreenPosition wmPos) {
		super(in, out);
		
		this.wmPos = wmPos;
	}
	
	/**
	 * Watermarks an image.
	 * 
	 * @param bIn The input image.
	 * 
	 * @param channelType The channel type.
	 * 
	 * @param wmPos The watermark position.
	 * 
	 * @return The watermarked image.
	 * 
	 * @throws Exception
	 */
	protected abstract BufferedImage watermark(BufferedImage bIn, int channelType, ScreenPosition wmPos) throws Exception;
	
	@Override
	protected BufferedImage edit(BufferedImage bIn, Dimension originalDim, int channelType) throws Exception {
		return watermark(bIn, channelType, wmPos);
	}

}
