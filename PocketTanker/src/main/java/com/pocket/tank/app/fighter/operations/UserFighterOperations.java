/**
 * 
 */
package com.pocket.tank.app.fighter.operations;

import java.util.Map;

import com.pocket.tank.app.menu.IMenu;
import com.pocket.tank.app.menu.WeaponMenu;
import com.pocket.tank.app.model.Fighter;
import com.pocket.tank.app.util.ReadInput;

/**
 * @author Manjunath
 *
 */
public class UserFighterOperations extends IFighterOperations/*<FighterOperationsDelegate>*/ {

	

	/* (non-Javadoc)
	 * @see com.pocket.tanker.fighter.operations.IFighterOperations#createUserFighter()
	 */
	@Override
	public Fighter createUserFighter() {
		Fighter fighter = new Fighter();
		System.out.println("Fighter name : ");
		fighter.setFighterName(ReadInput.readString());
		System.out.println("Age : ");
		fighter.setAge(Integer.parseInt(ReadInput.readInt()));
		System.out.println("County : ");
		fighter.setFighterType("User Fighter");
		fighter.setCountry(ReadInput.readString());
		fighter.setSelectedWeaponPower(getUserWeapon());
		fightInfoSaver.saveFighter(fighter);
		return fighter;
	}

	private Map<String,Integer> getUserWeapon() {
		IMenu weaponsMenu = new WeaponMenu();
		weaponsMenu.getMenuItems();
		String inputForHome = weaponsMenu.getUserInput();
		Map<String,Integer> weapon = delegate.getWeaponPower(inputForHome);
		return weapon;
	}

	/* (non-Javadoc)
	 * @see com.pocket.tanker.fighter.operations.IFighterOperations#createOpponentFighter()
	 */
	@Override
	public Fighter createOpponentFighter() {
		return null;
	}

}
