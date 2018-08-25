package com.pocket.tank.app.fighter.operations;

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

import junit.framework.Assert;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ReadInput.class})
public class UserFighterOperationsTest {

	@InjectMocks
	UserFighterOperations userFighterOperations;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		PowerMockito.mockStatic(ReadInput.class);
	}

	/**
	 * need to check
	 */
	@Test
	public void createUserFighter() {
		Mockito.when(ReadInput.readString()).thenReturn("1");
		Mockito.when(ReadInput.readInt()).thenReturn("19");
		Assert.assertNotNull(userFighterOperations.createUserFighter());
		Assert.assertNull(userFighterOperations.createOpponentFighter());
	}
}
