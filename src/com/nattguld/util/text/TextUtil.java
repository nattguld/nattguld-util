package com.nattguld.util.text;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.nattguld.util.maths.Maths;

/**
 * 
 * @author randqm
 *
 */

public class TextUtil {
	
	/**
	 * Represents a tab character.
	 */
	public static final String TAB = "\t";
	
	/**
	 * Represents a backspace character.
	 */
	public static final String BACKSPACE = "\b";
	
	/**
	 * Represents a new line character.
	 */
	public static final String NEW_LINE = "\n";
	
	/**
	 * Represents an enter (carriage return) character.
	 */
	public static final String ENTER = "\r";
	
	/**
	 * Represents a formfeed character.
	 */
	public static final String FORMFEED = "\f";
	
	/**
	 * Represents a single quote character.
	 */
	public static final String SINLGE_QUOTE = "\'";
	
	/**
	 * Represents a double quote character.
	 */
	public static final String DOUBLE_QUOTE = "\"";
	
	/**
	 * Represents a backslash character.
	 */
	public static final String BACKSLASH = "\\";
	
	/**
	 * Represents a new enter line character.
	 */
	public static final String NEW_ENTER_LINE = "\r\n";
	
	
	/**
	 * Retrieves a string avoiding it to be null.
	 * 
	 * @param input The input.
	 * 
	 * @return The String.
	 */
	public static String getAsNonNull(String input) {
		return Objects.isNull(input) ? "" : input;
	}
	
	/**
	 * Extracts any digits from a given input string.
	 * 
	 * @param input The input.
	 * 
	 * @return The digits.
	 */
	public static String extractDigits(String input) {
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(input);
		StringBuilder digits = new StringBuilder();
		
		while (m.find()) {
			digits.append(m.group());
		}
		return digits.toString();
	}
	
	/**
	 * Copies an input string to the clipboard.
	 * 
	 * @param input The input.
	 */
	public static void copyToClipboard(String input) {
		StringSelection stringSelection = new StringSelection(input);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
	}
	
	/**
     * Returns a string with a capital first letter.
     * 
     * @param input The input string.
     * 
     * @return The capitalized string.
     */
    public static String capitalize(String input) {
    	String prepared = input.toLowerCase();
    	return prepared.substring(0, 1).toUpperCase() + prepared.substring(1);
    }
    
    /**
     * Retrieves a string with parts capitalized defined by a delimeter.
     * 
     * @param input The input string.
     * 
     * @param delimeter The delimeter.
     * 
     * @return The capitalized string.
     */
    public static String capitalize(String input, String delimeter) {
    	String[] parts = input.split(delimeter);
    	StringBuilder sb = new StringBuilder();
	
    	for (int i = 0; i < parts.length; i ++) {
    		sb.append(capitalize(parts[i]));
	    
    		if (i < (parts.length - 1)) {
    			sb.append(delimeter);
    		}
    	}
    	return sb.toString();
    }
    
    /**
     * Generates a random string.
     * 
     * @param minSize The minimum string size.
     * 
     * @param maxSize The maximum string size.
     * 
     * @param seeds The generator seeds.
     * 
     * @return The generated string.
     */
    public static String randomString(int minSize, int maxSize, TextSeed... seeds) {
    	if (seeds == null || seeds.length == 0) {
    		System.err.println("Invalid string generator arguments.");
    		return null;
    	}
    	List<String> characters = new LinkedList<>();
    	final int size = minSize + (maxSize == minSize ? 0 : Maths.random(maxSize - minSize));
	
    	while (characters.size() < size) {
    		String[] chars = seeds[Maths.random(seeds.length)].getCharacters();
	    
    		if (characters.size() >= (size - seeds.length)) {
    			int seedIndex = size - characters.size();
    			TextSeed seed = seeds[seedIndex - 1];
    			boolean missingSeed = true;
		
    			for (String s : seed.getCharacters()) {
    				if (characters.contains(s)) {
    					missingSeed = false;
    					break;
    				}
    			}
    			if (missingSeed) {
    				chars = seed.getCharacters();
    			}
    		}
    		characters.add(chars[Maths.random(chars.length)]);
    	}
    	StringBuilder sb = new StringBuilder();
	
    	for (String s : characters) {
    		sb.append(s);
    	}
    	return sb.toString();
    }
	
	/**
	 * Generates a random password.
	 * 
	 * @return The random password.
	 */
	public static String generatePassword() {
		return randomString(8, 16, TextSeed.DIGITS, TextSeed.LOWERCASE, TextSeed.UPPERCASE);
	}
	
    /**
     * Generates a complex password.
     * 
     * @return The password.
     */
    public static String generateComplexPassword() {
    	return randomString(8, 16, TextSeed.DIGITS, TextSeed.LOWERCASE, TextSeed.UPPERCASE, TextSeed.SYMBOLS);
    }
    
    /**
     * Retrieves a random generated number.
     * 
     * @return The random number.
     */
    public static String generateRandomNumber() {
    	return generateRandomNumber(20, 25);
    }
    
    /**
     * Retrieves a random generated number.
     * 
     * @param minSize The minimum size.
     * 
     * @param maxSize The maximum size.
     * 
     * @return The random number.
     */
    public static String generateRandomNumber(int minSize, int maxSize) {
    	return TextUtil.randomString(minSize, maxSize, TextSeed.DIGITS);
    }
    
    /**
     * Retrieves a random fake email.
     * 
     * @return The fake email.
     */
    public static String generateFakeEmail() {
    	return generateFakeEmail("@gmail.com");
    }
    
    /**
     * Retrieves a random fake email.
     * 
     * @param domain The domain.
     * 
     * @return The fake email.
     */
    public static String generateFakeEmail(String domain) {
    	if (!domain.startsWith("@")) {
    		domain = "@" + domain;
    	}
    	return TextUtil.randomString(8, 16, TextSeed.LOWERCASE) + Maths.random(999) + domain;
    }
	
    /**
     * Generates a string with spintax.
     * 
     * @param input The input string.
     * 
     * @return The spintax string.
     */
    public static String spintax(String input) {
    	if (input.isEmpty()) {
    		return input;
    	}
    	if (!input.contains("{") && !input.contains("}")) {
    		return input;
    	}
        String regex = "\\{[^{}]*\\}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        Random rnd = new Random();
        
        while (matcher.find()) {
            String parts = input.substring(matcher.start() + 1, matcher.end() - 1);
            String[] subParts = parts.split("\\|", -1);
            input = input.substring(0, matcher.start()) + subParts[rnd.nextInt(subParts.length)].toString() 
        	    + input.substring(matcher.start() + matcher.group().length());
            matcher = pattern.matcher(input);
        }
        return input;
    }
    
	/**
	 * Retrieves whether an input string exists out of only letters or not.
	 * 
	 * @param input The input.
	 * 
	 * @return The result.
	 */
	public static boolean isLetters(String input) {
		for (char c : input.toCharArray()) {
			if (!Character.isLetter(c)) {
				return false;
			}
 		}
		return true;
	}
	
	/**
	 * Retrieves whether an input string exists out of only digits or not.
	 * 
	 * @param input The input.
	 * 
	 * @return The result.
	 */
	public static boolean isdigits(String input) {
		for (char c : input.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
 		}
		return true;
	}

}
