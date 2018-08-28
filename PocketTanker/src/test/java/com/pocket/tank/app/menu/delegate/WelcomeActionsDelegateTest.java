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
import com.pocket.tank.app.fighter.factories.UserFighterFactory;
import com.pocket.tank.app.fighter.operations.UserFighterOperations;
import com.pocket.tank.app.model.FightInfo;
import com.pocket.tank.app.model.Fighter;

public class WelcomeActionsDelegateTest {
	@InjectMocks
	WelcomeActionsDelegate welcomeActionsDelegate;
	@Mock
	FightInfo fightInfo;
	@Mock
	FighterActionContext fighterActionContext;

	@Mock
	IFighterActionStrategy fighterActionStrategy;

	@Mock
	UserFighterOperations userOperation;

	@Mock
	UserFighterFactory userFighterFactory;

	@Mock
	UserFighterOperations userFighterOperations;
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void actOnMenuSelection() {
		FightInfo fight = new FightInfo();
		fight.setStatus(FightStatus.LIVE);
		Fighter opponentFighter = new Fighter();
		Fighter userFighter = new Fighter();
		opponentFighter.setFighterName("Jack");
		Map<String, Integer> selectedWeaponPower = new HashMap<>();
		selectedWeaponPower.put("GUN", 10);
		userFighter.setSelectedWeaponPower(selectedWeaponPower);
		opponentFighter.setSelectedWeaponPower(selectedWeaponPower);
		fight.setOpponentFighter(opponentFighter);
		fight.setUserFighter(userFighter);
		IMenuActionDelegate.fight.loadFight(fight);
		Mockito.when(userOperation.createUserFighter()).thenReturn(userFighter);
		Mockito.doNothing().when(fighterActionContext).executeFighterAction(Mockito.isA(Fighter.class));
		Mockito.doNothing().when(fighterActionStrategy).performFighterAction(Mockito.isA(Fighter.class));
		//welcomeActionsDelegate.actOnMenuSelection("4");
	}

}
