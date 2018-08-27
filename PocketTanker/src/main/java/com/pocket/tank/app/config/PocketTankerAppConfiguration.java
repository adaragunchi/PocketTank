package com.pocket.tank.app.config;

import com.pocket.tank.app.initializer.PocketTankInitializer;

/**
 * @author Manjunath 
 * Initiates the flow of Game.
 * 
 */
public final class PocketTankerAppConfiguration {

	private PocketTankerAppConfiguration() {
		System.out.println("Welcome!");
	}

	/**
	 * Initializes main menu display of the application features
	 */
	public static void startApp() {
		PocketTankInitializer.initialize();
	}
}
