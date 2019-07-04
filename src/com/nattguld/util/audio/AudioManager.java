package com.nattguld.util.audio;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 
 * @author randqm
 *
 */

public class AudioManager {
	
	/**
	 * The audio deque.
	 */
	private static Deque<Audio> audioDeque = new ArrayDeque<>();
	
	/**
	 * Whether audio is disabled or not.
	 */
	private static boolean disabled;
	
	
	/**
	 * Submits new audio.
	 * 
	 * @param audio The audio.
	 */
	public static void submit(Audio audio) {
		audioDeque.add(audio);
		
		updateDeque();
	}
	
	/**
	 * Updates the audio deque.
	 */
	private static void updateDeque() {
		if (audioDeque.isEmpty()) {
			return;
		}
		final Audio current = audioDeque.poll();
		
		if (disabled) {
			return;
		}
		new Thread(new Runnable() {
			@Override
			public void run() {
				current.play();
				updateDeque();
			}
		}).start();
	}
	
	/**
	 * Enables audio.
	 */
	public static void enable() {
		disabled = false;
	}
	
	/**
	 * Disables audio.
	 */
	public static void disable() {
		disabled = true;
	}
	
	/**
	 * Retrieves whether audio is disabled or not.
	 * 
	 * @return The result.
	 */
	public static boolean isDisabled() {
		return disabled;
	}

}
