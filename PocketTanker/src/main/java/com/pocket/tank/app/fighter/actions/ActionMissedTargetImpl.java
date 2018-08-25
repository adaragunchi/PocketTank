/**
 * 
 */
package com.pocket.tank.app.fighter.actions;

import com.pocket.tank.app.model.Fighter;

/**
 * @author Manjunath
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
