package com.pocket.tank.app.menu;

import com.pocket.tank.app.enums.WeaponsMenuItems;
import com.pocket.tank.app.util.ReadInput;

/**
 * 
 * @author Manjunath
 * 
 * This is used to display weapon menu names and to get user input from the displayed menu options.
 *
 */
public class WeaponMenu implements IMenu {

	@Override
	public void getMenuItems() {
		System.out.println("Select weapons for the fight : ");
		for (WeaponsMenuItems weaponName : WeaponsMenuItems.values()) {
			System.out.println(weaponName.getWeapon());
		}
	}

	@Override
	public String getUserInput() {
		return ReadInput.readString();
	}
}
