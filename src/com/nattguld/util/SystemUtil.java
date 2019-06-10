package com.nattguld.util;

/**
 * 
 * @author randqm
 *
 */

public class SystemUtil {
	
	
	/**
	 * Retrieves the default home directory.
	 * 
	 * @return The home directory.
	 */
	public static String getHomeDir() {
		return System.getProperty("user.home");
	}
	
	/**
	 * Retrieves the version of the java JRE being ran.
	 * 
	 * @return The java JRE version.
	 */
	public static String getJavaVersion() {
		return System.getProperty("java.version");
	}
	
	/**
	 * Retrieves the operating system name.
	 * 
	 * @return The operating system name.
	 */
	public static String getOS() {
		return System.getProperty("os.name").toLowerCase();
	}
	
	/**
	 * Retrieves whether the OS is windows based or not.
	 * 
	 * @return The result.
	 */
	public static boolean isWindows() {
		return getOS().contains("win");
	}
	
	/**
	 * Retrieves whether the OS is osx based or not.
	 * 
	 * @return The result.
	 */
	public static boolean isOSX() {
		return getOS().contains("osx");
	}
	
	/**
	 * Retrieves whether the OS is aix based or not.
	 * 
	 * @return The result.
	 */
	public static boolean isAIX() {
		return getOS().contains("aix");
	}
	
	/**
	 * Retrieves whether the OS is unix based or not.
	 * 
	 * @return The result.
	 */
	public static boolean isUnix() {
		return getOS().contains("nix");
	}
	
	/**
	 * Retrieves whether the OS is linux based or not.
	 * 
	 * @return The result.
	 */
	public static boolean isLinux() {
		return !isWindows() && !isOSX() && !isAIX() && !isUnix();
	}
	
	/**
	 * Retrieves the amount of CPU cores available.
	 * 
	 * @return The cores.
	 */
	public static int getCPUCores() {
		return Runtime.getRuntime().availableProcessors();
	}
	
	/**
	 * Retrieves the maximum amount of RAM.
	 * 
	 * @return The maximum RAM.
	 */
	public static long getMaxRAM() {
		return Runtime.getRuntime().maxMemory();
	}
	
	/**
	 * Retrieves the amount of available RAM.
	 * 
	 * @return The available RAM.
	 */
	public static long getAvailableRAM() {
		return Runtime.getRuntime().freeMemory();
	}
	
	/**
	 * Retrieves the amount of RAM in use.
	 * 
	 * @return The amount of RAM in use.
	 */
	public static long getUsedRAM() {
		return Runtime.getRuntime().totalMemory();
	}

}
