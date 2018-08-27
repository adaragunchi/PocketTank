package com.pocket.tank.app.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ InputReader.class })
public class ReadInputTest {

	
	
	@Mock
	InputReader instance;
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
		PowerMockito.mockStatic(InputReader.class);
	}
	
	@Test
	public void readString(){
		PowerMockito.when(InputReader.getInstance()).thenReturn(instance);
		Mockito.when(instance.readString()).thenReturn("1");
		Assert.assertNotNull(ReadInput.readString());
	}
}
