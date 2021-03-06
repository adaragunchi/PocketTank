/**
 * 
 */
package com.pocket.tank.app.menu.delegate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.pocket.tank.app.enums.FightStatus;
import com.pocket.tank.app.enums.FighterActions;
import com.pocket.tank.app.fighter.actions.ActionHitTargetImpl;
import com.pocket.tank.app.fighter.actions.ActionMissedTargetImpl;
import com.pocket.tank.app.fighter.actions.FighterActionContext;

/**
 * @author Manjunath
 * 
 * Action for opponent is randomly picked and executed here.
 *
 */
public class OpponentActionDelegate implements IMenuActionDelegate {

	/**
	 * randomly selected actions among available actions are performed here.
	 */
	@Override
	public void actOnMenuSelection(String input) {
		FighterActionContext context;
		switch (input) {
		case "1":
			System.out.println(fight.getOpponentFighter().getFighterName()+" hit you");
			context = new FighterActionContext(new ActionHitTargetImpl());
			context.executeFighterAction(fight.getOpponentFighter());
			break;
		case "2":
			System.out.println(fight.getOpponentFighter().getFighterName()+" missed hit on you!");
			context = new FighterActionContext(new ActionMissedTargetImpl());
			context.executeFighterAction(fight.getOpponentFighter());
			break;
		default:
			break;
		}
	}

	@Override
	public boolean isFightON() {
		if(0==FightStatus.LIVE.compareTo(fight.getStatus())) {
			return true;
		}
		return false;
	}
	
	@Override
	public void actOnOpponentAction() {
		String input = getRandomActionsForOpponent();
		actOnMenuSelection(input);
	}
	
	/**
	 * Chooses random action among available fight actions for opponent.
	 * Noting that Opponent can not choose to exit the game.
	 * @return
	 */
	private String getRandomActionsForOpponent() {
		List<String> opponentactions = new ArrayList<>();
		for (FighterActions fighterActions : FighterActions.values()) {
			if(!FighterActions.SAVE_AND_EXIT.getActionName().equalsIgnoreCase(fighterActions.getActionName())) {
				opponentactions.add(fighterActions.getActionName());
			}
		}
		int actionSelected = getRandomInt(0, opponentactions.size());
		String randomAction = opponentactions.get(actionSelected).split(" ")[0];
		return randomAction;
	}
	
	public int getRandomInt(final int min, final int max) {
		return ThreadLocalRandom.current().nextInt(min, max);
	}


}
