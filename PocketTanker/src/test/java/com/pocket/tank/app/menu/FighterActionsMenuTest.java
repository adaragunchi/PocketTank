package com.pocket.tank.app.menu;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.pocket.tank.app.util.ReadInput;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ ReadInput.class })
public class FighterActionsMenuTest {

	@InjectMocks
	FighterActionsMenu fighterActionsMenu;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		PowerMockito.mockStatic(ReadInput.class);
	}

	@Test
	public void getMenuItems() {
		fighterActionsMenu.getMenuItems();
	}

	@Test
	public void getUserInput() {
		Mockito.when(ReadInput.readInt()).thenReturn("19");
		fighterActionsMenu.getUserInput();
	}
}
