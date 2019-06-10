package com.nattguld.util.media;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.nattguld.util.files.FileOperations;

/**
 * 
 * @author randqm
 *
 */

public class MediaOperations {
	
	
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
	 * Resizes an image and writes it to a given file.
	 * 
	 * @param original The original file.
	 * 
	 * @param output The output file.
	 * 
	 * @param x The x coordinate.
	 * 
	 * @param y The y coordinate.
	 * 
	 * @return The output file.
	 */
	public static File resizeImage(File original, File output, int x, int y) {
		try {
			BufferedImage image = ImageIO.read(original);
			
			Image tmp = image.getScaledInstance(x, y, Image.SCALE_SMOOTH);
			BufferedImage resized = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g2d = resized.createGraphics();
			g2d.drawImage(tmp, 0, 0, null);
			g2d.dispose();
			
			ImageIO.write(resized, FileOperations.getExtension(original), output);
			
			return output;
		
		} catch (Exception ex) {
			ex.printStackTrace();
			System.err.println("Exception occurred while resizing " + original.getName());
			return original;
		}
	}

}
