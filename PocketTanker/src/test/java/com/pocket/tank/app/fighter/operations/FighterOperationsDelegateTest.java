package com.pocket.tank.app.fighter.operations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class FighterOperationsDelegateTest {

	@InjectMocks
	FighterOperationsDelegate fighterOperationsDelegate;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getWeaponPower() {
		/*Assert.assertNotNull(fighterOperationsDelegate.getWeaponPower("1"));
		Assert.assertNotNull(fighterOperationsDelegate.getWeaponPower("2"));
		Assert.assertNotNull(fighterOperationsDelegate.getWeaponPower("3"));
		Assert.assertNotNull(fighterOperationsDelegate.getWeaponPower("4"));
		Assert.assertNotNull(fighterOperationsDelegate.getWeaponPower("5"));*/
	}

	@Test
	public void createOpponentFighter() {
		Assert.assertNotNull(fighterOperationsDelegate.createOpponentFighter());
	}
}