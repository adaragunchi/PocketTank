package com.pocket.tank.app.fighter.operations;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.pocket.tank.app.util.ReadInput;

import junit.framework.Assert;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ ReadInput.class })
public class OpponentFighterOperationsTest {
	@InjectMocks
	OpponentFighterOperations opponentFighterOperations;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		PowerMockito.mockStatic(ReadInput.class);
	}

	@Test
	public void createOpponentFighter() {
		PowerMockito.when(ReadInput.readString()).thenReturn("1");
		Assert.assertNotNull(opponentFighterOperations.createOpponentFighter());
		Assert.assertNull(opponentFighterOperations.createUserFighter());
	}
}
