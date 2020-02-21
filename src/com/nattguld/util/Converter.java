package com.nattguld.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.Formatter;

import javax.imageio.ImageIO;

import com.nattguld.util.files.FileOperations;
import com.nattguld.util.maths.Maths;

/**
 * 
 * @author randqm
 *
 */

public class Converter {
	
	
	/**
	 * Converts an image file to base64.
	 * 
	 * @param img The image.
	 * 
	 * @return The base64 string.
	 */
	public static String toBase64(File img) {
		try {
			try (ByteArrayOutputStream output = new ByteArrayOutputStream()) {
				BufferedImage bm = ImageIO.read(img);
				ImageIO.write(bm, FileOperations.getExtension(img), output);
				String base64Image = Base64.getEncoder().encodeToString(output.toByteArray());
				return base64Image;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
	
    /**
     * Converts a byte array to a hex.
     * 
     * @param bytes The butes.
     * 
     * @return The hex.
     */
    public static String bytesToHex(byte[] bytes) {
    	/*StringBuilder sb = new StringBuilder();
    	
    	for (byte b : bytes) {
    		sb.append(Integer.toString(b, 16));
        }
    	return sb.toString();*/
    	try (Formatter formatter = new Formatter()) {
    		for (byte b : bytes) {
    			formatter.format("%02x", b);
    		}
    		String result = formatter.toString();
    		return result.toUpperCase();
    	}
    }
    
    /**
     * Converts a byte array to a hex string.
     * 
     * @param bytes The butes.
     * 
     * @return The hex string.
     */
    public static String bytesToHexString(byte[] bytes) {
    	StringBuilder sb = new StringBuilder();
    	
    	for (byte b : bytes) {
    		sb.append(Integer.toString(b, 16));
        }
    	return sb.toString();
    }
    
    /**
     * Formats text that is representing an integer into it's representative number.
     * This method differs from standard parsing methods as it takes care of punctuation and symbols.
     * 
     * @param text The text.
     * 
     * @return The integer.
     */
    public static int formatIntegerText(String text) {
    	return formatNumberText(text).intValue();
    }
    
    /**
     * Formats text that is representing a number into it's representative number.
     * This method differs from standard parsing methods as it takes care of punctuation and symbols.
     * 
     * @param text The text.
     * 
     * @return The number.
     */
    public static Number formatNumberText(String text) {
    	String simplify = text.trim().toLowerCase();
    	
    	if (simplify == null || simplify.isEmpty()) {
    		return 0;
    	}
    	String[] parts = simplify.split(" ");
    	
    	for (String part : parts) {
    		if (part.endsWith("k") || part.endsWith("m") || part.endsWith("b")
    				|| part.contains(".") || part.contains(",")) {
    			simplify = part.trim();
    			break;
    		}
    	}
    	int multiplier = 1;

    	if (simplify.contains("k") || simplify.contains("m") || simplify.contains("b")) {
    		if (simplify.contains("k")) {
    			simplify = simplify.replace("k", "");
    			multiplier = 1000;
			
    		} else if (simplify.contains("m")) {
    			simplify = simplify.replace("m", "");
    			multiplier = 1000000;
			
    		}  else if (simplify.contains("b")) {
    			simplify = simplify.replace("b", "");
    			multiplier = 1000000000;
    		}
    	}
		if (simplify.contains(",")) {
			simplify = simplify.replace(",", "");
		}
		parts = simplify.split(" ");
		
		for (String part : parts) {
    		if (!Maths.isInteger(part) && !Maths.isDouble(part)) {
    			continue;
    		}
    		simplify = part.trim();
    		break;
    	}
		return (simplify.contains(".") ? Double.parseDouble(simplify) : Integer.parseInt(simplify)) * multiplier;
    }

}
