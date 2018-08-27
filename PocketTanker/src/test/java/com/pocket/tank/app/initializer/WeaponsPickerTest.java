package com.pocket.tank.app.initializer;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.pocket.tank.app.menu.IMenu;
import com.pocket.tank.app.menu.WeaponMenu;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ WeaponsPicker.class })
public class WeaponsPickerTest {
	@Mock
	WeaponMenu weaponMenu;

	@Mock
	IMenu imenu;;
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		PowerMockito.mockStatic(WeaponsPicker.class);
	}
	@Test
	public void initialize(){
		Mockito.when(imenu.getUserInput()).thenReturn("1");
		Mockito.doNothing().when(imenu).getMenuItems();
		WeaponsPicker.pickWeapons();
	}
}
