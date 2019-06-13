package com.nattguld.util.media.edit;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.nattguld.util.files.FileOperations;
import com.nattguld.util.func.Operation;

/**
 * 
 * @author randqm
 *
 */

public abstract class ImageEditOperation extends Operation<File> {
	
	/**
	 * The input file.
	 */
	private final File in;
	
	/**
	 * The output file.
	 */
	private final File out;
	
	
	/**
	 * Creates a new edit operation.
	 * 
	 * @param in The input file.
	 * 
	 * @param out The output file.
	 */
	public ImageEditOperation(File in, File out) {
		this.in = in;
		this.out = out;
	}
	
	/**
	 * Attempts to edit the image.
	 * 
	 * @param bIn The buffered image.
	 * 
	 * @param originalDim The original dimensions.
	 * 
	 * @param channelType The channel type.
	 * 
	 * @return The modified image.
	 * 
	 * @throws Exception
	 */
	protected abstract BufferedImage edit(BufferedImage bIn, Dimension originalDim, int channelType) throws Exception;

	@Override
	public File performOperation() {
		try {
			BufferedImage bInputImg = ImageIO.read(in);
			
			Dimension originalDim = new Dimension(bInputImg.getWidth(), bInputImg.getHeight());
			//Dimension targetDim = calculate(originalDim);
			String extension = FileOperations.getExtension(in).toLowerCase();
			int channelType = extension.equals("png") ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB; //See http://tika.apache.org/ for safely getting the right channel

			BufferedImage modifiedImage = edit(bInputImg, originalDim, channelType);
			
			ImageIO.write(modifiedImage, extension, out);
			
			return out;
			
		} catch (Exception ex) {
			ex.printStackTrace();
			return in;
		}
	}
	
	/**
	 * Retrieves the input file.
	 * 
	 * @return The input file.
	 */
	protected File getInputFile() {
		return in;
	}

}
