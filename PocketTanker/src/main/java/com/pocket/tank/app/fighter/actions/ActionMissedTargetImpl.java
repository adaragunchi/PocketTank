/**
 * 
 */
package com.pocket.tank.app.fighter.actions;

import com.pocket.tank.app.model.Fighter;

/**
 * @author Manjunath
 * 
 *  This layer takes care of action 'Missed Target' by decrementing player's score by power 10.
 *  This value can be made configurable or randomly chosen to make the game more dynamic! 
 *
 */
public class ActionMissedTargetImpl implements IFighterActionStrategy {

	/* (non-Javadoc)
	 * @see com.pocket.tanker.fighter.actions.IFighterActionStrategy#performAction()
	 */
	@Override
	public void performFighterAction(Fighter fighter) {
		fighter.setTotalScore(fighter.getTotalScore()-10);
	}

}
