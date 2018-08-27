/**
 * 
 */
package com.pocket.tank.app.menu.delegate;

import com.pocket.tank.app.constants.Constants;
import com.pocket.tank.app.enums.FightStatus;
import com.pocket.tank.app.fighter.actions.ActionHitTargetImpl;
import com.pocket.tank.app.fighter.actions.ActionMissedTargetImpl;
import com.pocket.tank.app.fighter.actions.FighterActionContext;
import com.pocket.tank.app.initializer.FightInitializer;
import com.pocket.tank.app.initializer.PocketTankInitializer;

/**
 * @author Manjunath
 * 
 * Once user picks from available fight actions, the action is performed here.
 *
 */
public class FighterActionDelegate implements IMenuActionDelegate{

	/**
	 * User picked actions are performed here.
	 */
	@Override
	public void actOnMenuSelection(String input) {
		FighterActionContext context;
		switch(input) {
		case "1":
			readActionHitStatus();
			context = new FighterActionContext(new ActionHitTargetImpl());
			context.executeFighterAction(fight.getUserFighter());
			break;
		case "2":
			readActionMissedStatus();
			context = new FighterActionContext(new ActionMissedTargetImpl());
			context.executeFighterAction(fight.getUserFighter());
			break;
		case "3":
			fight.setStatus(FightStatus.ON_HOLD);
			fightSaver.saveFighterInfo(fight);
			readOnSaveExitGame();
			presentMenu();
			break;
		default:
			System.out.println("invalid action! Please choose again.");
			presentMenu();
			break;
			
		}
	}

	private void readActionHitStatus() {
		System.out.println("You hit "+fight.getOpponentFighter().getFighterName());
	}
	
	private void readActionMissedStatus() {
		System.out.println("Your hit on "+fight.getOpponentFighter().getFighterName()+" is missed.");
	}
	
	private void readOnSaveExitGame() {
		System.out.println(Constants.FIGHT_SAVED);
	}
	
	public void presentMenu() {
		if(isFightON()) {
			FightInitializer.initialize();
		}else {
			PocketTankInitializer.initialize();
		}
	}

	@Override
	public void actOnOpponentAction() {
		throw new UnsupportedOperationException(Constants.NOT_SUPPORTED_METHOD);		
	}
	
	@Override
	public boolean isFightON() {
		if(0==FightStatus.LIVE.compareTo(fight.getStatus())) {
			return true;
		}
		return false;
	}
	
}
