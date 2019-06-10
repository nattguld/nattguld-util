package com.nattguld.util.text;

/**
 * 
 * @author randqm
 *
 */

public class HTMLUtil {
	
	/**
	 * Represents a new space character.
	 */
	public static final String SPACE = "&nbsp;";
	
	/**
	 * Represents a new line character.
	 */
	public static final String NEW_LINE = "<br>";
	

	/**
	 * Retrieves text as html.
	 * 
	 * @param input The input text.
	 * 
	 * @return The html text.
	 */
	public static String html(String input) {
		return "<html>" + input + "</html>";
	}
	
	/**
	 * Retrieves text wrapper in custom tags.
	 * 
	 * @param input The input text.
	 * 
	 * @param tag The tag.
	 * 
	 * @return The html text.
	 */
	public static String customTags(String input, String tag) {
		return "<" + tag + ">" + input + "</" + tag + ">";
	}
	
	/**
	 * Retrieves underlined html text.
	 * 
	 * @param input The input text.
	 * 
	 * @return The html text.
	 */
	public static String bold(String input) {
		return "<b>" + input + "</b>";
	}
	
	/**
	 * Retrieves underlined html text.
	 * 
	 * @param input The input text.
	 * 
	 * @return The html text.
	 */
	public static String italics(String input) {
		return "<i>" + input + "</i>";
	}
	
	/**
	 * Retrieves underlined html text.
	 * 
	 * @param input The input text.
	 * 
	 * @return The html text.
	 */
	public static String underlined(String input) {
		return "<u>" + input + "</u>";
	}
	
	/**
	 * Retrieves colored html text.
	 * 
	 * @param input The input text.
	 * 
	 * @param color The color.
	 * 
	 * @return The html text.
	 */
	public static String colored(String input, String color) {
		return "<font color=" + color + ">" + input + "</font>";
	}

}
