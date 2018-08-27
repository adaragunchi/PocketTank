package com.pocket.tank.app.model;

import java.io.Serializable;
import java.util.Map;

public class Fighter implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	private String fighterName;
	private int age;
	private String country;
	private Map<String,Integer> selectedWeaponPower;
	private int totalScore;
	
	/**
	 * @return the fighterName
	 */
	public String getFighterName() {
		return fighterName;
	}
	/**
	 * @param fighterName the fighterName to set
	 */
	public void setFighterName(String fighterName) {
		this.fighterName = fighterName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the selectedWeaponPower
	 */
	public Map<String, Integer> getSelectedWeaponPower() {
		return selectedWeaponPower;
	}
	/**
	 * @param selectedWeaponPower the selectedWeaponPower to set
	 */
	public void setSelectedWeaponPower(Map<String, Integer> selectedWeaponPower) {
		this.selectedWeaponPower = selectedWeaponPower;
	}
	/**
	 * @return the totalScore
	 */
	public int getTotalScore() {
		return totalScore;
	}
	/**
	 * @param totalScore the totalScore to set
	 */
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return fighterName + ", age=" + age + ", country=" + country
				+ ", selectedWeaponPower=" + selectedWeaponPower;
	}
}
