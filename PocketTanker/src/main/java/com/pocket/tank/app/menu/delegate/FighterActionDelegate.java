/**
 * 
 */
package com.pocket.tank.app.menu.delegate;

import com.pocket.tank.app.enums.FightStatus;
import com.pocket.tank.app.fighter.actions.ActionHitTargetImpl;
import com.pocket.tank.app.fighter.actions.ActionMissedTargetImpl;
import com.pocket.tank.app.fighter.actions.FighterActionContext;
import com.pocket.tank.app.menu.FighterActionsMenu;
import com.pocket.tank.app.menu.shower.FightActionsMenuShower;
import com.pocket.tank.app.menu.shower.IMenuShower;

/**
 * @author Manjunath
 *
 */
public class FighterActionDelegate implements IMenuActionDelegate{

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
			if(isFightON()) {
				fight.setStatus(FightStatus.onHold);
			}
			fightSaver.saveFighterInfo(fight);
			readOnSaveExitGame();
			presentMenu();
			break;
		default:
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
		System.out.println("Fight is saved. You can resume the game anytime!");
	}
	/**
	 * 
	 * @return
	 */
	@Override
	public boolean isFightON() {
		if(0==FightStatus.live.compareTo(fight.getStatus())) {
			return true;
		}
		return false;
	}

	@Override
	public void showMenuForNextAction() {
		IMenuShower fightMenu = new FightActionsMenuShower();
		fightMenu.showMenu(new FighterActionsMenu());
		fightMenu.actOnMenuSelect();
	}
	
	public void presentMenu() {
		if(isFightON()) {
			//show fight action menu
			showMenuForNextAction();
		}else {
			IMenuActionDelegate welcomeDelegate = new WelcomeActionsDelegate();
			welcomeDelegate.showMenuForNextAction();
		}
	}

	@Override
	public void actOnOpponentAction() {
		
	}
	
}
