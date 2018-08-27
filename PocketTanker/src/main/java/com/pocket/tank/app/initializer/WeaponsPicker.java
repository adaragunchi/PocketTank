/**
 * 
 */
package com.pocket.tank.app.initializer;

import com.pocket.tank.app.menu.IMenu;
import com.pocket.tank.app.menu.WeaponMenu;

/**
 * @author M1027311
 *
 */
public class WeaponsPicker {
	
	public static String pickWeapons() {
		IMenu weaponsMenu = new WeaponMenu();
		weaponsMenu.getMenuItems();
		return weaponsMenu.getUserInput();
	}
}