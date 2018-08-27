package com.pocket.tank.app.config;

import com.pocket.tank.app.initializer.PocketTankInitializer;

/**
 * @author Manjunath 
 */
public final class PocketTankerAppConfiguration {

	private PocketTankerAppConfiguration() {
		System.out.println("Welcome!");
	}

	public static void startApp() {
		PocketTankInitializer.initialize();
	}
}
