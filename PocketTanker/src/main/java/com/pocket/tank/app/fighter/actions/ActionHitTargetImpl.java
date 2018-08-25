/**
 * 
 */
package com.pocket.tank.app.fighter.actions;

import java.util.Map;

import com.pocket.tank.app.model.Fighter;

/**
 * @author Manjunath
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
