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
