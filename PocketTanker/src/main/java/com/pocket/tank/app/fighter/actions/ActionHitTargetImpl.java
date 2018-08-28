/**
 * 
 */
package com.pocket.tank.app.fighter.actions;

import java.util.Map;

import com.pocket.tank.app.model.Fighter;

/**
 * @author Manjunath
 * 
 * This layer takes care of action 'Hit Target' by incrementing player's score by his selected weapon power.
 *
 */
public class ActionHitTargetImpl implements IFighterActionStrategy {

	@Override
	public void performFighterAction(Fighter fighter) {
		Map<String,Integer> map = fighter.getSelectedWeaponPower();
		int weaponPower = 0;
		
		for (Integer iterable_element : map.values()) {
			weaponPower = iterable_element;
		}
		fighter.setTotalScore(fighter.getTotalScore()+weaponPower);
		
	}

	

}
