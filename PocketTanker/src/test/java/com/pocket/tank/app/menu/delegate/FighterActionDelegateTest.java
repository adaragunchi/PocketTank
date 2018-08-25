package com.pocket.tank.app.menu.delegate;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;

import com.pocket.tank.app.fighter.actions.FighterActionContext;
import com.pocket.tank.app.fighter.actions.IFighterActionStrategy;
import com.pocket.tank.app.model.FightInfo;
import com.pocket.tank.app.model.Fighter;
import com.pocket.tank.app.util.ReadInput;

public class FighterActionDelegateTest {

	@InjectMocks
	FighterActionDelegate FighterActionDelegate;
	@Mock
	FightInfo fightInfo;
	@Mock
	FighterActionContext fighterActionContext;
	
	@Mock
	IFighterActionStrategy fighterActionStrategy;
	

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		PowerMockito.mockStatic(ReadInput.class);
	}

	@Test
	public void actOnMenuSelection() {
		FightInfo fight = new FightInfo();
		Fighter opponentFighter = new Fighter();
		opponentFighter.setFighterName("fighterName");
		fight.setOpponentFighter(opponentFighter);
		Map<String,Integer> selectedWeaponPower=new HashMap<>();
		selectedWeaponPower.put("GUN", 10);
		opponentFighter.setSelectedWeaponPower(selectedWeaponPower);
		IMenuActionDelegate.fight.loadFight(fight);
		Mockito.doNothing().when(fighterActionContext).executeFighterAction(Mockito.isA(Fighter.class));
		Mockito.doNothing().when(fighterActionStrategy).performFighterAction(Mockito.isA(Fighter.class));
		FighterActionDelegate.actOnMenuSelection("1");
		
	}
}
