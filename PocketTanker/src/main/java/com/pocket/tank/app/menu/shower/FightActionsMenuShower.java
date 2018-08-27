/**
 * 
 */
package com.pocket.tank.app.menu.shower;

import com.pocket.tank.app.initializer.FightInitializer;
import com.pocket.tank.app.initializer.PocketTankInitializer;
import com.pocket.tank.app.menu.FighterActionsMenu;
import com.pocket.tank.app.results.delegate.FightResultShowerDelegate;

/**
 * @author Manjunath
 * 
 * Action of user in a fight is cought and implemented. Opponent's action also initiates post user's action is complete following 
 * result display for both players.
 *
 */
public class FightActionsMenuShower extends IMenuShower {

	/**
	 * user is navigated to perform action he chose while playing fight.
	 */
	@Override
	public void actOnMenuSelect() {
		menu = new FighterActionsMenu();
		String input = menu.getUserInput();
		getFighterActionShowerDelegate().actOnMenuSelection(input);
		getOpponentActionShowerDelegate().actOnOpponentAction();
		getResultShower().notifyFightIntermediateResults();
		presentMenu();
	}
	
	private FightResultShowerDelegate getResultShower() {
		return new FightResultShowerDelegate();
	}

	private void presentMenu() {
		if(getFighterActionShowerDelegate().isFightON()) {
			FightInitializer.initialize();
		}else {
			PocketTankInitializer.initialize();
		}
	}
}