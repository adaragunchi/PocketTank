package com.pocket.tank.app.fighter.actions;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.pocket.tank.app.model.Fighter;

public class FighterActionContextTest {
	@InjectMocks
	FighterActionContext fighterActionContext;
	@Mock
	IFighterActionStrategy fighterActionStrategy;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void performFighterAction() {
		Fighter fighter = new Fighter();
		Map<String, Integer> map = new HashMap<>();
		map.put("GUN", 10);
		fighter.setSelectedWeaponPower(map);
		fighter.setAge(12);
		fighter.setFighterName("Rock");
		fighterActionContext.executeFighterAction(fighter);
	}
}
