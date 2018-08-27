package com.pocket.tanker;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.pocket.tank.PocketTankApplication;
import com.pocket.tank.app.config.PocketTankerAppConfiguration;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ PocketTankerAppConfiguration.class })
public class PocketTankApplicationTest {
	@InjectMocks
	PocketTankApplication pocketTankApplication;

	@Mock
	PocketTankerAppConfiguration pocketTankerAppConfiguration;
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		PowerMockito.mockStatic(PocketTankerAppConfiguration.class);
	}

	@Test
	public void mainMethod() {
		String[] args = new String[10];
		PocketTankerAppConfiguration.startApp();
		PocketTankApplication.main(args);
	}
}
