package com.nattguld.util.hashing;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Objects;

/**
 * 
 * @author randqm
 *
 */

public class Base64Hasher {
	
	
	/**
	 * Retrieves the md5 hash of a file.
	 * 
	 * @param f The file.
	 * 
	 * @return The hash.
	 */
	public static String md5(File f) {
		return hash(f, "MD5");
	}
	
	/**
	 * Retrieves the md5 hash of a string.
	 * 
	 * @param input The string.
	 * 
	 * @return The hash.
	 */
	public static String md5(String input) {
		return hash(input, "MD5");
	}
	
	/**
	 * Retrieves the sha512 hash of a file.
	 * 
	 * @param f The file.
	 * 
	 * @return The hash.
	 */
	public static String sha512(File f) {
		return hash(f, "SHA-512");
	}
	
	/**
	 * Retrieves the sha512 hash of a string.
	 * 
	 * @param input The string.
	 * 
	 * @return The hash.
	 */
	public static String sha512(String input) {
		return hash(input, "SHA-512");
	}
	
	/**
	 * Retrieves the sha256 hash of a file.
	 * 
	 * @param f The file.
	 * 
	 * @return The hash.
	 */
	public static String sha256(File f) {
		return hash(f, "SHA-256");
	}
	
	/**
	 * Retrieves the sha256 hash of a string.
	 * 
	 * @param input The string.
	 * 
	 * @return The hash.
	 */
	public static String sha256(String input) {
		return hash(input, "SHA-256");
	}
	
	/**
	 * Retrieves the hash of a file.
	 * 
	 * @param f The file.
	 * 
	 * @param algorithm The algorithm.
	 * 
	 * @return The hash.
	 */
	public static String hash(File f, String algorithm) {
		if (Objects.isNull(f) || !f.exists()) {
			return f.getName() + " doesn't exist";
		}
		try {
			return hash(Files.readAllBytes(f.toPath()), algorithm);
			
		} catch (IOException ex) {
			ex.printStackTrace();
			return "Failed to read file bytes";
		}
	}
	
	/**
	 * Retrieves the hash of a string.
	 * 
	 * @param input The string.
	 * 
	 * @param algorithm The algorithm.
	 * 
	 * @return The hash.
	 */
	public static String hash(String input, String algorithm) {
		try {
			return hash(input.getBytes("UTF-8"), algorithm);
			
		} catch (UnsupportedEncodingException ex) {
			ex.printStackTrace();
			return "Unsupported encoding";
		}
	}
	
	/**
	 * Hashes given bytes with a given algorithm.
	 * 
	 * @param bytes The bytes.
	 * 
	 * @param algorithm The algorithm.
	 * 
	 * @return The hashed string.
	 */
	public static String hash(byte[] bytes, String algorithm) {
		try {
			byte[] hash = MessageDigest.getInstance(algorithm).digest(bytes);
			
			return Base64.getEncoder().encodeToString(hash);
			
		} catch (NoSuchAlgorithmException ex) {
			return "No such algorythm";
		}
	}

}
