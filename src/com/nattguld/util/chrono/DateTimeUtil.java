package com.nattguld.util.chrono;

import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;

import com.nattguld.util.chrono.format.DateFormat;
import com.nattguld.util.chrono.format.TimeFormat;
import com.nattguld.util.locale.Country;
import com.nattguld.util.text.Delimiter;

/**
 * 
 * @author randqm
 *
 */

public class DateTimeUtil {

	
	/**
	 * Retrieves the current time as string.
	 * 
	 * @return The time.
	 */
	public static String getCurrentTime() {
		return formatTime(new DateTime().getLocalDateTime());
	}
	
	/**
	 * Retrieves the current date as string.
	 * 
	 * @return The date.
	 */
	public static String getCurrentDate() {
		return formatDate(new DateTime().getLocalDateTime());
	}
	
	/**
	 * Retrieves the current date-time as string.
	 * 
	 * @return The date-time.
	 */
	public static String getCurrentDateTime() {
		return formatDateTime(new DateTime().getLocalDateTime());
	}
	
	/**
	 * Retrieves the current date time in ISO format.
	 * 
	 * @return The ISO date time.
	 */
	public static String getCurrentISODateTime() {
		LocalDateTime ldt = LocalDateTime.now(ZoneOffset.UTC);
		String str = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(ldt);
		return str + "Z";
	}
	
	/**
	 * Formats a local-date-time to a time string.
	 * 
	 * @param ldt The local-date-time.
	 * 
	 * @param dateFormat The date format.
	 * 
	 * @return The formatted string.
	 */
	public static String formatTime(LocalDateTime ldt, String timeFormat) {
		return ldt.format(DateTimeFormatter.ofPattern(timeFormat));
	}
	
	/**
	 * Formats a local-date-time to a date string.
	 * 
	 * @param ldt The local-date-time.
	 * 
	 * @param dateFormat The date format.
	 * 
	 * @return The formatted string.
	 */
	public static String formatDate(LocalDateTime ldt, String dateFormat) {
		return ldt.format(DateTimeFormatter.ofPattern(dateFormat));
	}
	
	/**
	 * Formats a date-time to a string.
	 * 
	 * @param ldt The local-date-time.
	 * 
	 * @param dateFormat The date format.
	 * 
	 * @param timeFormat The time format.
	 * 
	 * @param delimeter The delimeter.
	 * 
	 * @return The formatted string.
	 */
	public static String formatDateTime(LocalDateTime ldt, String dateFormat, String timeFormat, Delimiter delimeter) {
		return ldt.format(DateTimeFormatter.ofPattern(dateFormat + delimeter.getCharacter() + timeFormat));
	}
	
	/**
	 * Formats a date-time to a default locale time string.
	 * 
	 * @param ldt The local-date-time.
	 * 
	 * @return The formatted string.
	 */
	public static String formatTime(LocalDateTime ldt) {
		return formatDate(ldt, TimeFormat.HH_MM_SS.getFormat(getDefaultClock(), Delimiter.COLON));
	}
	
	/**
	 * Formats a date-time to a default locale date string.
	 * 
	 * @param ldt The local-date-time.
	 * 
	 * @return The formatted string.
	 */
	public static String formatDate(LocalDateTime ldt) {
		return formatDate(ldt, getDefaultDateFormat().getFormat(Delimiter.MINUS));
	}
	
	/**
	 * Formats a date-time to a default locale string.
	 * 
	 * @param ldt The local-date-time.
	 * 
	 * @return The formatted string.
	 */
	public static String formatDateTime(LocalDateTime ldt) {
		return formatDateTime(ldt, getDefaultDateFormat().getFormat(Delimiter.MINUS)
				, TimeFormat.HH_MM_SS.getFormat(getDefaultClock(), Delimiter.COLON), Delimiter.SPACE);
	}
	
	/**
	 * Retrieves the default clock.
	 * 
	 * @return The default clock.
	 */
	public static Clock getDefaultClock() {
		String countryCode = Locale.getDefault().getCountry();
		Country country = Country.getCountryByCode(countryCode);
		
		if (Objects.nonNull(country)) {
			return getClockForCountry(country);
		}
		return Clock.HOUR_24;
	}
	
	/**
	 * Retrieves the clock for a given country.
	 * 
	 * @param country The country.
	 * 
	 * @return The clock.
	 */
	public static Clock getClockForCountry(Country country) {
		switch (country) {
		case UNITED_KINGDOM:
		case UNITED_KINGDOM_ALT:
		case BRITISH_VIRGIN_ISLANDS:
		case BRITISH_INDIAN_OCEAN_TERRITORY:
		case IRELAND:
		case UNITED_STATES:
		case CANADA:
		case AUSTRALIA:
		case NEW_ZEALAND:
		case INDIA:
		case PAKISTAN:
		case BANGLADESH:
		case MALAYSIA:
		case SOUTH_AFRICA:
		case SINGAPORE:
		case VIETNAM:
		case COLOMBIA:
		case EGYPT:
		case SAUDI_ARABIA:
		case MYANMAR:
		case MEXICO:
			return Clock.HOUR_12;
			
			default:
				return Clock.HOUR_24;
		}
	}
	
	/**
	 * Retrieves the default date format for the system.
	 * 
	 * @return The default date format.
	 */
	public static DateFormat getDefaultDateFormat() {
		String countryCode = Locale.getDefault().getCountry();
		Country country = Country.getCountryByCode(countryCode);
		
		if (Objects.nonNull(country)) {
			return getDateFormatForCountry(country);
		}
		return DateFormat.DD_MM_YYYY;
	}
	
	/**
	 * Retrieves the default date format for a given country.
	 * 
	 * @param country The country.
	 * 
	 * @return The date format.
	 */
	public static DateFormat getDateFormatForCountry(Country country) {
		switch (country) {
		case CHINA:
		case JAPAN:
		case SOUTH_KOREA:
		case NORTH_KOREA:
		case CANADA:
		case TAIWAN:
		case HUNGARY:
		case MONGOLIA:
		case LITHUANIA:
		case BHUTAN:
		case SOUTH_AFRICA:
		case KENYA:
		case GHANA:
			return DateFormat.YYYY_MM_DD;
			
		case UNITED_STATES:
		case PHILIPPINES:
		case MALAYSIA:
		case SOMALIA:
		case TOGO:
		case PANAMA:
		case PUERTO_RICO:
		case CAYMAN_ISLANDS:
		case GREENLAND:
			return DateFormat.MM_DD_YYYY;
			
			default:
				return DateFormat.DD_MM_YYYY;
		}
	}
	
	/**
	 * Retrieves the time of a string for a given format.
	 * 
	 * @param input The time input.
	 * 
	 * @param format The format.
	 * 
	 * @param delimiter The delimiter.
	 * 
	 * @return The date-time.
	 */
	public static DateTime parseTime(String input, TimeFormat format, Delimiter delimiter) {
		return parseTime(input, format, delimiter, Clock.HOUR_24);
	}
	
	/**
	 * Retrieves the time of a string for a given format.
	 * 
	 * @param input The time input.
	 * 
	 * @param format The format.
	 * 
	 * @param delimiter The delimiter.
	 * 
	 * @param clock The clock.
	 * 
	 * @return The date-time.
	 */
	public static DateTime parseTime(String input, TimeFormat format, Delimiter delimiter, Clock clock) {
		return new DateTime(LocalTime.parse(formatDateTimeInput(input, delimiter)
				, DateTimeFormatter.ofPattern(format.getFormat(clock, delimiter))).atDate(LocalDate.now()));
	}
	
	/**
	 * Retrieves the date of a string for a given format.
	 * 
	 * @param input The time input.
	 * 
	 * @param format The format.
	 * 
	 * @param delimiter The delimiter.
	 * 
	 * @return The date-time.
	 */
	public static DateTime parseDate(String input, DateFormat format, Delimiter delimiter) {
		return new DateTime(LocalDate.parse(formatDateTimeInput(input, delimiter)
				, DateTimeFormatter.ofPattern(format.getFormat(delimiter))).atStartOfDay());
	}
	
	/**
	 * Retrieves the local-date-time of a string for a given format.
	 * 
	 * @param input The time input.
	 * 
	 * @param dateFormat The date format.
	 * 
	 * @param dateDelimiter The date delimiter.
	 * 
	 * @param timeFormat The time format.
	 * 
	 * @param timeDelimiter The time delimiter.
	 * 
	 * @param dateTimeDelimiter The date time delimiter.
	 * 
	 * @return The date-time.
	 */
	public static DateTime parseDateTime(String input, DateFormat dateFormat, Delimiter dateDelimiter
			, TimeFormat timeFormat, Delimiter timeDelimiter, Delimiter dateTimeDelimeter) {
		return parseDateTime(input, dateFormat, dateDelimiter, timeFormat, timeDelimiter, Clock.HOUR_24, dateTimeDelimeter);
	}
	
	/**
	 * Retrieves the local-date-time of a string for a given format.
	 * 
	 * @param input The time input.
	 * 
	 * @param dateFormat The date format.
	 * 
	 * @param dateDelimiter The date delimiter.
	 * 
	 * @param timeFormat The time format.
	 * 
	 * @param timeDelimiter The time delimiter.
	 * 
	 * @param clock The clock.
	 * 
	 * @param dateTimeDelimiter The date time delimiter.
	 * 
	 * @return The date-time.
	 */
	public static DateTime parseDateTime(String input, DateFormat dateFormat, Delimiter dateDelimiter
			, TimeFormat timeFormat, Delimiter timeDelimiter, Clock clock, Delimiter dateTimeDelimeter) {
		String[] parts = input.split(dateTimeDelimeter.getCharacter());
		
		if (Objects.isNull(parts) || parts.length <= 0) {
			System.err.println("Unable to parse date time for input: " + input);
			return new DateTime(LocalDateTime.parse(input));
		}
		String time = formatDateTimeInput(parts[0], dateDelimiter);
		String date = formatDateTimeInput(parts[1], timeDelimiter);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat.getFormat(dateDelimiter) 
				+ dateTimeDelimeter.getCharacter() + timeFormat.getFormat(clock, timeDelimiter));
		return new DateTime(LocalDateTime.parse(date + dateTimeDelimeter.getCharacter() + time, formatter));
	}
	
	/**
	 * Formats an ISO date-time into a date time object.
	 * 
	 * @param input The input.
	 * 
	 * @return The date time.
	 */
	public static DateTime parseISODateTime(String input) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
		        .withZone(ZoneId.of("UTC"));
		LocalDateTime ldt = LocalDateTime.parse(input, formatter);
		return new DateTime(ldt);
	}
	
	/**
	 * Formats date-time input into a parsable string.
	 * 
	 * @param input The input.
	 * 
	 * @param delimiter The delimiter.
	 * 
	 * @return The formatted parsable string.
	 */
	private static String formatDateTimeInput(String input, Delimiter delimiter) {
		input = input.replaceAll("[A-Za-z]", "").trim();
		
		StringBuilder sb = new StringBuilder();
		
		for (String part : input.split(delimiter.getCharacter())) {
			if (part.length() == 1) {
				sb.append("0");
			}
			sb.append(part);
			sb.append(delimiter.getCharacter());
		}
		String formatted = sb.toString();
		
		if (formatted.endsWith(delimiter.getCharacter())) {
			formatted = formatted.substring(0, formatted.length() - 1);
		}
		return formatted;
	}
	
    /**
     * Retrieves the month name for an integer value.
     * 
     * @param num The integer value.
     * 
     * @return The month name.
     */
    public static String getMonthForInt(int num) {
        String month = "wrong";
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        
        if (num >= 0 && num <= 11 ) {
            month = months[num - 1];
        }
        return month;
    }
	
	/**
	 * Retrieves the formatted string of a given offset.
	 * 
	 * @param offset The offset.
	 * 
	 * @return The formatted string.
	 */
	public static String formatTimeOffset(int offset) {
		String format = "GMT";
		
		if (offset != 0) {
			format += offset < 0 ? "-" : "+";
			
			if ((offset > 0 && offset < 10)
					|| (offset < 0 && offset > (-10))) {
				format += "0";
			}
			format += Math.abs(offset);
			format += ":00";
		}
		return format;
	}

}
