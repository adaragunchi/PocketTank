/**
 * 
 */
package com.pocket.tank.app.menu.delegate;

import com.pocket.tank.app.enums.FightStatus;
import com.pocket.tank.app.fighter.factories.OpponentFighterFactory;
import com.pocket.tank.app.fighter.factories.UserFighterFactory;
import com.pocket.tank.app.fighter.factories.producer.FighterFactoryProducer;
import com.pocket.tank.app.fighter.operations.OpponentFighterOperations;
import com.pocket.tank.app.fighter.operations.UserFighterOperations;
import com.pocket.tank.app.menu.WelcomeMenu;
import com.pocket.tank.app.menu.shower.IMenuShower;
import com.pocket.tank.app.menu.shower.WelcomeMenuShower;
import com.pocket.tank.app.model.FightInfo;
import com.pocket.tank.app.model.Fighter;

/**
 * @author Manjunath
 *
 */
public class WelcomeActionsDelegate implements IMenuActionDelegate {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pocket.tank.menu.shower.delegate.IMenuShowerDelegate#actOnMenuSelection(
	 * java.lang.String)
	 */
	@Override
	public void actOnMenuSelection(String input) {
		switch (input) {
		case "1":
			fight.resetFight(fight);
			fight.setUserFighter(getUserFighter());
			fight.setOpponentFighter(getOpponentFighter());
			beginFight();
			break;
		case "2":
			fightSaver.getFighter();
			showMenuForNextAction();
			break;
		case "3":
			System.out.println("loading your fight..");
			FightInfo existingfight = fightSaver.getFightInfo();
			fight.loadFight(existingfight);
			beginFight();
			break;
		case "4":
			System.out.println(fight.getUserFighter().getFighterName()+" Exits from the Game");
			break;
		default:
			break;
		}

	}

	private void beginFight() {
		organizeFight();
		fight.setStatus(FightStatus.live);
		IMenuActionDelegate fightActionsDelegate = new FighterActionDelegate();
		fightActionsDelegate.showMenuForNextAction();
	}

	private void organizeFight() {
		System.out.println("FIGHT BEGINS..");
		System.out.println("Your opponent :" +fight.getOpponentFighter().toString()+"\n");
	}
	
	private Fighter getUserFighter() {
		UserFighterFactory fighterFactory = (UserFighterFactory) FighterFactoryProducer.getFighterFacoty("USERFIGHTER");
		UserFighterOperations userOperation = fighterFactory.getUserFighterInstance();
		return userOperation.createUserFighter();
	}

	private Fighter getOpponentFighter() {
		OpponentFighterFactory opponentFactory = (OpponentFighterFactory) FighterFactoryProducer
				.getFighterFacoty("OPPFIGHTER");
		OpponentFighterOperations opponentOperation = opponentFactory.getOpponentFighterInstance();
		return opponentOperation.createOpponentFighter();
	}

	@Override
	public void showMenuForNextAction() {
		IMenuShower welcomeMenu = new WelcomeMenuShower();
		welcomeMenu.showMenu(new WelcomeMenu());
		welcomeMenu.actOnMenuSelect();
	}

	@Override
	public void actOnOpponentAction() {
		System.out.println("This method is not supported here");
	}

	@Override
	public boolean isFightON() {
		if(0==FightStatus.live.compareTo(fight.getStatus())) {
			return true;
		}
		return false;
	}

}
