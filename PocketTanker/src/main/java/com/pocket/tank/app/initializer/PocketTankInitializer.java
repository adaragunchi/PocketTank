/**
 * 
 */
package com.pocket.tank.app.initializer;

import com.pocket.tank.app.menu.WelcomeMenu;
import com.pocket.tank.app.menu.shower.IMenuShower;
import com.pocket.tank.app.menu.shower.WelcomeMenuShower;

/**
 * @author M1027311
 *
 */
public class PocketTankInitializer {

	public static void initialize() {
		IMenuShower menuShower = new WelcomeMenuShower();
		menuShower.showMenu(new WelcomeMenu());
		menuShower.actOnMenuSelect();
	}
}
