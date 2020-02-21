package com.nattguld.util.locale.models.impl;

import com.nattguld.util.locale.models.CountryDataModel;

/**
 * 
 * @author randqm
 *
 */

public class CountryCurrency extends CountryDataModel {
	
	/**
	 * The currency code.
	 */
	private final String currencyCode;
	
	/**
	 * The USD modifier.
	 */
	private final double usdModifier;
	
	/**
	 * The currency symbol.
	 */
	private final String currencySymbol;
	

	/**
	 * Creates a new country currency.
	 * 
	 * @param countryCode The country code.
	 * 
	 * @param countryName The country name.
	 * 
	 * @param currencyCode The currency code.
	 * 
	 * @param usdModifier The usd modifier.
	 * 
	 * @param currencySymbol The currency symbol.
	 */
	public CountryCurrency(String countryCode, String countryName, String currencyCode, double usdModifier, String currencySymbol) {
		super(countryCode, countryName);
		
		this.currencyCode = currencyCode;
		this.usdModifier = usdModifier;
		this.currencySymbol = currencySymbol;
	}
	
	/**
	 * Retrieves the currency code.
	 * 
	 * @return The currency code.
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}
	
	/**
	 * Retrieves the usd modifier.
	 * 
	 * @return The usd modifier.
	 */
	public double getUsdModifier() {
		return usdModifier;
	}
	
	/**
	 * Retrieves the currency symbol.
	 * 
	 * @return The symbol.
	 */
	public String getCurrencySymbol() {
		return currencySymbol;
	}

}
