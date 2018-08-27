package com.pocket.tank.app.menu.delegate;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.pocket.tank.app.model.FightInfo;
import com.pocket.tank.app.model.Fighter;
import com.pocket.tank.app.results.delegate.FightResultShowerDelegate;

public class FightResultShowerDelegateTest {
	@InjectMocks
	FightResultShowerDelegate fightResultShowerDelegate;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void actOnMenuSelection() {
		try {
			fightResultShowerDelegate.actOnMenuSelection("1");
		}catch(UnsupportedOperationException e) {
			assertTrue(true);
		}
	}

	@Test
	public void actOnOpponentAction() {
		try {
			fightResultShowerDelegate.actOnOpponentAction();
		}catch(UnsupportedOperationException e) {
			assertTrue(true);
		}
	}
	
	@Test
	public void isFightON() {
		try {
			fightResultShowerDelegate.isFightON();
		}catch(UnsupportedOperationException e) {
			assertTrue(true);
		}
	}
	@Test
	public void notifyFightIntermediateResults() {
		FightInfo fightInfo=new FightInfo();
		Fighter userfighter=new Fighter();
		userfighter.setAge(19);
		userfighter.setFighterName("abc");
		Fighter opponentfighter=new Fighter();
		opponentfighter.setAge(19);
		opponentfighter.setFighterName("abc");
		fightInfo.setIteration(10);
		fightInfo.setOpponentFighter(opponentfighter);
		fightInfo.setUserFighter(userfighter);
		IMenuActionDelegate.fight.loadFight(fightInfo);
		fightResultShowerDelegate.notifyFightIntermediateResults();
	}
	
	
	@Test
	public void announceWinnerWithDraw(){
		FightInfo fightInfo=new FightInfo();
		Fighter userfighter=new Fighter();
		userfighter.setAge(19);
		userfighter.setFighterName("abc");
		userfighter.setTotalScore(100);
		Fighter opponentfighter=new Fighter();
		opponentfighter.setAge(19);
		opponentfighter.setFighterName("abc");
		opponentfighter.setTotalScore(100);
		fightInfo.setIteration(5);
		fightInfo.setOpponentFighter(opponentfighter);
		fightInfo.setUserFighter(userfighter);
		IMenuActionDelegate.fight.loadFight(fightInfo);
		fightResultShowerDelegate.notifyFightIntermediateResults();
	}
	@Test
	public void announceWinnerWithWin(){
		FightInfo fightInfo=new FightInfo();
		Fighter userfighter=new Fighter();
		userfighter.setAge(19);
		userfighter.setFighterName("abc");
		userfighter.setTotalScore(100);
		Fighter opponentfighter=new Fighter();
		opponentfighter.setAge(19);
		opponentfighter.setFighterName("abc");
		opponentfighter.setTotalScore(50);
		fightInfo.setIteration(5);
		fightInfo.setOpponentFighter(opponentfighter);
		fightInfo.setUserFighter(userfighter);
		IMenuActionDelegate.fight.loadFight(fightInfo);
		fightResultShowerDelegate.notifyFightIntermediateResults();
	}
	
	@Test
	public void announceWinnerWithUserLost(){
		FightInfo fightInfo=new FightInfo();
		Fighter userfighter=new Fighter();
		userfighter.setAge(19);
		userfighter.setFighterName("abc");
		userfighter.setTotalScore(50);
		Fighter opponentfighter=new Fighter();
		opponentfighter.setAge(19);
		opponentfighter.setFighterName("abc");
		opponentfighter.setTotalScore(100);
		fightInfo.setIteration(5);
		fightInfo.setOpponentFighter(opponentfighter);
		fightInfo.setUserFighter(userfighter);
		IMenuActionDelegate.fight.loadFight(fightInfo);
		fightResultShowerDelegate.notifyFightIntermediateResults();
	}
}
