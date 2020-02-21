package com.nattguld.util.media.edit.impl;

import java.awt.AlphaComposite;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;

import com.nattguld.util.media.MediaOperations;
import com.nattguld.util.media.edit.ImageEditOperation;

/**
 * 
 * @author randqm
 *
 */

public class ImageResize extends ImageEditOperation {
	
	/**
	 * The target dimension.
	 */
	private final Dimension targetDimension;
	
	/**
	 * Whether to keep the aspect ratio or not.
	 */
	private final boolean keepAspectRatio;
	
	
	/**
	 * Creates a new image resize.
	 * 
	 * @param in The input image file.
	 * 
	 * @param out The output image file.
	 * 
	 * @param width The requested width.
	 * 
	 * @param height The requested height.
	 * 
	 * @param aspectRatio Whether to keep the aspect ratio or not.
	 */
	public ImageResize(File in, File out, int width, int height, boolean keepAspectRatio) {
		this(in, out, new Dimension(width, height), keepAspectRatio);
	}
	
	/**
	 * Creates a new image resize.
	 * 
	 * @param in The input image file.
	 * 
	 * @param out The output image file.
	 * 
	 * @param targetDimension The target dimension.
	 * 
	 * @param aspectRatio Whether to keep the aspect ratio or not.
	 */
	public ImageResize(File in, File out, Dimension targetDimension, boolean keepAspectRatio) {
		super(in, out);
		
		this.targetDimension = targetDimension;
		this.keepAspectRatio = keepAspectRatio;
	}

	@Override
	protected BufferedImage edit(BufferedImage bIn, Dimension originalDim, int channelType) throws Exception {
		if (originalDim.getHeight() == targetDimension.getHeight() && originalDim.getWidth() == targetDimension.getWidth()) {
			return bIn;
		}
		Dimension resizedDim = keepAspectRatio ? MediaOperations.getScaledDimension(originalDim, targetDimension) : targetDimension;
		
		BufferedImage resizedImg = new BufferedImage((int)resizedDim.getWidth(), (int)resizedDim.getHeight(), channelType);
		
		Graphics2D g = resizedImg.createGraphics();
		g.setComposite(AlphaComposite.Src);
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g.drawImage(bIn, 0, 0, (int)(resizedDim.getWidth()), (int)(resizedDim.getHeight()), null);
		g.dispose();
		
		/*
		 * BufferedImage image = ImageIO.read(original);
			
			Image tmp = image.getScaledInstance(x, y, Image.SCALE_SMOOTH);
			BufferedImage resized = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g2d = resized.createGraphics();
			g2d.drawImage(tmp, 0, 0, null);
			g2d.dispose();
			
			ImageIO.write(resized, FileOperations.getExtension(original), output);
			
			return output;
		 */
		
		return resizedImg;
	}

}
