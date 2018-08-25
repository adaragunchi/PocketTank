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
public abstract class FighterAbstractFactory {

	abstract OpponentFighterOperations getOpponentFighterInstance();
	
	abstract UserFighterOperations getUserFighterInstance();
}
