package com.nattguld.util.media.edit.impl;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;

import com.nattguld.util.ScreenPosition;
import com.nattguld.util.media.edit.WatermarkOperation;

/**
 * 
 * @author randqm
 *
 */

public class TextWatermark extends WatermarkOperation {
	
	/**
	 * The font to use.
	 */
	private final Font font;
	
	/**
	 * The font size.
	 */
	private final float fontSize;
	
	/**
	 * The transparency.
	 */
	private final int transparency;
	
	/**
	 * The color.
	 */
	private final Color color;
	
	/**
	 * The watermark text.
	 */
	private final String text;
	
	
	/**
	 * Creates a new image edit task.
	 * 
	 * @param in The input file.
	 * 
	 * @param out The output file.
	 * 
	 * @param wmPos The watermark position.
	 * 
	 * @param font The font for the text.
	 * 
	 * @param fontSize The font size.
	 * 
	 * @param transparency The text transparency.
	 * 
	 * @param color The color.
	 * 
	 * @param text The watermark text.
	 */
	public TextWatermark(File in, File out, ScreenPosition wmPos, Font font, float fontSize, int transparency
			, Color color, String text) {
		super(in, out, wmPos);
		
		this.font = font;
		this.fontSize = fontSize;
		this.transparency = transparency;
		this.color = color;
		this.text = text;
	}

	@Override
	protected BufferedImage watermark(BufferedImage bIn, int channelType, ScreenPosition wmPos) throws Exception {
		BufferedImage watermarked = new BufferedImage(bIn.getWidth(), bIn.getHeight(), channelType);
		
		Graphics2D w = (Graphics2D) watermarked.getGraphics();
        w.drawImage(bIn, 0, 0, null);
        AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, (float)((float)transparency / (float)100));
        w.setComposite(alphaChannel);
        w.setColor(color);
        w.setFont(font.deriveFont(fontSize));
        FontMetrics fontMetrics = w.getFontMetrics();
        Rectangle2D rect = fontMetrics.getStringBounds(text, w);
		
        // calculate center of the image
        int centerX = (bIn.getWidth() - (int) rect.getWidth()) / 2;
        int centerY = (bIn.getHeight() - (int) rect.getHeight()) / 2; //TODO

        // add text overlay to the image
        w.drawString(text, centerX, centerY);
        w.dispose();
        
        return watermarked;
	}

}
