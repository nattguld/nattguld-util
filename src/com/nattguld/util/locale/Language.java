package com.nattguld.util.locale;

/**
 * 
 * @author randqm
 *
 */

public enum Language {
	
	AFRIKAANS("af", "Afrikaans"),
	ALBANIAN("sq", "Albanian"),
	AMHARIC("am", "Amharic"),
	ARABIC("ar", "Arabic"),
	ARMENIAN("hy", "Armenian"),
	AZERBAIJANI("az", "Azerbaijani"),
	BANGLA("bn", "Bangla"),
	BASQUE("eu", "Basque"),
	BELARUSIAN("be", "Belarusian"),
	BOSNIAN("bs", "Bosnian"),
	BULGARIAN("bg", "Bulgarian"),
	BURMESE("my", "Burmese"),
	CATALAN("ca", "Catalan"),
	CEBUANO("ceb", "Cebuano"),
	CHINESE_SIMPLIFIED("zh-CN", "Chinese Simplified"),
	CHINESE_TRADITIONAL("zh-TW", "Chinese Traditional"),
	CORSICAN("co", "Corsican"),
	CROATIAN("hr", "Croatian"),
	CZECH("cs", "Czech"),
	DANISH("da", "Danish"),
	DUTCH("nl", "Dutch"),
	ENGLISH("en", "English"),
	ESPERANTO("eo", "Esperanto"),
	ESTONIAN("et", "Estonian"),
	FILIPINO("tl", "Filipino"),
	FINNISH("fi", "Finnish"),
	FRENCH("fr", "French"),
	GALICIAN("gl", "Galician"),
	GEORGIAN("ka", "Georgian"),
	GERMAN("de", "German"),
	GREEK("el", "Greek"),
	GUJARATI("gu", "Gujarati"),
	HAITIAN_CREOLE("ht", "Haitian Creole"),
	HAUSA("ha", "Hausa"),
	HAWAIIAN("haw", "Hawaiian"),
	HEBREW("iw", "Hebrew"),
	HINDI("hi", "Hindi"),
	HMONG("hmn", "Hmong"),
	HUNGARIAN("hu", "Hungarian"),
	ICELANDIC("is", "Icelandic"),
	IGBO("ig", "Igbo"),
	INDONESIAN("id", "Indonesian"),
	IRISH("ga", "Irish"),
	ITALIAN("it", "Italian"),
	JAPANESE("ja", "Japanese"),
	JAVANESE("jv", "Javanese"),
	KANNADA("kn", "Kannada"),
	KAZAKH("kk", "Kazakh"),
	KHMER("km", "Khmer"),
	KOREAN("ko", "Korean"),
	KURDISH("ku", "Kurdish"),
	KYRGYZ("ky", "Kyrgyz"),
	LAO("lo", "Lao"),
	LATIN("la", "Latin"),
	LATVIAN("lv", "Latvian"),
	LITHUANIAN("lt", "Lithuanian"),
	LUXEMBOURGISH("lb", "Luxembourgish"),
	MACEDONIAN("mk", "Macedonian"),
	MALAGASY("mg", "Malagasy"),
	MALAY("ms", "Malay"),
	MALAYALAM("ml", "Malayalam"),
	MALTESE("mt", "Maltese"),
	MAORI("mi", "Maori"),
	MARATHI("mr", "Marathi"),
	MONGOLIAN("mn", "Mongolian"),
	NEPALI("ne", "Nepali"),
	NORWEGIAN("no", "Norwegian"),
	NYANJA("ny", "Nyanja"),
	PASHTO("ps", "Pashto"),
	PERSIAN("fa", "Persian"),
	POLISH("pl", "Polish"),
	PORTUGUESE("pt", "Portuguese"),
	PUNJABI("pa", "Punjabi"),
	ROMANIAN("ro", "Romanian"),
	RUSSIAN("ru", "Russian"),
	SAMOAN("sm", "Samoan"),
	SCOTTISH_GAELIC("gd", "Scottish Gaelic"),
	SERBIAN("sr", "Serbian"),
	SHONA("sn", "Shona"),
	SINDHI("sd", "Sindhi"),
	SINHALA("si", "Sinhala"),
	SLOVAK("sk", "Slovak"),
	SLOVENIAN("sl", "Slovenian"),
	SOMALI("so", "Somali"),
	SOUTHERN_SOTHO("st", "Southern Sotho"),
	SPANISH("es", "Spanish"),
	SUNDANESE("su", "Sundanese"),
	SWAHILI("sw", "Swahili"),
	SWEDISH("sv", "Swedish"),
	TAJIK("tg", "Tajik"),
	TAMIL("ta", "Tamil"),
	TELUGU("te", "Telugu"),
	THAI("th", "Thai"),
	TURKISH("tr", "Turkish"),
	UKRAINIAN("uk", "Ukrainian"),
	URDU("ur", "Urdu"),
	UZBEK("uz", "Uzbek"),
	VIETNAMESE("vi", "Vietnamese"),
	WELSH("cy", "Welsh"),
	WESTERN_FRISIAN("fy", "Western Frisian"),
	XHOSA("xh", "Xhosa"),
	YIDDISH("yi", "Yiddish"),
	YORUBA("yo", "Yoruba"),
	ZULU("zu", "Zulu");

	
	/**
	 * The language code.
	 */
	private final String code;
	
	/**
	 * The language name.
	 */
	private final String name;
	
	
	/**
	 * Creates a new language.
	 * 
	 * @param code The language code.
	 * 
	 * @param name The language name.
	 */
	private Language(String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	/**
	 * Retrieves the language code.
	 * 
	 * @return The code.
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * Retrieves the language name.
	 * 
	 * @return The name.
	 */
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return getName();
	}

}
