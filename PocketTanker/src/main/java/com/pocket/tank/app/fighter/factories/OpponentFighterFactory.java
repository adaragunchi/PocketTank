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
public class OpponentFighterFactory extends FighterAbstractFactory{

	@Override
	public OpponentFighterOperations getOpponentFighterInstance() {
		return new OpponentFighterOperations();
	}

	@Override
	public UserFighterOperations getUserFighterInstance() {
		return null;
	}

}
