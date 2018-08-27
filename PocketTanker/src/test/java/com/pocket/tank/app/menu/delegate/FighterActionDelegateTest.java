package com.pocket.tank.app.menu.delegate;

import static org.mockito.Mockito.doAnswer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;

import com.pocket.tank.app.enums.FightStatus;
import com.pocket.tank.app.model.FightInfo;
import com.pocket.tank.app.model.Fighter;
import com.pocket.tank.app.util.ReadInput;

public class FighterActionDelegateTest {

	@InjectMocks
	FighterActionDelegate fighterActionDelegate;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		PowerMockito.mockStatic(ReadInput.class);
	}

	@Test
	public void actOnMenuSelection() {
		FightInfo fight = new FightInfo();
		fight.setStatus(FightStatus.live);
		Fighter opponentFighter = new Fighter(); 
		opponentFighter.setFighterName("Jack");
		Fighter userFighter = new Fighter();
		Map<String,Integer> selectedWeaponPower=new HashMap<>(); 
		selectedWeaponPower.put("GUN", 10);
		userFighter.setSelectedWeaponPower(selectedWeaponPower);
		fight.setOpponentFighter(opponentFighter); 
		fight.setUserFighter(userFighter);
		fight.setStatus(FightStatus.live);
		IMenuActionDelegate.fight.loadFight(fight);
		fighterActionDelegate.actOnMenuSelection("1");
		fighterActionDelegate.actOnMenuSelection("2");
		fighterActionDelegate.actOnMenuSelection("3");
		
		/*
		 * FightInfo fight = new FightInfo(); fight.setStatus(FightStatus.live); Fighter
		 * opponentFighter = new Fighter(); Fighter userFighter = new Fighter();
		 * opponentFighter.setFighterName("Jack"); Map<String,Integer>
		 * selectedWeaponPower=new HashMap<>(); selectedWeaponPower.put("GUN", 10);
		 * userFighter.setSelectedWeaponPower(selectedWeaponPower);
		 * fight.setOpponentFighter(opponentFighter); fight.setUserFighter(userFighter);
		 * IMenuActionDelegate.fight.loadFight(fight);
		 * Mockito.doNothing().when(fighterActionContext).executeFighterAction(Mockito.
		 * isA(Fighter.class));
		 * Mockito.doNothing().when(fighterActionStrategy).performFighterAction(Mockito.
		 * isA(Fighter.class)); FighterActionDelegate.actOnMenuSelection("1");
		 * FighterActionDelegate.actOnMenuSelection("2");
		 * //FighterActionDelegate.actOnMenuSelection("3");
		 */
	}
}
