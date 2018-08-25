package com.pocket.tank.app.fighter.factories;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class OpponentFighterFactoryTest {
	@InjectMocks
	OpponentFighterFactory opponentFighterFactory;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getOpponentFighterInstance() {
		Assert.assertNotNull(opponentFighterFactory.getOpponentFighterInstance());
	}

	@Test
	public void getUserFighterInstance() {
		Assert.assertNull(opponentFighterFactory.getUserFighterInstance());
	}
}
