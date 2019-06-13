package com.nattguld.util.media;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import com.nattguld.util.files.FileOperations;

/**
 * 
 * @author randqm
 *
 */

public class MediaOperations {

	
	/**
	 * Retrieves the font from a file.
	 * 
	 * @param fontFile The font file.
	 * 
	 * @param fontSize The font size.
	 */
	public static Font loadFontFromFile(File fontFile, int fontSize) {
		try {
			InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream(fontFile.getAbsolutePath());
			Font font = Font.createFont(Font.TRUETYPE_FONT, stream).deriveFont(fontSize);
			return font;
			
		} catch (FontFormatException ex) {
			ex.printStackTrace();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.err.println("Failed to load font, using default font.");
		return new Font(Font.SANS_SERIF, Font.PLAIN, fontSize);
	}
	
    /**
     * Converts a png file to jpg.
     * 
     * @param f The file to convert.
     */
	public static File pngToJpg(File f) {
		try {
			//read image file
			BufferedImage bufferedImage = ImageIO.read(new File(f.getAbsolutePath()));

			// create a blank, RGB, same width and height, and a white background
			BufferedImage newBufferedImage = new BufferedImage(bufferedImage.getWidth(),
					bufferedImage.getHeight(), BufferedImage.TYPE_INT_RGB);
			newBufferedImage.createGraphics().drawImage(bufferedImage, 0, 0, Color.WHITE, null);

			// write to jpeg file
			ImageIO.write(newBufferedImage, "jpg", new File(f.getAbsolutePath()));
			
			String ext = FileOperations.getExtension(f);
			String pathWithoutExtension = f.getAbsolutePath().substring(0, f.getAbsolutePath().indexOf(ext));

			return new File(pathWithoutExtension + ".jpg");

		} catch (IOException ex) {
			ex.printStackTrace();
			System.err.println("Exception occurred while converting " + f.getName() + " from png to jpg");
			return null;
		}
	}
	
	/**
	 * Retrieves the scaled dimension for a given width and height.
	 * 
	 * @param originalWidth The original width.
	 * 
	 * @param originalHeight The original height.
	 * 
	 * @return The scaled dimension.
	 */
	public static Dimension getScaledDimension(Dimension original, Dimension targetDimension) {
		Dimension scaledDimension = new Dimension((int)targetDimension.getWidth(), (int)targetDimension.getHeight());

		final double originalRatio = original.getWidth() / original.getHeight();
		final double targetRatio = targetDimension.getWidth() / targetDimension.getHeight();
		
		if (originalRatio < targetRatio) {
			int newWidth = (int)Math.round(targetDimension.getWidth());
			int newHeight = (int)Math.round((targetDimension.getWidth() / original.getWidth()) * original.getHeight());
			scaledDimension = new Dimension(newWidth, newHeight);
		} else {
			int newWidth = (int)Math.round((targetDimension.getHeight() / original.getHeight()) * original.getWidth());
			int newHeight = (int)Math.round(targetDimension.getHeight());
			scaledDimension = new Dimension(newWidth, newHeight);
		}
		return scaledDimension;
	}
	
	/**
	 * Retrieves the cropped dimension for a given dimension to fit the aspect ratio.
	 * 
	 * @param original The original dimension.
	 * 
	 * @param aspectRatio The target aspect ratio.
	 * 
	 * @return The cropped dimension to fit the aspect ratio.
	 */
	public static Dimension getCroppedDimension(Dimension original, AspectRatio aspectRatio) {
		Dimension croppedDimension = new Dimension((int)original.getWidth(), (int)original.getHeight());

		final double originalRatio = original.getWidth() / original.getHeight();

		if (originalRatio < aspectRatio.getRatio()) {
			int newWidth = (int)Math.round(original.getWidth());
			int newHeight = (int)Math.round(original.getWidth() / aspectRatio.getRatio());
			croppedDimension = new Dimension(newWidth, newHeight);
		} else {
			int newWidth = (int)Math.round(original.getHeight() * aspectRatio.getRatio());
			int newHeight = (int)Math.round(original.getHeight());
			croppedDimension = new Dimension(newWidth, newHeight);
		}
		return croppedDimension;
	}

}
