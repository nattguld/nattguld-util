package com.nattguld.util.chrono;

import java.util.concurrent.TimeUnit;

/**
 * 
 * @author randqm
 *
 */

public class Stopwatch {
	
	/**
	 * The start time.
	 */
	private final long start;
	
	/**
	 * The current time.
	 */
	private long current;
	
	/**
	 * Whether the stopwatch is running or not.
	 */
	private boolean running;
	
	
	/**
	 * Creates a new stop watch.
	 */
	public Stopwatch() {
		this(System.currentTimeMillis());
	}
	
	/**
	 * Creates a new stop watch.
	 * 
	 * @param start The start time.
	 */
	public Stopwatch(long start) {
		this.start = start;
		this.current = System.currentTimeMillis();
		this.running = true;
	}
	
	/**
	 * Retrieves the start time.
	 * 
	 * @return The start time.
	 */
	public long getStart() {
		return start;
	}
	
	/**
	 * Retrieves the current time.
	 * 
	 * @return The current time.
	 */
	public long getCurrent() {
		if (isRunning()) {
			this.current = System.currentTimeMillis();
		}
		return current;
	}
	
	/**
	 * Retrieves the elapsed time.
	 * 
	 * @return The elapsed time.
	 */
	public long getElapsed() {
		return getStart() - getCurrent();
	}
	
	/**
	 * Retrieves the elapsed time converted to a given time unit.
	 * 
	 * @param unit The unit.
	 * 
	 * @return The converted time.
	 */
	public long getElapsed(TimeUnit unit) {
		return unit.convert(getElapsed(), TimeUnit.MILLISECONDS);
	}
	
	/**
	 * Stops the stop watch from running.
	 */
	public void stop() {
		setRunning(false);
	}
	
	/**
	 * Resumes the stop watch from running.
	 */
	public void resume() {
		setRunning(true);
	}
	
	/**
	 * Modifies whether the stop watch is running or not.
	 * 
	 * @param running The new state.
	 */
	private void setRunning(boolean running) {
		this.running = running;
	}
	
	/**
	 * Retrieves whether the stop watch is running or not.
	 * 
	 * @return The result.
	 */
	public boolean isRunning() {
		return running;
	}
	
	@Override
	public String toString() {
		return "Elapsed: " + getElapsed() + "ms";
	}

}
