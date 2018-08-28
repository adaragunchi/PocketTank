package com.pocket.tank.app.menu;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class WelcomeMenuTest {
	@InjectMocks
	WelcomeMenu welcomeMenu;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getMenuItems() {
		welcomeMenu.getMenuItems();
	}

}
