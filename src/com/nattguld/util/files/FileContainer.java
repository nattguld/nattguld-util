package com.nattguld.util.files;

import java.io.File;
import java.util.Objects;

import com.nattguld.util.generics.Container;

/**
 * 
 * @author randqm
 *
 */

public class FileContainer extends Container<File> {
	
	
	/**
	 * Creates a new empty file container.
	 */
	public FileContainer() {
		this(null);
	}
	
	/**
	 * Creates a new file container.
	 * 
	 * @param path The path to the directory.
	 */
	public FileContainer(String dirPath) {
		load(dirPath);
	}
	
	/**
	 * Loads the container.
	 * 
	 * @param dirPath The directory path.
	 */
	protected void load(String dirPath) {
		if (Objects.isNull(dirPath)) {
			return;
		}
		File dir = new File(dirPath);
		
		if (!dir.exists()) {
			System.err.println(dirPath + " does not exist");
			return;
		}
		if (!dir.isDirectory()) {
			add(dir);
			return;
		}
		File[] files = dir.listFiles();
		
		if (Objects.isNull(files) || files.length <= 0) {
			System.err.println("No files found in " + dirPath);
			return;
		}
		for (File f : files) {
			if (!f.isDirectory()) {
				add(f);
			}
		}
	}
	
	@Override
	public File next() {
		return super.next();
	}
	
	@Override
	public FileContainer copy() {
		return (FileContainer)super.copy();
	}
 
}
