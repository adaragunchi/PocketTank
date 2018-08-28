package com.pocket.tank.app.enums;

/**
 * 
 * @author Manjunath
 * 
 *         Opponent country is chosen randomly from this enum.
 *
 */
public enum OpponentCountryName {
	INDIA("INDIA"), USA("USA"), GERMANY("GERMANY");
	String countryName;

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName
	 *            the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	private OpponentCountryName(String countryName) {
		this.countryName = countryName;
	}

}
