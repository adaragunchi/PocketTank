package com.pocket.tank.app.menu.delegate;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.pocket.tank.app.enums.FightStatus;
import com.pocket.tank.app.fighter.actions.FighterActionContext;
import com.pocket.tank.app.fighter.actions.IFighterActionStrategy;
import com.pocket.tank.app.model.FightInfo;
import com.pocket.tank.app.model.Fighter;

public class OpponentActionDelegateTest {
	@InjectMocks
	OpponentActionDelegate opponentActionDelegate;
	@Mock
	FightInfo fightInfo;
	@Mock
	FighterActionContext fighterActionContext;
	
	@Mock
	IFighterActionStrategy fighterActionStrategy;
	

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		//PowerMockito.mockStatic(ReadInput.class);
	}

	@Test
	public void actOnMenuSelection() {
		FightInfo fight = new FightInfo();
		fight.setStatus(FightStatus.LIVE);
		Fighter opponentFighter = new Fighter();
		Fighter userFighter = new Fighter();
		opponentFighter.setFighterName("Jack");
		Map<String,Integer> selectedWeaponPower=new HashMap<>();
		selectedWeaponPower.put("GUN", 10);
		userFighter.setSelectedWeaponPower(selectedWeaponPower);
		opponentFighter.setSelectedWeaponPower(selectedWeaponPower);
		fight.setOpponentFighter(opponentFighter);
		fight.setUserFighter(userFighter);
		IMenuActionDelegate.fight.loadFight(fight);
		Mockito.doNothing().when(fighterActionContext).executeFighterAction(Mockito.isA(Fighter.class));
		Mockito.doNothing().when(fighterActionStrategy).performFighterAction(Mockito.isA(Fighter.class));
		opponentActionDelegate.actOnMenuSelection("1");
		opponentActionDelegate.actOnMenuSelection("2");
		opponentActionDelegate.actOnMenuSelection("3");
	}
	
	@Test
	public void actOnOpponentAction() {
		FightInfo fight = new FightInfo();
		Fighter opponentFighter = new Fighter();
		Fighter userFighter = new Fighter();
		opponentFighter.setFighterName("Jack");
		Map<String,Integer> selectedWeaponPower=new HashMap<>();
		selectedWeaponPower.put("GUN", 10);
		userFighter.setSelectedWeaponPower(selectedWeaponPower);
		opponentFighter.setSelectedWeaponPower(selectedWeaponPower);
		fight.setOpponentFighter(opponentFighter);
		fight.setUserFighter(userFighter);
		Mockito.doNothing().when(fighterActionContext).executeFighterAction(Mockito.isA(Fighter.class));
		IMenuActionDelegate.fight.loadFight(fight);
		opponentActionDelegate.actOnOpponentAction();
	}
}
