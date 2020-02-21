package com.nattguld.util.hashing;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import com.nattguld.util.Converter;
import com.nattguld.util.maths.Maths;

/**
 * 
 * @author randqm
 *
 */

public class Hasher {
	
	
	/**
	 * Retrieves a random MD5 hash cut to a given length.
	 * 
	 * @param length The length.
	 * 
	 * @return The hash.
	 */
	public static String randomMD5(int length) {
		if (length > 32) {
			System.err.println("Length can't be greater than 32");
			return randomMD5(32);
		}
		String hash = Hasher.md5(Maths.getUniqueId());
		return hash.substring(0, length);
	}
	
	/**
	 * Retrieves a base64 encoded hash.
	 * 
	 * @param input The input.
	 * 
	 * @return The hash.
	 */
	public static String base64(String input) {
		try {
			return base64(input.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Retrieves a base64 encoded hash.
	 * 
	 * @param input The input.
	 * 
	 * @return The hash.
	 */
	public static String base64(File input) {
		try {
			return base64(Files.readAllBytes(input.toPath()));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Retrieves a base64 encoded hash.
	 * 
	 * @param input The input.
	 * 
	 * @return The hash.
	 */
	public static String base64(byte[] input) {
		return Base64.getEncoder().encodeToString(input);
	}
	
	/**
	 * Retrieves an md5 hash.
	 * 
	 * @param input The input.
	 * 
	 * @return The hash.
	 */
	public static String sha256(File input) {
		try {
			return sha256(Files.readAllBytes(input.toPath()));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Retrieves an md5 hash.
	 * 
	 * @param input The input.
	 * 
	 * @return The hash.
	 */
	public static String sha256(String input) {
		try {
			return sha256(input.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Retrieves an md5 hash.
	 * 
	 * @param input The input.
	 * 
	 * @return The hash.
	 */
	public static String sha256(byte[] input) {
		return hash(input, "SHA-256");
	}
	
	/**
	 * Retrieves a sha1 hash.
	 * 
	 * @param input The input.
	 * 
	 * @return The hash.
	 */
	public static String sha1(File input) {
		try {
			return sha1(Files.readAllBytes(input.toPath()));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Retrieves an sha1 hash.
	 * 
	 * @param input The input.
	 * 
	 * @return The hash.
	 */
	public static String sha1(String input) {
		try {
			return sha1(input.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Retrieves an sha1 hash.
	 * 
	 * @param input The input.
	 * 
	 * @return The hash.
	 */
	public static String sha1(byte[] input) {
		return hash(input, "SHA-1");
	}
	
	/**
	 * Retrieves an md5 hash.
	 * 
	 * @param input The input.
	 * 
	 * @return The hash.
	 */
	public static String sha512(File input) {
		try {
			return sha512(Files.readAllBytes(input.toPath()));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Retrieves an md5 hash.
	 * 
	 * @param input The input.
	 * 
	 * @return The hash.
	 */
	public static String sha512(String input) {
		try {
			return sha512(input.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Retrieves an md5 hash.
	 * 
	 * @param input The input.
	 * 
	 * @return The hash.
	 */
	public static String sha512(byte[] input) {
		return hash(input, "SHA-512");
	}
	
	/**
	 * Retrieves an md5 hash.
	 * 
	 * @param input The input.
	 * 
	 * @return The hash.
	 */
	public static String md5(File input) {
		try {
			return md5(Files.readAllBytes(input.toPath()));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Retrieves an md5 hash.
	 * 
	 * @param input The input.
	 * 
	 * @return The hash.
	 */
	public static String md5(String input) {
		try {
			return md5(input.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Retrieves an md5 hash.
	 * 
	 * @param input The input.
	 * 
	 * @return The hash.
	 */
	public static String md5(byte[] input) {
		return hash(input, "MD5");
	}
	
	/**
	 * Hashes a given input with a given algorithm.
	 * 
	 * @param input The input.
	 * 
	 * @param algorithm The algorithm.
	 * 
	 * @return The hex notation of the hashed bytes.
	 */
	public static String hash(byte[] input, String algorithm) {
		return Converter.bytesToHex(bytesHash(input, algorithm));
	}
	
	/**
	 * Hashes a given input with a given algorithm.
	 * 
	 * @param input The input.
	 * 
	 * @param algorithm The algorithm.
	 * 
	 * @return The hashed bytes.
	 */
	public static byte[] bytesHash(byte[] input, String algorithm) {
		try {
	        return MessageDigest.getInstance(algorithm).digest(input);
			
		} catch (NoSuchAlgorithmException ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
