package com.pocket.tank.app.fighter.operations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.pocket.tank.app.util.ReadInput;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ ReadInput.class })
public class FighterOperationsDelegateTest {

	@InjectMocks
	FighterOperationsDelegate fighterOperationsDelegate;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		PowerMockito.mockStatic(ReadInput.class);
	}

	@Test
	public void getWeaponPower() {
		Assert.assertNotNull(fighterOperationsDelegate.getWeaponPower("1"));
		Assert.assertNotNull(fighterOperationsDelegate.getWeaponPower("2"));
		Assert.assertNotNull(fighterOperationsDelegate.getWeaponPower("3"));
		Assert.assertNotNull(fighterOperationsDelegate.getWeaponPower("4"));
		Assert.assertNotNull(fighterOperationsDelegate.getWeaponPower("5"));
		PowerMockito.when(ReadInput.readString()).thenReturn("1");
		Assert.assertNotNull(fighterOperationsDelegate.getWeaponPower("6"));
	}

	@Test
	public void createOpponentFighter() {
		PowerMockito.when(ReadInput.readString()).thenReturn("1");
		Assert.assertNotNull(fighterOperationsDelegate.createOpponentFighter());
	}
}