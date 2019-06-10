package com.nattguld.util.chrono;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

/**
 * 
 * @author randqm
 *
 */

public class DateTime {
	
	/**
	 * The local date time instance.
	 */
	private final LocalDateTime ldt;
	
	/**
	 * The zoned date time.
	 */
	private final ZonedDateTime zdt;
	
	
	/**
	 * Creates a new default date time instance.
	 */
	public DateTime() {
		this(System.currentTimeMillis(), 0);
	}
	
	/**
	 * Creates a date time off set with a given offset.
	 * 
	 * @param offset The offset.
	 */
	public DateTime(int offset) {
		this(System.currentTimeMillis(), offset);
	}
	
	/**
	 * Creates a new date time instance with a given time and offset.
	 * 
	 * @param ms The time.
	 * 
	 * @param offset The offset.
	 */
	public DateTime(long ms, int offset) {
		this(ms, TimeZone.getTimeZone(DateTimeUtil.formatTimeOffset(offset)).toZoneId());
	}
	
	/**
	 * Creates a new date time instance with a given time.
	 * 
	 * @param ms The time.
	 */
	public DateTime(long ms) {
		this(ms, ZoneId.systemDefault());
	}
	
	/**
	 * Creates a new date time instance with a given time and zone id.
	 * 
	 * @param ms The time.
	 * 
	 * @param zoneId The zone id.
	 */
	public DateTime(long ms, ZoneId zoneId) {
		this(LocalDateTime.ofInstant(Instant.ofEpochMilli(ms), zoneId), zoneId);
	}
	
	/**
	 * Creates a new date time instance.
	 * 
	 * @param localDateTime The local date time.
	 */
	public DateTime(LocalDateTime localDateTime) {
		this(localDateTime, ZoneId.systemDefault());
	}
	
	/**
	 * Creates a new date time instance.
	 * 
	 * @param localDateTime The local date time.
	 * 
	 * @param zoneId The zone id.
	 */
	public DateTime(LocalDateTime localDateTime, ZoneId zoneId) {
		this(localDateTime, localDateTime.atZone(zoneId));
	}
	
	/**
	 * Creates a new date time instance.
	 * 
	 * @param localDateTime The local date time.
	 * 
	 * @param zdt The zoned date time.
	 */
	protected DateTime(LocalDateTime localDateTime, ZonedDateTime zdt) {
		this.ldt = localDateTime;
		this.zdt = zdt;
	}
	
	/**
	 * Creates a new date time from a given input and pattern.
	 * 
	 * @param input The input.
	 * 
	 * @param pattern The pattern. (yyyy-MM-dd HH:mm:ss:sss)
	 */
	public DateTime(String input, String pattern) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		this.ldt = pattern.contains("HH:mm:ss") ? LocalDateTime.parse(input, formatter) : LocalDate.parse(input, formatter).atStartOfDay();
		this.zdt = ldt.atZone(ZoneId.systemDefault());
	}
	
	/**
	 * Retrieves the local date time instance.
	 * 
	 * @return The local date time.
	 */
	public LocalDateTime getLocalDateTime() {
		return ldt;
	}
	
	/**
	 * Retrieves the zoned date time.
	 * 
	 * @return The zoned date time.
	 */
	public ZonedDateTime getZonedDateTime() {
		return zdt;
	}
	
	/**
	 * Retrieves the formatted string of a pattern.
	 * 
	 * @param pattern The pattern.
	 * 
	 * @return The formatted string.
	 */
	public String format(String pattern) { //(yyyy-MM-dd HH:mm:ss:sss)
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		return getLocalDateTime().format(formatter);
	}
	
	/**
	 * Retrieves whether the date time is before an other given date time.
	 * 
	 * @param dt The date time.
	 * 
	 * @return The result.
	 */
	public boolean isBefore(DateTime dt) {
		return getLocalDateTime().isBefore(dt.getLocalDateTime());
	}
	
	/**
	 * Retrieves whether the date time is after an other given date time.
	 * 
	 * @param dt The date time.
	 * 
	 * @return The result.
	 */
	public boolean isAfter(DateTime dt) {
		return getLocalDateTime().isAfter(dt.getLocalDateTime());
	}
	
	/**
	 * Retrieves whether the date time is between 2 given date times.
	 * 
	 * @param from The date time to start from.
	 * 
	 * @param to The date time to end at.
	 * 
	 * @return The result.
	 */
	public boolean isBetween(DateTime from, DateTime to) {
		return getLocalDateTime().isAfter(from.getLocalDateTime()) 
				&& getLocalDateTime().isBefore(to.getLocalDateTime());
	}
	
	/**
	 * Retrieves whether the date time is in range of 2 given date times.
	 * 
	 * @param from The date time to start from.
	 * 
	 * @param to The date time to end at.
	 * 
	 * @return The result.
	 */
	public boolean isInRange(DateTime from, DateTime to) {
		return getLocalDateTime().isAfter(from.getLocalDateTime().minusDays(1)) 
				&& getLocalDateTime().isBefore(to.getLocalDateTime().plusDays(1));
	}
	
	/**
	 * Retrieves the milliseconds.
	 * 
	 * @return The milliseconds.
	 */
	public long getMilliSeconds() {
		return getZonedDateTime().toInstant().toEpochMilli();
	}
	
	/**
	 * Retrieves the unix milliseconds.
	 * 
	 * @return The unix milliseconds.
	 */
	public long getUnixMilliSeconds() {
		return (getMilliSeconds() + (1 * 60 * 60 * 1000)) / 1000;
	}
	
	/**
	 * Retrieves the second.
	 * 
	 * @return The second.
	 */
	public int getSecond() {
		return getLocalDateTime().getSecond();
	}
	
	/**
	 * Retrieves the minute.
	 * 
	 * @return The minute.
	 */
	public int getMinute() {
		return getLocalDateTime().getMinute();
	}
	
	/**
	 * Retrieves the hour.
	 * 
	 * @return The hour.
	 */
	public int getHour() {
		return getLocalDateTime().getHour();
	}
	
	/**
	 * Retrieves the day.
	 * 
	 * @return The day.
	 */
	public int getDay() {
		return getLocalDateTime().getDayOfMonth();
	}
	
	/**
	 * Retrieves the month.
	 * 
	 * @return The month.
	 */
	public int getMonth() {
		return getLocalDateTime().getMonthValue();
	}
	
	/**
	 * Retrieves the year.
	 * 
	 * @return The year.
	 */
	public int getYear() {
		return getLocalDateTime().getYear();
	}
	
	/**
	 * Retrieves the period till today including today.
	 * 
	 * @return The period.
	 */
	public Period getPeriodTillToday() {
		return Period.between(getLocalDateTime().toLocalDate(), new DateTime().getLocalDateTime().plusDays(1).toLocalDate());
	}
	
	/**
	 * Retrieves whether the date time is the same day as a given date time.
	 * 
	 * @param dt The date time.
	 * 
	 * @return The result.
	 */
	public boolean isSameDay(DateTime dt) {
		return getLocalDateTime().toLocalDate().equals(dt.getLocalDateTime().toLocalDate());
	}
	
	/**
	 * Retrieves whether the date time is today or not.
	 * 
	 * @return The result.
	 */
	public boolean isToday() {
		return isSameDay(new DateTime());
	}
	
	/**
	 * Retrieves the string notation of the date/time.
	 * 
	 * @return The string notation.
	 */
	public String getAsString() {
		return getAsString(true);
	}
	
	/**
	 * Retrieves the string notation of the date/time.
	 * 
	 * @param full Whether the full date and time should be given or not.
	 * 
	 * @return The string notation.
	 */
	public String getAsString(boolean full) {
		DateTimeFormatter formatter = full ? DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss") : DateTimeFormatter.ofPattern("dd-MM-yyyy");
		return getLocalDateTime().format(formatter);
	}
	
	@Override
	public String toString() {
		return getAsString(false);
	}

}
