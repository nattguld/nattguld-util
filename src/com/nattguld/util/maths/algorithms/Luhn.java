package com.nattguld.util.maths.algorithms;

/**
 * 
 * @author randqm
 *
 */

public class Luhn {
	
	
	/**
	 * Genetes a checksum digit using the luhn algorithm for a given number.
	 * 
	 * @param number The number.
	 * 
	 * @return The checksum digit.
	 */
	public static int generateChecksumDigit(String number) {
		char sum = 0;
        boolean alt = true;
        char[] digits = number.toCharArray();
        
        for (int i = digits.length - 1; i >= 0; i--) {
            int curDigit = (digits[i] - 48);
            
            if (alt) {
            	curDigit *= 2;
            	
            	if (curDigit > 9) {
                    curDigit -= 9;
            	}
            }
            sum += curDigit;
            alt = !alt;
        }
        if ((sum % 10) == 0) {
            return 0;
        }
        return (10 - (sum % 10));
	}
	
	/**
	 * Retrieves whether a number has a valid luhn checksum digit.
	 * 
	 * @param number The number.
	 * 
	 * @return The result.
	 */
	public static boolean isValid(String number) {
		 int sum = 0;
         boolean alternate = false;
         
         for (int i = number.length() - 1; i >= 0; i--) {
        	 int n = Integer.parseInt(number.substring(i, i + 1));
        	 
        	 if (alternate) {
        		 n *= 2;
        		 
        		 if (n > 9) {
        			 n = (n % 10) + 1;
        		 }
        	 }
        	 sum += n;
        	 alternate = !alternate;
         }
         return (sum % 10 == 0);
	}

}
