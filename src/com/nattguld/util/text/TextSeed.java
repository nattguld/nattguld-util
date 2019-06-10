package com.nattguld.util.text;

/**
 * 
 * @author randqm
 *
 */

public enum TextSeed {
	
    /**
     * The available lower case characters.
     */
    LOWERCASE(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"
    		, "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}),
    
    /**
     * The available uppercase characters.
     */
    UPPERCASE(new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I"
    		, "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}),
    
    /**
     * The available symbol characters.
     */
    SYMBOLS(new String[]{"*", "$", "%", "-", "+", "(", ")", "{", "}", "_", ";", "=", "!", "&"}),
    
    /**
     * The available digit characters.
     */
    DIGITS(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
	
	
    /**
     * The available characters.
     */
    private final String[] characters;
    
    
    /**
     * Creates a new text seed.
     * 
     * @param characters The available characters.
     */
    private TextSeed(String[] characters) {
    	this.characters = characters;
    }
    
    
    /**
     * Retrieves the available characters.
     * 
     * @return The characters.
     */
    public String[] getCharacters() {
    	return characters;
    }

}
