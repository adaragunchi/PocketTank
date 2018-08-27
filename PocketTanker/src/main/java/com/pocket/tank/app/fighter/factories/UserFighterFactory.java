/**
 * 
 */
package com.pocket.tank.app.fighter.factories;

import com.pocket.tank.app.fighter.operations.OpponentFighterOperations;
import com.pocket.tank.app.fighter.operations.UserFighterOperations;

/**
 * @author Manjunath
 * 
 * factory takes care to provide instance of respective class for implementing a feature.
 *
 */
public class UserFighterFactory extends FighterAbstractFactory {
	
	@Override
	public UserFighterOperations getUserFighterInstance() {
		return new UserFighterOperations();
	}
	
	@Override
	public OpponentFighterOperations getOpponentFighterInstance() {
		return null;
	}

}
