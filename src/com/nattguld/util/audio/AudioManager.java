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
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				current.play();
				updateDeque();
			}
		}).start();
	}

}
