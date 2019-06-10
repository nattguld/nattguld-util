package com.nattguld.util;

import java.io.IOException;
import java.util.Calendar;
import java.util.Random;

/**
 * 
 * @author randqm
 *
 */

public class Misc {
    
    
	/**
	 * Attempts to open a link with the default browser.
	 * 
	 * @param url The url to open.
	 */
    public static void openLink(String url) {
    	String os = System.getProperty("os.name").toLowerCase();
	
    	try {
    		if (os.indexOf("win") >= 0) {
    			Runtime rt = Runtime.getRuntime();
    			rt.exec( "rundll32 url.dll,FileProtocolHandler " + url);
    		} else if (os.indexOf("mac") >= 0) {
    			Runtime rt = Runtime.getRuntime();
    			rt.exec( "open" + url);
    		} else {
    			Runtime rt = Runtime.getRuntime();
    			String[] browsers = {"epiphany", "firefox", "mozilla", "konqueror",
	                                     "netscape", "opera", "links", "lynx", "vivaldi"
	                                     , "chromium", "chrome"};

    			StringBuffer cmd = new StringBuffer();
	    
    			for (int i = 0; i < browsers.length; i ++) {
    				cmd.append( (i==0  ? "" : " || " ) + browsers[i] +" \"" + url + "\" ");
    			}
    			rt.exec(new String[] { "sh", "-c", cmd.toString() });
    		}
    	} catch (IOException ex) {
			ex.printStackTrace();
			System.err.println("Exception occurred while opening link");
		}
    }
    
    /**
     * Makes the current thread sleep.
     * 
     * @param ms The time in milliseconds to sleep.
     */
    public static void sleep(long ms) {
    	try {
    		Thread.sleep(ms);
    		
    	} catch (InterruptedException ex) {
			//ex.printStackTrace();
    		//System.err.println("Exception occurred while trying to sleep");
    	}
    }
    
    /**
     * Retrieves a random birth year.
     * 
     * @return The birth year.
     */
    public static String generateBirthYear(int minAge, int maxAge) {
    	int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    	int year = currentYear - (minAge + (maxAge - minAge));
    	return Integer.toString(year);
    }
    
	/**
	 * Retrieves a random MAc address.
	 * 
	 * @return The mac address.
	 */
	public static String randomMACAddress() {
	    Random rand = new Random();
	    byte[] macAddr = new byte[6];
	    
	    rand.nextBytes(macAddr);
	    macAddr[0] = (byte)(macAddr[0] & (byte)254);  //zeroing last 2 bytes to make it unicast and locally adminstrated

	    StringBuilder sb = new StringBuilder(18);
	    
	    for (byte b : macAddr) {
	        if (sb.length() > 0) {
	        	sb.append(":");
	        }
	        sb.append(String.format("%02x", b));
	    }
	    return sb.toString().toUpperCase();
	}

}
