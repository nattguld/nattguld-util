package com.nattguld.util.text;

/**
 * 
 * @author randqm
 *
 */

public enum Delimiter {
	
	ANGLE_BRACKET_OPEN("<"),
	ANGLE_BRACKET_CLOSE(">"),
	APOSTROPHE("'"),
	ASTERISK("*"),
	BACKSLASH("\\"),
	SLASH("/"),
	BRACKET_OPEN("("),
	BRACKET_CLOSE(")"),
	COLON(":"),
	SEMI_COLOR(";"),
	CURLY_BRACKET_OPEN("{"),
	CURLY_RACKET_CLOSE("}"),
	MINUS("-"),
	QUOTATION_MARK("\""),
	EXCLAMATION_MARK("!"),
	PERIOD("."),
	QUESTION_MARK("?"),
	SQUARE_BRACKET_OPEN("["),
	SQUARE_BRACKET_CLOSE("]"),
	UNDERSCORE("_"),
	HASHTAG("#"),
	AT("@"),
	CARET("^"),
	TIDLE("~"),
	PLUS("+"),
	EQUAL("="),
	PIPE("|"), 
	SPACE(" ");
	
	
	/**
	 * The character.
	 */
	private final String character;
	
	
	/**
	 * Creates a new delimeter.
	 * 
	 * @param character The character.
	 */
	private Delimiter(String character) {
		this.character = character;
	}
	
	/**
	 * Retrieves the character.
	 * 
	 * @return The character.
	 */
	public String getCharacter() {
		return character;
	}
	
	@Override
	public String toString() {
		return getCharacter();
	}
	
}
