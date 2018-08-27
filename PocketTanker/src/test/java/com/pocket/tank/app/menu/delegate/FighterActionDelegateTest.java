package com.pocket.tank.app.menu.delegate;

import java.util.HashMap;
import java.util.Map;

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

import com.pocket.tank.app.enums.FightStatus;
import com.pocket.tank.app.fightinfo.saver.FightInfoSaver;
import com.pocket.tank.app.initializer.FightInitializer;
import com.pocket.tank.app.model.FightInfo;
import com.pocket.tank.app.model.Fighter;
import com.pocket.tank.app.util.ReadInput;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ FightInitializer.class,ReadInput.class})
public class FighterActionDelegateTest {

	@InjectMocks
	FighterActionDelegate fighterActionDelegate;
	
	@Mock
	FightInfoSaver fightInfoSaver;
	
	

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		PowerMockito.mock(FightInitializer.class);
		PowerMockito.mock(ReadInput.class);
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
		Mockito.doNothing().when(fightInfoSaver).saveFighter(userFighter);
		/*Mockito.doNothing().doThrow(Exception.class).when(FightInitializer.class);
		FightInitializer.initialize();
		Mockito.when(ReadInput.readString()).thenReturn("1");
		fighterActionDelegate.actOnMenuSelection("3");*/

	}
}
