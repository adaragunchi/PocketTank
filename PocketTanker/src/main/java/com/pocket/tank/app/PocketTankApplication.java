package com.pocket.tank.app;

import com.pocket.tank.app.config.PocketTankerAppConfiguration;

/**
 * @author Manjunath
 * Start of the application
 *
 */
public final class PocketTankApplication {
    private PocketTankApplication() {
        
    }
    /**
     * Main Method.Entry point of application
     */
    public static void main(final String[] args){
        PocketTankerAppConfiguration.startApp();
    }
}
