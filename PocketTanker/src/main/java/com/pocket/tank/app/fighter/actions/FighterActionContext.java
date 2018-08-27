/**
 * 
 */
package com.pocket.tank.app.fighter.actions;

import com.pocket.tank.app.model.Fighter;

/**
 * @author Manjunath
 * 
 *  
 *
 */
public class FighterActionContext {
	private IFighterActionStrategy fighterActionStrategy;

	public FighterActionContext(IFighterActionStrategy fighterActionStrategy) {
		super();
		this.fighterActionStrategy = fighterActionStrategy;
	}

	public void executeFighterAction(Fighter fighter) {
		fighterActionStrategy.performFighterAction(fighter);
	}
}
