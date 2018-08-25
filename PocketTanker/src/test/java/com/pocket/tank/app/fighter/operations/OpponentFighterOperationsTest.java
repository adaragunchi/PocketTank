package com.pocket.tank.app.fighter.operations;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import junit.framework.Assert;

public class OpponentFighterOperationsTest {
	@InjectMocks
	OpponentFighterOperations opponentFighterOperations;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void createOpponentFighter() {
		Assert.assertNotNull(opponentFighterOperations.createOpponentFighter());
		Assert.assertNull(opponentFighterOperations.createUserFighter());
	}
}
