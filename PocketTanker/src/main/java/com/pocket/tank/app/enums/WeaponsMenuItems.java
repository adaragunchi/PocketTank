package com.pocket.tank.app.enums;

public enum WeaponsMenuItems {
	
	KNIFE("1 Knife (Power=30)",30),
	GUN("2 AK57 (Power=40)",40),
	TANK("3 Tank (Power=50)",50),
	BOMB("4 Bomb (Power=60)",60),
	SNIPER("5 Snipper (Power=70)",70);
	
	private final String weapon;
	private final int weaponPower;
	/**
	 * @return the weapon
	 */
	public String getWeapon() {
		return weapon;
	}
	/**
	 * @return the weaponPower
	 */
	public int getWeaponPower() {
		return weaponPower;
	}
	private WeaponsMenuItems(String weapon, int weaponPower) {
		this.weapon = weapon;
		this.weaponPower = weaponPower;
	}
}
