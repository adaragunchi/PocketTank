/**
 * 
 */
package com.pocket.tank.app.initializer;

import com.pocket.tank.app.menu.WelcomeMenu;
import com.pocket.tank.app.menu.shower.IMenuShower;
import com.pocket.tank.app.menu.shower.WelcomeMenuShower;

/**
 * @author Manjunath
 * 
 * Initializes the welcome menu display to user.
 *
 */
public class PocketTankInitializer {

	/**
	 * Displays welcome menu for user to avail features.
	 */
	public static void initialize() {
		IMenuShower menuShower = new WelcomeMenuShower();
		menuShower.showMenu(new WelcomeMenu());
		menuShower.actOnMenuSelect();
	}
}
