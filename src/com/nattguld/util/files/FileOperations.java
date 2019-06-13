package com.nattguld.util.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import com.nattguld.util.maths.Maths;

/**
 * 
 * @author randqm
 *
 */

public class FileOperations {
	
	
	/**
	 * Retrieves a safe file name notation.
	 * 
	 * @param fileName The file name.
	 * 
	 * @return The safe file name notation.
	 */
	public static String getSafeFileName(String fileName) {
		return fileName.replace(" ", "_").toLowerCase();
	}
	
	/**
	 * Retrieves the extension of a file.
	 * 
	 * @param f The file.
	 * 
	 * @return The extension.
	 */
	public static String getExtension(File f) {
		String extension = "";

		int i = f.getName().lastIndexOf('.');
		
		if (i > 0) {
		    extension = f.getName().substring(i + 1).toLowerCase();
		}
		return extension;
	}
	
	/**
     * Adds some random bytes to a file to make it unique and returns the modified file.
     * 
     * @param input The file to modify.
     * 
     * @param output The output file.
     * 
     * @return The modified file.
     */
    public static File addRandomBytes(File input, File output) {
    	byte[] dataBytes = new byte[1024];
    	int nread = 0;
	
    	try (FileOutputStream out = new FileOutputStream(output)) {
    		try (FileInputStream fis = new FileInputStream(input)) {
    			while ((nread = fis.read(dataBytes)) != -1) {
    				out.write(dataBytes, 0, nread);
    			};
    		}
    		out.write(Maths.random(999999));
    		
    		return output;
    		
    	} catch (Exception ex) {
    		ex.printStackTrace();
    		System.err.println("Exception occurred while adding random bytes to " + input.getName());
    		return input;
    	}
    }
	
	/**
	 * Moves a file.
	 * 
	 * @param original The original path.
	 * 
	 * @param target The target path.
	 * 
	 * @return The moved file.
	 */
	public static File move(String original, String target) {
		return move(new File(original), new File(target));
	}
	
	/**
	 * Moves a file.
	 * 
	 * @param original The original file.
	 * 
	 * @param target The target file.
	 * 
	 * @return The moved file.
	 */
	public static File move(File original, File target) {
		if (!original.exists()) {
			System.err.println(original.getName() + " doesn't exist");
			return null;
		}
		try {
			Files.move(original.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
			
			return target;
			
		} catch (IOException ex) {
			ex.printStackTrace();
			System.err.println("Exception occurred while moving " + original.getName());
			
			return original;
		}
	}
	
	/**
	 * Copies a file.
	 * 
	 * @param sourcePath The source path.
	 * 
	 * @param targetPath The target path.
	 * 
	 * @return The copied file.
	 */
    public static File copy(String sourcePath, String targetPath) {
    	return copy(new File(sourcePath), new File(targetPath));
    }
    
    /**
     * Copies a file.
     *  
     * @param original The original file.
     * 
     * @param target The copied file.
     * 
     * @return The copied file.
     */
    public static File copy(File original, File target) {
    	if (!original.exists()) {
    		System.err.println(original.getName() + " doesn't exist");
    		return null;
    	}
    	 try {
 			Files.copy(original.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
 			
 			return target;
 			
 		} catch (IOException ex) {
 			ex.printStackTrace();
 			System.err.println("Exception occurred while copying " + original.getName());
 			
 			return original;
 		}
    }
    
    /**
     * Retrieves the content of a file.
     * 
     * @param path The path of the file.
     * 
     * @return The content.
     */
    public static String getContent(String path) {
    	File f = new File(path);
    	
    	if (!f.exists()) {
    		return "";
    	}
    	StringBuilder sb = new StringBuilder();
    	String line = null;
    	
    	try (BufferedReader br = new BufferedReader(new FileReader(f))) {
    		while ((line = br.readLine()) != null) {
    			if (line != null) {
    				sb.append(line);
    			}
    		}
    	} catch (IOException ex) {
    		ex.printStackTrace();
    		System.err.println("Failed to read " + path);
    	}
    	return sb.toString();
    }
	
    /**
     * Reads a file line by line and returns a list with the lines.
     * 
     * @param fileName The name of the file to read.
     * 
     * @return The list with lines retrieves from the file.
     */
    public static List<String> read(String path) {
    	LinkedList<String> lines = new LinkedList<>();
    	File f = new File(path);
    	
    	if (!f.exists()) {
    		return lines;
    	}
    	try (FileInputStream fis = new FileInputStream(f)) {
    		try (InputStreamReader isr = new InputStreamReader(fis, "UTF-8")) {
    			try (BufferedReader br = new BufferedReader(isr)) {
    				String line = null;
    				
    				while ((line = br.readLine()) != null) {
    					String strip = line.trim();
    	       		
    					if (!strip.isEmpty()) {
    						lines.add(strip);
    					}
    	    		}
    			}
    		}
    	} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}/*
    	String line = null;

    	try (BufferedReader br = new BufferedReader(new FileReader(f))) {
    		while ((line = br.readLine()) != null) {
    			if (line != null) {
    				String strip = line.trim();
   		
    				if (!strip.isEmpty()) {
    					lines.add(strip);
    				}
    			}
    		}
    	} catch (IOException ex) {
    		ex.printStackTrace();
    		System.err.println("Failed to read " + path);
    	}*/
    	return lines;
    }
    
	/**
     * Writes a file.
     * 
     * @param path The path for the file.
     * 
     * @param line The line to write.
     * 
     * @param append Whether to append the line or not.
     */
    public static void write(String path, String line, boolean append) {
    	write(path, new String[]{line}, append);
    }
    
    /**
     * Writes a file.
     * 
     * @param path The path for the file.
     * 
     * @param lines The lines to write.
     * 
     * @param append Whether to append the line or not.
     */
	public static void write(String path, List<String> lines, boolean append) {
		write(path, lines.toArray(new String[lines.size()]), append);
	}
    
    /**
     * Writes a file.
     * 
     * @param path The path for the file.
     * 
     * @param lines The lines to append to the file.
     * 
     * @param append Whether the lines should be appended to a file or not.
     */
    public static void write(String path, String[] lines, boolean append) {
    	try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(path, append), StandardCharsets.UTF_8)) {
    		for (String line : lines) {
    			writer.write(line);
    			writer.write(System.lineSeparator());
    		}
    	} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}/*
    	try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, append))) {
    		for (String line : lines) {
    			bw.write(line);
    			bw.newLine();
    		}
    	} catch (IOException ex) {
    		ex.printStackTrace();
    		System.err.println("Failed to write to " + path);
    	}*/
    }
	
	/**
     * Attempts to delete all files in a directory.
     * 
     * @param dir The directory.
     */
    public static void deleteAllFiles(File dir) {
    	deleteAllFiles(dir, true);
    }
    
    /**
     * Attempts to delete all files in a directory.
     * 
     * @param dir The directory.
     * 
     * @param includeFolders Whether to include folders or not.
     */
    public static void deleteAllFiles(File dir, boolean includeFolders) {
    	for (File f : getFileTree(dir, true)) {
    		f.delete();
    	}
    	if (includeFolders) {
    		for (File f : getFileTree(dir)) {
    			f.delete();
    		}
    	}
    }
    
    /**
     * Lists the files in a given directory.
     * 
     * @param dir The directory.
     * 
     * @return The files.
     */
    public static Collection<File> getFileTree(File dir) {
        return getFileTree(dir, false);
    }
    
    /**
     * Lists the files in a given directory.
     * 
     * @param dir The directory.
     * 
     * @param ignoreFolders Whether to ignore folders or not.
     * 
     * @return The files.
     */
    public static List<File> getFileTree(File dir, boolean ignoreFolders) {
    	List<File> files = new ArrayList<>();
    	
    	if (Objects.isNull(dir)) {
    		return files;
    	}
    	File[] dirFiles = dir.listFiles();
    	
    	if (Objects.isNull(dirFiles) || dirFiles.length <= 0) {
    		return files;
    	}
    	for (File f : dirFiles) {
    		if (f.isDirectory()) {
    			files.addAll(getFileTree(dir, ignoreFolders));
    			
    			if (ignoreFolders) {
        			continue;
        		}
    		}
    		files.add(f);
    	}
    	return files;
    }

}
