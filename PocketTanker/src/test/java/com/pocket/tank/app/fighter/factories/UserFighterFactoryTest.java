package com.pocket.tank.app.fighter.factories;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class UserFighterFactoryTest {
	@InjectMocks
	UserFighterFactory userFighterFactory;
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getOpponentFighterInstance() {
		Assert.assertNull(userFighterFactory.getOpponentFighterInstance());
	}

	@Test
	public void getUserFighterInstance() {
		Assert.assertNotNull(userFighterFactory.getUserFighterInstance());
	}
}
