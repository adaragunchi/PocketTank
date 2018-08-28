/**
 * 
 */
package com.pocket.tank.app.fighter.factories;

import com.pocket.tank.app.fighter.operations.OpponentFighterOperations;
import com.pocket.tank.app.fighter.operations.UserFighterOperations;

/**
 * @author Manjunath
 * 
 * Interface to provide instance of respective implementation classes.
 *
 */
public abstract class FighterAbstractFactory {

	abstract OpponentFighterOperations getOpponentFighterInstance();
	
	abstract UserFighterOperations getUserFighterInstance();
}
