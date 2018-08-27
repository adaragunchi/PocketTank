/**
 * 
 */
package com.pocket.tank.app.fighter.operations;

import java.util.Map;

import com.pocket.tank.app.constants.Constants;
import com.pocket.tank.app.initializer.WeaponsPicker;
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
		System.out.println(Constants.FIGHTER_NAME);
		fighter.setFighterName(ReadInput.readString());
		GetValidUserAgeInput(fighter);
		System.out.println(Constants.FIGHTER_COUNTRY);
		fighter.setCountry(ReadInput.readString());
		fighter.setSelectedWeaponPower(getUserWeapon());
		fightInfoSaver.saveFighter(fighter);
		return fighter;
	}

	private void GetValidUserAgeInput(Fighter fighter) {
		try {
			System.out.println("Age : ");
			fighter.setAge(Integer.parseInt(ReadInput.readString()));
		}catch(Exception e) {
			System.out.println("Invalid input for age. Please enter valid value.");
			GetValidUserAgeInput(fighter);
		}
	}

	private Map<String,Integer> getUserWeapon() {
		Map<String,Integer> weapon = delegate.getWeaponPower(WeaponsPicker.pickWeapons());
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
