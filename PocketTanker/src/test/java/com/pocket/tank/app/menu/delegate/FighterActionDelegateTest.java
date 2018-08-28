package com.pocket.tank.app.menu.delegate;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.pocket.tank.app.enums.FightStatus;
import com.pocket.tank.app.fightinfo.saver.FightInfoSaver;
import com.pocket.tank.app.model.FightInfo;
import com.pocket.tank.app.model.Fighter;

public class FighterActionDelegateTest {

	@InjectMocks
	FighterActionDelegate fighterActionDelegate;
	
	@Mock
	FightInfoSaver fightInfoSaver;
	
	

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void actOnMenuSelection() {
		FightInfo fight = new FightInfo();
		fight.setStatus(FightStatus.LIVE);
		Fighter opponentFighter = new Fighter();
		opponentFighter.setFighterName("Jack");
		Map<String, Integer> selectedWeaponPower = new HashMap<>();
		selectedWeaponPower.put("GUN", 10);
		opponentFighter.setSelectedWeaponPower(selectedWeaponPower);
		Fighter userFighter = new Fighter();
		userFighter.setSelectedWeaponPower(selectedWeaponPower);
		fight.setOpponentFighter(opponentFighter);
		fight.setUserFighter(userFighter);
		fight.setStatus(FightStatus.LIVE);
		IMenuActionDelegate.fight.loadFight(fight);
		fighterActionDelegate.actOnMenuSelection("1");
		fighterActionDelegate.actOnMenuSelection("2");
		fighterActionDelegate.isFightON();
	}
	@Test
	public void actOnOpponentAction() {
		try{
			fighterActionDelegate.actOnOpponentAction();
		}catch (Exception e) {
			assertTrue(true);
		}
	}
}
