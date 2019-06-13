package com.nattguld.util.audio;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.nattguld.util.Misc;

/**
 * 
 * @author randqm
 *
 */

public class Audio implements LineListener {
	
	/**
	 * The audio file.
	 */
	private final URL audioFile;
	
	/**
	 * The current audio state.
	 */
    private AudioState state;
    
    
    /**
     * Creates a new audio.
     * 
     * @param audioFilePath The audio file path.
     * 
     * @throws MalformedURLException 
     */
    public Audio(File audioFile) throws MalformedURLException {
    	this(audioFile.getAbsolutePath());
    }
    
    /**
     * Creates a new audio.
     * 
     * @param audioFilePath The audio file path.
     * 
     * @throws MalformedURLException 
     */
    public Audio(String audioFilePath) throws MalformedURLException {
    	this(new URL(audioFilePath));
    }
    
    /**
     * Creates a new audio.
     * 
     * @param audioFile The audio file.
     */
    public Audio(URL audioFile) {
    	this.audioFile = audioFile;
    	this.state = AudioState.IDLE;
    }
    
    /**
     * Plays the audio.
     */
    public void play() {
        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            AudioFormat format = audioStream.getFormat();
            
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            
            try (Clip audioClip = (Clip) AudioSystem.getLine(info)) {
            	audioClip.addLineListener(this);
            	audioClip.open(audioStream);
            	audioClip.start();
            	
            	while (getState() != AudioState.FINISHED) {
            		Misc.sleep(500);
            	}
            	if (getState() == AudioState.INTERRUPT) {
            		audioClip.stop();
            	}
            }
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("The specified audio file is not supported.");
            ex.printStackTrace();
            
        } catch (LineUnavailableException ex) {
            System.out.println("Audio line for playing back is unavailable.");
            ex.printStackTrace();
            
        } catch (IOException ex) {
            System.out.println("Error playing the audio file.");
            ex.printStackTrace();
        }
         
    }
     
    @Override
    public void update(LineEvent event) {
        LineEvent.Type type = event.getType();
        
        if (type == LineEvent.Type.START/* || type == LineEvent.Type.OPEN*/) {
        	setState(AudioState.PLAYING);
             
        } else if (type == LineEvent.Type.STOP || type == LineEvent.Type.CLOSE) {
            setState(AudioState.FINISHED);
        }
    }
    
    /**
     * Modifies the audio state.
     * 
     * @param state The new state.
     */
    public void setState(AudioState state) {
    	this.state = state;
    }
    
    /**
     * Retrieves the audio state.
     * 
     * @return The audio state.
     */
    public AudioState getState() {
    	return state;
    }

}
