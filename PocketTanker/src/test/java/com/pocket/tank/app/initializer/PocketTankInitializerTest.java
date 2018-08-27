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

import com.pocket.tank.app.menu.WelcomeMenu;
import com.pocket.tank.app.menu.shower.IMenuShower;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ PocketTankInitializer.class })
public class PocketTankInitializerTest {

@Mock
WelcomeMenu welcomeMenu;

@Mock
IMenuShower fightMenu ;
@Before
public void setup(){
	MockitoAnnotations.initMocks(this);
	PowerMockito.mockStatic(PocketTankInitializer.class);
}
@Test
public void initialize(){
	Mockito.doNothing().when(fightMenu).showMenu(welcomeMenu);
	Mockito.doNothing().when(fightMenu).actOnMenuSelect();
	PocketTankInitializer.initialize();
}
}
