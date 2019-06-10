package com.nattguld.util.files;

import java.io.File;

import com.nattguld.util.files.FileOperations;

/**
 * 
 * @author randqm
 *
 */

public enum MimeType {
	
	AAC("audio/aac", ".aac"),
	AVI("video/x-msvideo", ".avi"),
	BINARY("application/octet-stream", ".bin"),
	BMP("image/bmp", ".bmp"),
	BZIP("application/x-bzip", ".bz"),
	BZIP2("application/x-bzip2", ".bz2"),
	CSS("text/css", ".css"),
	CSV("text/csv", ".csv"),
	GIF("image/gif", ".gif"),
	HTML("text/html", ".html"),
	ICO("image/x-icon", ".ico"),
	JAR("application/java-archive", ".jar"),
	JPG("image/jpeg", ".jpg"),
	JPEG("image/jpeg", ".jpeg"),
	JS("text/javascript", ".js"),
	JSON("application/json", ".json"),
	MP3("audio/mpeg", ".mp3"),
	MPEG("video/mpeg", ".mpeg"),
	OGA("audio/ogg", ".oga"),
	OGV("video/ogg", ".ogv"),
	OGG("video/ogg", ".ogg"),
	PNG("image/png", ".png"),
	PDF("application/pdf", ".pdf"),
	RAR("application/x-rar-compressed", ".rar"),
	RTF("application/rtf", ".rtf"),
	SVG("image/svg+xml", ".svg"),
	SWF("application/x-shockwave-flash", ".swf"),
	TAR("application/x-tar", ".tar"),
	TIF("image/tiff", ".tif"),
	TIFF("image/tiff", ".tiff"),
	TXT("text/plain", ".txt"),
	WAV("audio/wav", ".wav"),
	WEBA("audio/webm", ".weba"),
	WEBM("video/webm", ".webm"),
	WEBP("image/webp", ".webp"),
	XML("application/xml", ".xml"),
	ZIP("application/zip", ".zip"),
	MP4("video/mp4", ".mp4"),
	MOV("video/quicktime", ".mov");
	
	
	/**
	 * The name of the mime type.
	 */
	private final String name;
	
	/**
	 * The file extension associated with the mime type.
	 */
	private final String fileExtension;
	
	
	/**
	 * Creates a new mime type.
	 * 
	 * @param name The name.
	 * 
	 * @param fileExtension The file extension.
	 */
	private MimeType(String name, String fileExtension) {
		this.name = name;
		this.fileExtension = fileExtension;
	}
	
	/**
	 * Retrieves the name.
	 * 
	 * @return The name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Retrieves the file extension.
	 * 
	 * @return The file extension.
	 */
	public String getFileExtension() {
		return fileExtension;
	}
	
	/**
	 * Retrieves if the content type is for image files.
	 * 
	 * @return The result.
	 */
	public boolean isImage() {
		return this == BMP || this == GIF || this == ICO || this == JPG || this == JPEG 
				|| this == PNG || this == TIF || this == TIFF || this == WEBP;
	}
	
	/**
	 * Retrieves if the content type is for video files.
	 * 
	 * @return The result.
	 */
	public boolean isVideo() {
		return this == AVI || this == MPEG || this == OGV || this == OGG 
				|| this == WEBM || this == MP4 || this == MOV;
	}
	
	/**
	 * Retrieves if the content type is for text-based files.
	 * 
	 * @return The result.
	 */
	public boolean isText() {
		return this == CSS || this == CSV || this == HTML || this == JS 
				|| this == JSON || this == SVG || this == TXT || this == XML;
	}
	
	/**
	 * Retrieves if the content type is for audio files.
	 * 
	 * @return The result.
	 */
	public boolean isAudio() {
		return this == AAC || this == MP3 || this == OGA || this == WAV || this == WEBA;
	}
	
	@Override
	public String toString() {
		return getName() + " (" + getFileExtension() + ")";
	}
	
	/**
	 * Retrieves the mime type for a file.
	 * 
	 * @param file The file.
	 * 
	 * @return The mime type.
	 */
	public static MimeType getByFile(File file) {
		return getByFileExtension(FileOperations.getExtension(file));
	}
	
	/**
	 * Retrieves a mime type by it's file extension.
	 * 
	 * @param fileExtension The file extension.
	 * 
	 * @return The mime type.
	 */
	public static MimeType getByFileExtension(String fileExtension) {
		for (MimeType mt : values()) {
			if (mt.getFileExtension().equalsIgnoreCase(fileExtension)
					|| mt.getFileExtension().equalsIgnoreCase("." + fileExtension)) {
				return mt;
			}
		}
		System.err.println("Failed to find mime type for file extension: " + fileExtension);
		return null;
	}
	
	/**
	 * Retrieves a mime type by it's name.
	 * 
	 * @param name The name.
	 * 
	 * @return The mime type.
	 */
	public static MimeType getByName(String name) {
		String formatName = name.toLowerCase();
		
		for (MimeType mt : values()) {
			if (mt.getName().equalsIgnoreCase(formatName)) {
				return mt;
			}
		}
		System.err.println("Failed to find mime type for name: " + name);
		return null;
	}

}
