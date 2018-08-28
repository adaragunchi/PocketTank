/**
 * 
 */
package com.pocket.tank.app.fighter.operations;

import com.pocket.tank.app.model.Fighter;

/**
 * @author Manjunath
 * This method is responsible to create opponent fighter.
 *
 */
public class OpponentFighterOperations extends IFighterOperations{

	@Override
	public Fighter createOpponentFighter() {
		return delegate.createOpponentFighter();
	}

	@Override
	public Fighter createUserFighter() {
		return null;
	}
	
	
}
