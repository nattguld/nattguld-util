package com.nattguld.util.locale;

import java.util.Objects;

import com.nattguld.util.maths.Maths;

/**
 * 
 * @author randqm
 *
 */

public enum Country {
	
	AFGHANISTAN("Afghanistan", "AF"),
	ALAND_ISLANDS("Aland Islands", "AX"),
	ALBANIA("Albania", "AL"),
	ALGERIA("Algeria", "DZ"),
	AMERICAN_SAMOA("American Samoa", "AS"),
	ANDORRA("Andorra", "AD"),
	ANGOLA("Angola", "AO"),
	ANGUILLA("Anguilla", "AI"),
	ANTARCTICA("Antarctica", "AQ"),
	ANTIGUA_AND_BARBUDA("Antigua and Barbuda", "AG"),
	ARGENTINA("Argentina", "AR"),
	ARMENIA("Armenia", "AM"),
	ARUBA("Aruba", "AW"),
	AUSTRALIA("Australia", "AU"),
	AUSTRIA("Austria", "AT"),
	AZERBAIJAN("Azerbaijan", "AZ"),
	BAHAMAS("Bahamas", "BS"),
	BAHRAIN("Bahrain", "BH"),
	BANGLADESH("Bangladesh", "BD"),
	BARBADOS("Barbados", "BB"),
	BELARUS("Belarus", "BY"),
	BELGIUM("Belgium", "BE"),
	BELIZE("Belize", "BZ"),
	BENIN("Benin", "BJ"),
	BERMUDA("Bermuda", "BM"),
	BHUTAN("Bhutan", "BT"),
	BOLIVIA("Bolivia", "BO"),
	BOSNIA_AND_HERZEGOVINA("Bosnia and Herzegovina", "BA"),
	BOTSWANA("Botswana", "BW"),
	BOUVET_ISLAND("Bouvet Island", "BV"),
	BRAZIL("Brazil", "BR"),
	BRITISH_INDIAN_OCEAN_TERRITORY("British Indian Ocean Territory", "IO"),
	BRITISH_VIRGIN_ISLANDS("British Virgin Islands", "VG"),
	BRUNEI_DARUSSALAM("Brunei Darussalam", "BN"),
	BULGARIA("Bulgaria", "BG"),
	BURKINA_FASO("Burkina Faso", "BF"),
	BURUNDI("Burundi", "BI"),
	CAMBODIA("Cambodia", "KH"),
	CAMEROON("Cameroon", "CM"),
	CANADA("Canada", "CA"),
	CAPE_VERDE("Cape Verde", "CV"),
	CAYMAN_ISLANDS("Cayman Islands", "KY"),
	CENTRAL_AFRICAN_REPUBLIC("Central African Republic", "CF"),
	CHAD("Chad", "TD"),
	CHILE("Chile", "CL"),
	CHINA("China", "CN"),
	COCOS_ISLANDS("Cocos Islands", "CC"),
	COLOMBIA("Colombia", "CO"),
	COMOROS("Comoros", "KM"),
	THE_DEMOCRATIC_REPUBLIC_OF_CONGO("Congo, democratic republic", "CD"),
	CONGO("Congo", "CG"),
	COOK_ISLANDS("Cook Islands", "CK"),
	COSTA_RICA("Costa Rica", "CR"),
	CROATIA("Croatia", "HR"),
	CUBA("Cuba", "CU"),
	CYPRUS("Cyprus", "CY"),
	CZECH_REPUBLIC("Czech Republic", "CZ"),
	DENMARK("Denmark", "DK"),
	DJIBOUTI("Djibouti", "DJ"),
	DOMINICA("Dominica", "DM"),
	DOMINICAN_REPUBLIC("Dominican Republic", "DO"),
	ECUADOR("Ecuador", "EC"),
	EGYPT("Egypt", "EG"),
	EL_SALVADOR("El Salvador", "SV"),
	EQUATORIAL_GUINEA("Equatorial Guinea", "GQ"),
	ERITREA("Eritrea", "ER"),
	ESTONIA("Estonia", "EE"),
	ETHIOPIA("Ethiopia", "ET"),
	FAROE_ISLANDS("Faroe Islands", "FO"),
	FIJI("Fiji", "FJ"),
	FINLAND("Finland", "FI"),
	FRANCE("France", "FR"),
	FRENCH_GUIANA("French Guiana", "GF"),
	FRENCH_POLYNESIA("French Polynesia", "PF"),
	FRENCH_SOUTHERN_TERRITORIES("French Southern Territories", "TF"),
	GABON("Gabon", "GA"),
	GAMBIA("Gambia", "GM"),
	GEORGIA("Georgia", "GE"),
	GERMANY("Germany", "DE"),
	GHANA("Ghana", "GH"),
	GIBRALTAR("Gibraltar", "GI"),
	GREECE("Greece", "GR"),
	GREENLAND("Greenland", "GL"),
	GRENADA("Grenada", "GD"),
	GUADELOUPE("Guadeloupe", "GP"),
	GUAM("Guam", "GU"),
	GUATEMALA("Guatemala", "GT"),
	GUERNSEY("Guernsey", "GG"),
	GUINEA("Guinea", "GN"),
	GUINEA_BISSAU("Guinea-Bissau", "GW"),
	GUYANA("Guyana", "GY"),
	HAITI("Haiti", "HT"),
	HOLY_SEE("Holy See", "VA"),
	HONDURAS("Honduras", "HN"),
	HONG_KONG("Hong Kong", "HK"),
	HUNGARY("Hungary", "HU"),
	ICELAND("Iceland", "IS"),
	INDIA("India", "IN"),
	INDONESIA("Indonesia", "ID"),
	IRAN("Iran", "IR"),
	IRAQ("Iraq", "IQ"),
	IRELAND("Ireland", "IE"),
	ISLE_OF_MAN("Isle of Man", "IM"),
	ISRAEL("Israel", "IL"),
	ITALY("Italy", "IT"),
	JAMAICA("Jamaica", "JM"),
	JAPAN("Japan", "JP"),
	JERSEY("Jersey", "JE"),
	JORDAN("Jordan", "JO"),
	KAZAKHSTAN("Kazakhstan", "KZ"),
	KENYA("Kenya", "KE"),
	KIRIBATI("Kiribati", "KI"),
	KUWAIT("Kuwait", "KW"),
	KYRGYZSTAN("Kyrgyzstan", "KG"),
	LATVIA("Latvia", "LV"),
	LEBANON("Lebanon", "LB"),
	LESOTHO("Lesotho", "LS"),
	LIBERIA("Liberia", "LR"),
	LIBYA("Libya", "LY"),
	LIECHTENSTEIN("Liechtenstein", "LI"),
	LITHUANIA("Lithuania", "LT"),
	LUXEMBOURG("Luxembourg", "LU"),
	MACAO("Macao", "MO"),
	MACEDONIA("Macedonia", "MK"),
	MADAGASCAR("Madagascar", "MG"),
	MALAWI("Malawi", "MW"),
	MALAYSIA("Malaysia", "MY"),
	MALDIVES("Maldives", "MV"),
	MALI("Mali", "ML"),
	MALTA("Malta", "MT"),
	MARSHALL_ISLANDS("Marshall Islands", "MH"),
	MARTINIQUE("Martinique", "MQ"),
	MAURITANIA("Mauritania", "MR"),
	MAURITIUS("Mauritius", "MU"),
	MAYOTTE("Mayotte", "YT"),
	MEXICO("Mexico", "MX"),
	MICRONESIA("Micronesia", "FM"),
	MOLDOVA("Moldova", "MD"),
	MONACO("Monaco", "MC"),
	MONGOLIA("Mongolia", "MN"),
	MONTENEGRO("Montenegro", "ME"),
	MONTSERRAT("Montserrat", "MS"),
	MOROCCO("Morocco", "MA"),
	MOZAMBIQUE("Mozambique", "MZ"),
	MYANMAR("Myanmar", "MM"),
	NAMIBIA("Namibia", "NA"),
	NAURU("Nauru", "NR"),
	NEPAL("Nepal", "NP"),
	NETHERLANDS("Netherlands", "NL"),
	NEW_CALEDONIA("New Caledonia", "NC"),
	NEW_ZEALAND("New Zealand", "NZ"),
	NICARAGUA("Nicaragua", "NI"),
	NIGER("Niger", "NE"),
	NIGERIA("Nigeria", "NG"),
	NIUE("Niue", "NU"),
	NORFOLK_ISLAND("Norfolk Island", "NF"),
	NORTH_KOREA("North Korea", "KP"),
	NORTHERN_MARIANA_ISLANDS("Northern Mariana Islands", "MP"),
	NORWAY("Norway", "NO"),
	OMAN("Oman", "OM"),
	PAKISTAN("Pakistan", "PK"),
	PALAU("Palau", "PW"),
	PANAMA("Panama", "PA"),
	PAPUA_NEW_GUINEA("Papua New Guinea", "PG"),
	PARAGUAY("Paraguay", "PY"),
	PERU("Peru", "PE"),
	PHILIPPINES("Philippines", "PH"),
	PITCAIRN("Pitcairn", "PN"),
	POLAND("Poland", "PL"),
	PORTUGAL("Portugal", "PT"),
	PUERTO_RICO("Puerto Rico", "PR"),
	QATAR("Qatar", "QA"),
	ROMANIA("Romania", "RO"),
	RUSSIA("Russia", "RU"),
	RUSSIAN_FEDERATION("Russian Federation", "RU"),
	RWANDA("Rwanda", "RW"),
	SAINT_KITTS_AND_NEVIS("Saint Kitts and Nevis", "KN"),
	SAINT_LUCIA("Saint Lucia", "LC"),
	SAINT_PIERRE_AND_MIQUELON("Saint Pierre and Miquelon", "PM"),
	SAMOA("Samoa", "WS"),
	SAO_TOME_AND_PRINCIPE("Sao Tome and Principe", "ST"),
	SAUDI_ARABIA("Saudi Arabia", "SA"),
	SENEGAL("Senegal", "SN"),
	SERBIA("Serbia", "RS"),
	SEYCHELLES("Seychelles", "SC"),
	SIERRA_LEONE("Sierra Leone", "SL"),
	SINGAPORE("Singapore", "SG"),
	SINT_MAARTEN("Sint Maarten", "SX"),
	SLOVAKIA("Slovakia", "SK"),
	SLOVENIA("Slovenia", "SI"),
	SOLOMON_ISLANDS("Solomon Islands", "SB"),
	SOMALIA("Somalia", "SO"),
	SOUTH_AFRICA("South Africa", "ZA"),
	SOUTH_KOREA("South Korea", "KR"),
	SOUTH_SUDAN("South Sudan", "SS"),
	SPAIN("Spain", "ES"),
	SUDAN("Sudan", "SD"),
	SURINAME("Suriname", "SR"),
	SWAZILAND("Swaziland", "SZ"),
	SWEDEN("Sweden", "SE"),
	SWITZERLAND("Switzerland", "CH"),
	SYRIA("Syria", "SY"),
	TAIWAN("Taiwan", "TW"),
	TAJIKISTAN("Tajikistan", "TJ"),
	TANZANIA("Tanzania", "TZ"),
	THAILAND("Thailand", "TH"),
	TOGO("Togo", "TG"),
	TOKELAU("Tokelau", "TK"),
	TONGA("Tonga", "TO"),
	TRINIDAD_AND_TOBAGO("Trinidad and Tobago", "TT"),
	TUNISIA("Tunisia", "TN"),
	TURKEY("Turkey", "TR"),
	TURKMENISTAN("Turkmenistan", "TM"),
	TURKS_AND_CAICOS_ISLANDS("Turks and Caicos Islands", "TC"),
	TUVALU("Tuvalu", "TV"),
	UGANDA("Uganda", "UG"),
	UKRAINE("Ukraine", "UA"),
	UNITED_KINGDOM("United Kingdom", "GB"),
	UNITED_KINGDOM_ALT("United Kingdom (Alt.)", "UK"),
	UNITED_STATES("United States", "US"),
	URUGUAY("Uruguay", "UY"),
	UZBEKISTAN("Uzbekistan", "UZ"),
	VANUATU("Vanuatu", "VU"),
	VENEZUELA("Venezuela", "VE"),
	VIETNAM("Vietnam", "VN"),
	WESTERN_SAHARA("Western Sahara", "EH"),
	YEMEN("Yemen", "YE"),
	ZAMBIA("Zambia", "ZM"),
	IVORY_COAST("Ivory Coast", "CIV"),
	KOSOVO("Kosovo", "RKS"),
	SRI_LANKA("Sri Lanka", "LKA"),
	ZIMBABWE("Zimbabwe", "ZW");

	
	/**
	 * The country name.
	 */
	private final String name;
	
    /*
     * The country code.
     */
    private final String code;
    
    
    /**
     * Creates a new country.
     * 
     * @param name The country name.
     * 
     * @param code The country code.
     */
    private Country(String name, String code) {
    	this.name = name;
    	this.code = code;
    }
    
    /**
     * Retrieves the country name.
     * 
     * @return The name.
     */
    public String getName() {
    	return name;
    }
    
    /**
     * Retrieves the country code.
     * 
     * @return The code.
     */
    public String getCode() {
    	return code;
    }
    
    /**
     * Retrieves the languages.
     * 
     * @return The languages.
     */
    public Language[] getLanguages() {
    	return LocaleManager.getLanguages(this).getLanguages();
    }
    
    /**
     * Retrieves the phone code.
     * 
     * @return The phone code.
     */
    public int getPhoneCode() {
    	return LocaleManager.getNumber(this).getNumber();
    }
    
    /**
     * Retrieves whether a country has a given language or not.
     * 
     * @param lang The language.
     * 
     * @return The result.
     */
    public boolean hasLanguage(Language lang) {
    	if (Objects.isNull(getLanguages()) || getLanguages().length <= 0) {
    		return false;
    	}
    	for (Language l : getLanguages()) {
    		if (l == lang) {
    			return true;
    		}
    	}
    	return false;
    }
    
    /**
     * Retrieves a random language spoken in the country.
     * 
     * @return The language.
     */
    public Language getRandomLanguage() {
    	if (Objects.isNull(getLanguages()) || getLanguages().length <= 0) {
    		System.err.println("No language found for " + getName());
    		return Language.ENGLISH;
    	}
    	return getLanguages()[Maths.random(getLanguages().length)];
    }
    
    /**
     * Retrieves a random network code taken from the countries spoken languages.
     * 
     * @return The random network code.
     */
    public String getRandomNetworkCode() {
    	return getNetworkCode(getRandomLanguage());
    }
   
    /**
     * Retrieves the network code for a given country and language.
     * 
     * @param country The country.
     * 
     * @param language The language.
     * 
     * @return The network code.
     */
    public String getNetworkCode(Language language) {
    	return getLocaleCode(language) + "," + language.getCode() + ";q=0.9";
    }
    
    /**
     * Retrieves the locale code.
     * 
     * @param language The language.
     * 
     * @return The code.
     */
    public String getLocaleCode(Language language) {
    	return language.getCode() + "-" + getCode();
    }
    
    /**
     * Retrieves a country by it's name.
     * 
     * @param name The name.
     * 
     * @return The country.
     */
    public static Country getCountryByName(String name) {
    	for (Country cr : Country.values()) {
    		if (cr.getName().equalsIgnoreCase(name)) {
    			return cr;
    		}
    	}
    	return null;
    }
    
    /**
     * Retrieves a country by it's code.
     * 
     * @param name The name.
     * 
     * @return The country.
     */
    public static Country getCountryByCode(String code) {
    	for (Country cr : Country.values()) {
    		if (cr.getCode().equalsIgnoreCase(code)) {
    			return cr;
    		}
    	}
    	return null;
    }
    
    @Override
    public String toString() {
    	return getName();
    }

}
