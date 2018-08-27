/**
 * 
 */
package com.pocket.tank.app.fighter.actions;

import com.pocket.tank.app.model.Fighter;

/**
 * @author Manjunath
 * 
 * Actions performing interface based on user's choice.
 *
 */
@FunctionalInterface
public interface IFighterActionStrategy {
	void performFighterAction(Fighter fighter);
}
