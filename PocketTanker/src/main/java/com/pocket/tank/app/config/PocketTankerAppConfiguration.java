package com.pocket.tank.app.config;

import com.pocket.tank.app.menu.WelcomeMenu;
import com.pocket.tank.app.menu.shower.IMenuShower;
import com.pocket.tank.app.menu.shower.WelcomeMenuShower;

/**
 * @author Manjunath 
 */
public final class PocketTankerAppConfiguration {

	private PocketTankerAppConfiguration() {
		System.out.println("Welcome!");
	}

	public static void startApp() {
		IMenuShower menuShower = new WelcomeMenuShower();
		menuShower.showMenu(new WelcomeMenu());
		menuShower.actOnMenuSelect();
	}
}
