package com.nattguld.util.locale;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.nattguld.util.locale.models.impl.CountryCurrency;
import com.nattguld.util.locale.models.impl.CountryLanguages;
import com.nattguld.util.locale.models.impl.CountryNumber;

/**
 * 
 * @author randqm
 *
 */

public class LocaleManager {
	
	/**
	 * Holds the country numbers.
	 */
	private static List<CountryNumber> numbers = new ArrayList<>();
	
	/**
	 * Holds the country languages.
	 */
	private static List<CountryLanguages> languages = new ArrayList<>();
	
	/**
	 * Holds the country currencies.
	 */
	private static List<CountryCurrency> currencies = new ArrayList<>();
	
	
	/**
	 * Retrieves the country currency for a given country.
	 * 
	 * @param country The country.
	 * 
	 * @return The currency.
	 */
	public static CountryCurrency getCurrency(Country country) {
		if (currencies.isEmpty()) {
			JsonArray arr = loadData("country_currencies.json");
			
			if (Objects.isNull(arr) || arr.size() == 0) {
				System.err.println("Failed to load country currencies");
				return null;
			}
			for (JsonElement el : arr) {
				JsonObject obj = el.getAsJsonObject();
				
				String countryCode = obj.get("country_code").getAsString();
				String countryName = obj.get("country_name").getAsString();
				String currencyCode = obj.get("currency_code").getAsString();
				double usdModifier = obj.get("usd_modifier").getAsDouble();
				String currencySymbol = obj.get("currency_symbol").getAsString();
				
				currencies.add(new CountryCurrency(countryCode, countryName, currencyCode, usdModifier, currencySymbol));
			}
		}
		return currencies.stream()
				.filter(g -> g.getCountryCode().equalsIgnoreCase(country.getCode()))
				.findFirst().orElse(null);
	}
	
	/**
	 * Retrieves the country numbers for a given country.
	 * 
	 * @param country The country.
	 * 
	 * @return The numbers.
	 */
	public static CountryNumber getNumber(Country country) {
		if (numbers.isEmpty()) {
			JsonArray arr = loadData("country_numbers.json");
			
			if (Objects.isNull(arr) || arr.size() == 0) {
				System.err.println("Failed to load country numbers");
				return null;
			}
			for (JsonElement el : arr) {
				JsonObject obj = el.getAsJsonObject();
				
				String countryCode = obj.get("country_code").getAsString();
				String countryName = obj.get("country_name").getAsString();
				int number = obj.get("country_number").getAsInt();
				
				numbers.add(new CountryNumber(countryCode, countryName, number));
			}
		}
		return numbers.stream()
				.filter(g -> g.getCountryCode().equalsIgnoreCase(country.getCode()))
				.findFirst().orElse(null);
	}
	
	/**
	 * Retrieves the country languages for a given country.
	 * 
	 * @param country The country.
	 * 
	 * @return The languages.
	 */
	public static CountryLanguages getLanguages(Country country) {
		if (languages.isEmpty()) {
			JsonArray arr = loadData("country_languages.json");
			
			if (Objects.isNull(arr) || arr.size() == 0) {
				System.err.println("Failed to load country languages");
				return null;
			}
			for (JsonElement el : arr) {
				JsonObject obj = el.getAsJsonObject();
				
				String countryCode = obj.get("country_code").getAsString();
				String countryName = obj.get("country_name").getAsString();
				JsonArray langsArr = obj.get("languages").getAsJsonArray();
				
				Language[] langs = new Language[langsArr.size()];
				
				for (int i = 0; i < langs.length; i++) {
					JsonObject langObj = langsArr.get(i).getAsJsonObject();
					
					String langCode = langObj.get("code").getAsString();
					@SuppressWarnings("unused")
					String langName = langObj.get("name").getAsString();
					
					langs[i] = Language.getByCode(langCode);
				}
				languages.add(new CountryLanguages(countryCode, countryName, langs));
			}
		}
		return languages.stream()
				.filter(g -> g.getCountryCode().equalsIgnoreCase(country.getCode()))
				.findFirst().orElse(null);
	}
	
	/**
	 * Loads the data from a given file name into a json array.
	 * 
	 * @param fileName The file name.
	 * 
	 * @return The json array.
	 */
	private static JsonArray loadData(String fileName) {
		try (InputStreamReader reader = new InputStreamReader(LocaleManager.class.getResourceAsStream("/data/" + fileName), "UTF-8")) {
			return (JsonArray)new JsonParser().parse(reader);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
