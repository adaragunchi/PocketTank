/**
 * 
 */
package com.pocket.tank.app.menu.delegate;

import com.pocket.tank.app.constants.Constants;
import com.pocket.tank.app.enums.FightStatus;
import com.pocket.tank.app.fighter.factories.OpponentFighterFactory;
import com.pocket.tank.app.fighter.factories.UserFighterFactory;
import com.pocket.tank.app.fighter.factories.producer.FighterFactoryProducer;
import com.pocket.tank.app.fighter.operations.OpponentFighterOperations;
import com.pocket.tank.app.fighter.operations.UserFighterOperations;
import com.pocket.tank.app.initializer.FightInitializer;
import com.pocket.tank.app.initializer.PocketTankInitializer;
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
			PocketTankInitializer.initialize();
			break;
		case "3":
			fightSaver.getFightInfo();
			PocketTankInitializer.initialize();
			break;
		case "4":
			System.out.println(Constants.LOAD_FIGHT);
			FightInfo existingfight = fightSaver.getFightInfo();
			validateExistingFight(existingfight);
			break;
		case "5":
			exitGame();
			break;
		default:
			System.out.println(Constants.INVILID_INPUT);
			PocketTankInitializer.initialize();
			break;
		}

	}

	private void validateExistingFight(FightInfo existingFight) {
		if(null != existingFight && (null == existingFight.getUserFighter() ||
				!FightStatus.onHold.toString().equalsIgnoreCase(existingFight.getStatus().toString()))) {
			System.out.println(Constants.NO_FIGHT_TO_RESUME);
			PocketTankInitializer.initialize();
		}else {
			fight.loadFight(existingFight);
			beginFight();
		}
	}
	
	private void beginFight() {
		organizeFight();
		fight.setStatus(FightStatus.live);
		FightInitializer.initialize();
	}

	private void organizeFight() {
		System.out.println(Constants.BEGIN_FIGHT);
		System.out.println("Your opponent :" +fight.getOpponentFighter().toString()+"\n");
	}
	
	private Fighter getUserFighter() {
		UserFighterFactory fighterFactory = (UserFighterFactory) FighterFactoryProducer.getFighterFacoty(Constants.FIGHTER_TYPE_USER);
		UserFighterOperations userOperation = fighterFactory.getUserFighterInstance();
		return userOperation.createUserFighter();
	}

	private Fighter getOpponentFighter() {
		OpponentFighterFactory opponentFactory = (OpponentFighterFactory) FighterFactoryProducer
				.getFighterFacoty(Constants.FIGHTER_TYPE_OPPONENT);
		OpponentFighterOperations opponentOperation = opponentFactory.getOpponentFighterInstance();
		return opponentOperation.createOpponentFighter();
	}

	@Override
	public void actOnOpponentAction() {
		System.out.println(Constants.NOT_SUPPORTED_METHOD);
	}


	public boolean isFightON() {
		if(0==FightStatus.live.compareTo(fight.getStatus())) {
			return true;
		}
		return false;
	}
	
	private void exitGame() {
		System.out.println("You exit the Game");
		System.exit(0);
	}
}
