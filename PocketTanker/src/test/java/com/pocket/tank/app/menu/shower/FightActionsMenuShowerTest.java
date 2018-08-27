package com.pocket.tank.app.menu.shower;

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
import com.pocket.tank.app.enums.WeaponsMenuItems;
import com.pocket.tank.app.menu.IMenu;
import com.pocket.tank.app.menu.delegate.IMenuActionDelegate;
import com.pocket.tank.app.model.FightInfo;
import com.pocket.tank.app.model.Fighter;
import com.pocket.tank.app.util.ReadInput;
/*
@RunWith(PowerMockRunner.class)
@PrepareForTest({ ReadInput.class })*/
public class FightActionsMenuShowerTest {
	
	@InjectMocks
	FightActionsMenuShower fightActionsMenuShower;
	
	@Mock
	IMenu iMenu;
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		//PowerMockito.mockStatic(ReadInput.class);
	}
	
	@Test
	public void actOnMenuSelect() {
		FightInfo fight = new FightInfo();
		Fighter userFighter=new Fighter();
		Map<String,Integer> map=new HashMap<>();
		map.put(WeaponsMenuItems.BOMB.getWeapon(), 100);
		userFighter.setAge(19);
		userFighter.setCountry("India");
		userFighter.setFighterName("User");
		userFighter.setSelectedWeaponPower(map);
		Fighter opponentFighter=new Fighter();
		opponentFighter.setAge(19);
		opponentFighter.setCountry("India");
		opponentFighter.setFighterName("Rock");
		opponentFighter.setSelectedWeaponPower(map);
		fight.setOpponentFighter(opponentFighter);
		fight.setUserFighter(userFighter);
		fight.setStatus(FightStatus.FINISHED);
		IMenuActionDelegate.fight.loadFight(fight);
		//fightActionsMenuShower.actOnMenuSelect();
	}
}
