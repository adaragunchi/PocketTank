package com.pocket.tank.app.menu.shower;

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

import com.pocket.tank.app.menu.IMenu;
import com.pocket.tank.app.model.FightInfo;
import com.pocket.tank.app.model.Fighter;
import com.pocket.tank.app.util.ReadInput;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ ReadInput.class })
public class FightActionsMenuShowerTest {
	
	@InjectMocks
	FightActionsMenuShower fightActionsMenuShower;
	
	@Mock
	IMenu iMenu;
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		PowerMockito.mockStatic(ReadInput.class);
	}
	
	@Test
	public void actOnMenuSelect() {
		FightInfo fight = new FightInfo();
		Fighter userFighter=new Fighter();
		userFighter.setAge(19);
		userFighter.setCountry("India");
		userFighter.setFighterName("User");
		Fighter opponentFighter=new Fighter();
		opponentFighter.setAge(19);
		opponentFighter.setCountry("India");
		opponentFighter.setFighterName("Rock");
		fight.setOpponentFighter(opponentFighter);
		fight.setUserFighter(userFighter);
		Mockito.when(ReadInput.readInt()).thenReturn("1");
		fightActionsMenuShower.actOnMenuSelect();
	}
}
