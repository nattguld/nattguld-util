package com.nattguld.util.geo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.nattguld.util.geo.location.City;
import com.nattguld.util.geo.location.CityType;
import com.nattguld.util.geo.location.StateRegion;
import com.nattguld.util.geo.models.impl.CountryCities;
import com.nattguld.util.locale.Country;

/**
 * 
 * @author randqm
 *
 */

public class GeoManager {
	
	/**
	 * The default country.
	 */
	public static final Country DEFAULT_COUNTRY = Country.UNITED_STATES;
	
	/**
	 * The default geo coordinate.
	 */
	public static final GeoCoordinates DEFAULT_GEO_COORDINATES = new GeoCoordinates(34.033470, -118.245853); //LA
	
	/**
	 * The default state.
	 */
	public static final StateRegion DEFAULT_STATE = new StateRegion("California", "CA");
	
	/**
	 * The default city.
	 */
	public static final City DEFAULT_CITY = new City("Los Angeles", DEFAULT_GEO_COORDINATES, CityType.METROPOL, DEFAULT_STATE);
	
	/**
	 * The default geo position.
	 */
	public static final GeoPosition DEFAULT_GEO_POSITION = new GeoPosition(DEFAULT_COUNTRY, DEFAULT_CITY, DEFAULT_GEO_COORDINATES);
	
	/**
	 * Holds the country cities.
	 */
	private static List<CountryCities> cities = new ArrayList<>();
	
	
	/**
	 * Retrieves a city by it's name.
	 * 
	 * @param country The country.
	 * 
	 * @param cityName The name of the city.
	 * 
	 * @return The city.
	 */
	public static City getCityForName(Country country, String cityName) {
		return getCityForName(country, cityName, null);
	}
	
	/**
	 * Retrieves a city by it's name.
	 * 
	 * @param country The country.
	 * 
	 * @param cityName The name of the city.
	 * 
	 * @param fallbackCoords The fallback coordinates.
	 * 
	 * @return The city.
	 */
	public static City getCityForName(Country country, String cityName, GeoCoordinates fallbackCoords) {
		CountryCities cs = getCountryCities(country);
		
		if (Objects.nonNull(cs)) {
			for (City city : cs.getCities()) {
				if (city.getName().equalsIgnoreCase(cityName)) {
					return city;
				}
			}
		}
		System.err.println("City not found [Country: " + country.getName() + "][City: " + cityName + "]");
		return new City(cityName, Objects.isNull(fallbackCoords) ? DEFAULT_GEO_COORDINATES : fallbackCoords
				, CityType.VILLAGE, GeoManager.DEFAULT_STATE);
	}
	
	/**
	 * Retrieves country cities for a given country.
	 * 
	 * @param cr The country.
	 * 
	 * @return The country cities.
	 */
	public static CountryCities getCountryCities(Country cr) {
		if (cities.isEmpty()) {
			JsonArray arr = loadData("country_cities.json");
			
			if (Objects.isNull(arr) || arr.size() == 0) {
				System.err.println("Failed to load country cities");
				return null;
			}
			for (JsonElement el : arr) {
				JsonObject obj = el.getAsJsonObject();
				
				String countryCode = obj.get("country_code").getAsString();
				String countryName = obj.get("country_name").getAsString();
				JsonArray citiesArr = obj.get("cities").getAsJsonArray();
				
				City[] crCities = new City[citiesArr.size()];
				
				for (int i = 0; i < citiesArr.size(); i ++) {
					JsonObject cityObj = citiesArr.get(i).getAsJsonObject();
					
					String name = cityObj.get("name").getAsString();
					CityType cType = new Gson().fromJson(cityObj.get("type"), CityType.class);
					GeoCoordinates geoCoords = new Gson().fromJson(cityObj.get("geoCoords"), GeoCoordinates.class);
					StateRegion state = new StateRegion("New York", "NY");
					int j = 0; //TODO
					
					crCities[i] = new City(name, geoCoords, cType, state);
				}
				cities.add(new CountryCities(countryCode, countryName, crCities));
			}
		}
		return cities.stream()
				.filter(g -> g.getCountryCode().equalsIgnoreCase(cr.getCode()))
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
		try (InputStreamReader reader = new InputStreamReader(GeoManager.class.getResourceAsStream("/data/" + fileName), "UTF-8")) {
			return (JsonArray)new JsonParser().parse(reader);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
