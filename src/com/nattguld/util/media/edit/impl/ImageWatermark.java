package com.nattguld.util.media.edit.impl;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.nattguld.util.ScreenPosition;
import com.nattguld.util.media.edit.WatermarkOperation;

/**
 * 
 * @author randqm
 *
 */

public class ImageWatermark extends WatermarkOperation {
	
	/**
	 * The watermark image.
	 */
	private final File watermarkImage;
	
	
	/**
	 * Creates a new image edit task.
	 * 
	 * @param in The input file.
	 * 
	 * @param out The output file.
	 * 
	 * @param watermarkImage The watermark image.
	 */
	public ImageWatermark(File in, File out, File watermarkImage) {
		super(in, out, ScreenPosition.CENTER);
		
		this.watermarkImage = watermarkImage;
	}

	@Override
	protected BufferedImage watermark(BufferedImage bIn, int channelType, ScreenPosition wmPos) throws Exception {
		BufferedImage bWmImg = ImageIO.read(watermarkImage);

		BufferedImage watermarked = new BufferedImage(bIn.getWidth(), bIn.getHeight(), channelType);
		
		Graphics2D w = (Graphics2D) watermarked.getGraphics();
		w.drawImage(bIn, 0, 0, null);
        AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.4f);
        w.setComposite(alphaChannel);

        // calculates the coordinate where the String is painted
        int centerX = bIn.getWidth() / 2;
        int centerY = bIn.getHeight() / 2; //TODO

        // add image watermark to the image
        w.drawImage(bWmImg, centerX, centerY, null);
        w.dispose();
        
		return watermarked;
	}

}
