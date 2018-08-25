package com.pocket.tank.app.fighter.factories.producer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class FighterFactoryProducerTest {

	@InjectMocks
	FighterFactoryProducer fighterFactoryProducer;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getFighterFacoty() {
		Assert.assertNotNull(FighterFactoryProducer.getFighterFacoty("OPPFIGHTER"));
		Assert.assertNotNull(FighterFactoryProducer.getFighterFacoty("USERFIGHTER"));
		Assert.assertNull(FighterFactoryProducer.getFighterFacoty("UNKNOWN"));
	}
}
