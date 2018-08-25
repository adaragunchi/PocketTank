/**
 * 
 */
package com.pocket.tank.app.fighter.factories;

import com.pocket.tank.app.fighter.operations.OpponentFighterOperations;
import com.pocket.tank.app.fighter.operations.UserFighterOperations;

/**
 * @author Manjunath
 *
 */
public class UserFighterFactory extends FighterAbstractFactory {

	/* (non-Javadoc)
	 * @see com.pocket.tanker.fighter.factories.FighterAbstractFactory#getUserFighterInstance()
	 */
	@Override
	public UserFighterOperations getUserFighterInstance() {
		return new UserFighterOperations();
	}
	
	/* (non-Javadoc)
	 * @see com.pocket.tanker.fighter.factories.FighterAbstractFactory#getOpponentFighterInstance()
	 */
	@Override
	public OpponentFighterOperations getOpponentFighterInstance() {
		return null;
	}


}
