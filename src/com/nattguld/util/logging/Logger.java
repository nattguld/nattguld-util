package com.nattguld.util.logging;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.nattguld.util.chrono.DateTimeUtil;
import com.nattguld.util.files.FileOperations;

/**
 * 
 * @author randqm
 *
 */

public class Logger {
	
	/**
	 * The base directory.
	 */
	private static String baseDir = "./";
	
	/**
	 * Whether to debug or not.
	 */
	private static boolean debug;
	
	/**
	 * The name of the logger source.
	 */
	private final String sourceName;

	
	/**
	 * Creates a new logger.
	 * 
	 * @param sourceName The source name.
	 */
	public Logger(String sourceName) {
		this.sourceName = sourceName;
	}
	
	/**
	 * Prints an info message.
	 * 
	 * @param message The message.
	 */
	public void info(String message) {
		System.out.println("[INFO][" + DateTimeUtil.getCurrentTime() + "][" + sourceName + "]: " + message);
	}
	
	/**
	 * Prints a debug message.
	 * 
	 * @param message The message.
	 */
	public void debug(String message) {
		if (debug) {
			System.out.println("[DEBUG][" + DateTimeUtil.getCurrentTime() + "][" + sourceName + "]: " + message);
		}
	}
	
	/**
	 * Prints a warning message.
	 * 
	 * @param message The message.
	 */
	public void warning(String message) {
		String print = "[" + sourceName + "]: " + message;
		
		System.out.println("[WARNING][" + DateTimeUtil.getCurrentTime() + "]: " + print);
		
		FileOperations.write(baseDir + "/debug/warning_log.txt", "[" + DateTimeUtil.getCurrentDateTime() + "]" + print, true);
	}
	
	/**
	 * Prints an error message.
	 * 
	 * @param message The message.
	 */
	public void error(String message) {
		String print = "[" + sourceName + "]: " + message;
		
		System.err.println("[ERROR][" + DateTimeUtil.getCurrentTime() + "]: " + print);
		
		FileOperations.write(baseDir + "/debug/error_log.txt", "[" + DateTimeUtil.getCurrentDateTime() + "]" + print, true);
	}
	
	/**
	 * Prints an exception.
	 * 
	 * @param ex The exception.
	 */
	public void exception(Exception ex) {
		if (debug) {
			ex.printStackTrace();
		}
		try (PrintWriter pw = new PrintWriter(new File(baseDir + "/debug/exceptions/" + FileOperations.getSafeFileName(DateTimeUtil.getCurrentDateTime()) + ".txt"))) {
		    ex.printStackTrace(pw);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Dumps string content into a debug file.
	 * 
	 * @param fileName The file name.
	 * 
	 * @param content The content.
	 */
	public void dump(String fileName, String content) {
		FileOperations.write(baseDir + "/debug/dumps/" + fileName, content, false);
	}
	
	/**
	 * Retrieves a logger instance.
	 * 
	 * @param name The logger name.
	 * 
	 * @return The logger instance.
	 */
	public static Logger getLogger(String name) {
		return new Logger(name);
	}
	
	/**
	 * Modifies the base directory.
	 * 
	 * @param path The path.
	 */
	public static void setBaseDir(String path) {
		baseDir = path;
		
		File dir = new File(baseDir + "/debug/");
		
		if (!dir.exists()) {
			dir.mkdir();
		}
		dir = new File(baseDir + "/debug/exceptions/");
		
		if (!dir.exists()) {
			dir.mkdir();
		}
		dir = new File(baseDir + "/debug/dumps/");
		
		if (!dir.exists()) {
			dir.mkdir();
		}
	}
	
	/**
	 * Retrieves the base dir.
	 * 
	 * @return The base dir.
	 */
	public static String getBaseDir() {
		return baseDir;
	}
	
	/**
	 * Modifies whethet debugging should be done or no.
	 * 
	 * @param debugging The new state.
	 */
	public static void setDebugging(boolean debugging) {
		debug = debugging;
	}
	
}
