/**
 * 
 */
package com.pocket.tank.app.menu.shower;

import com.pocket.tank.app.menu.FighterActionsMenu;
import com.pocket.tank.app.results.delegate.FightResultShowerDelegate;

/**
 * @author Manjunath
 *
 */
public class FightActionsMenuShower extends IMenuShower {

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
			getFighterActionShowerDelegate().showMenuForNextAction();
		}else {
			getWelcomeMenuShowerDelegate().showMenuForNextAction();
		}
	}
}