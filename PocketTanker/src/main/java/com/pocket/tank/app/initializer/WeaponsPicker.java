/**
 * 
 */
package com.pocket.tank.app.initializer;

import com.pocket.tank.app.menu.IMenu;
import com.pocket.tank.app.menu.WeaponMenu;

/**
 * @author Manjunath
 * 
 * This layer provides view of weapons available to play fight. 
 *
 */
public class WeaponsPicker {
	
	public static String pickWeapons() {
		IMenu weaponsMenu = new WeaponMenu();
		weaponsMenu.getMenuItems();
		return weaponsMenu.getUserInput();
	}
}