package com.pocket.tank.app.fightinfo.saver;

import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.pocket.tank.app.model.FightInfo;
import com.pocket.tank.app.model.Fighter;

public class FighterInfoSaverImplTest {

	@InjectMocks
	FighterInfoSaverImpl fighterInfoSaverImpl;

	@Mock
	ObjectOutputStream oos;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void saveFighter() {
		Fighter fighter = new Fighter();
		Map<String, Integer> map = new HashMap<>();
		map.put("GUN", 10);
		fighter.setSelectedWeaponPower(map);
		fighter.setAge(12);
		fighter.setFighterName("Rock");
		fighterInfoSaverImpl.saveFighter(fighter);
	}

	@Test
	public void saveFighterInfo() {
		fighterInfoSaverImpl.saveFighterInfo(new FightInfo());
	}
	
	@Test
	public void getFighterInfo() {
		fighterInfoSaverImpl.getFightInfo();
	}
	
	@Test
	public void getFighter() {
		fighterInfoSaverImpl.getFighter();
	}
	
}
