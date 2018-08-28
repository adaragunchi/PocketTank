/**
 * 
 */
package com.pocket.tank.app.fighter.operations;

import java.util.Map;

import com.pocket.tank.app.constants.Constants;
import com.pocket.tank.app.initializer.WeaponsPicker;
import com.pocket.tank.app.model.Fighter;
import com.pocket.tank.app.util.ReadInput;

/**
 * @author Manjunath
 * 
 * This layer is responsible to create user fighter character. Capture user inputs, validate and 
 * proceed on further flow.
 *
 */
public class UserFighterOperations extends IFighterOperations {

	

	/* (non-Javadoc)
	 * @see com.pocket.tanker.fighter.operations.IFighterOperations#createUserFighter()
	 */
	@Override
	public Fighter createUserFighter() {
		Fighter fighter = new Fighter();
		System.out.println(Constants.FIGHTER_NAME);
		fighter.setFighterName(ReadInput.readString());
		getValidUserAgeInput(fighter);
		System.out.println(Constants.FIGHTER_COUNTRY);
		fighter.setCountry(ReadInput.readString());
		fighter.setSelectedWeaponPower(getUserWeapon());
		fightInfoSaver.saveFighter(fighter);
		return fighter;
	}
	
	private void getValidUserAgeInput(Fighter fighter) {
		try {
			System.out.println("Age : ");
			fighter.setAge(Integer.parseInt(ReadInput.readString()));
		}catch(Exception e) {
			System.out.println("Invalid input for age. Please enter valid value.");
			getValidUserAgeInput(fighter);
		}
	}

	private Map<String,Integer> getUserWeapon() {
		Map<String,Integer> weapon = delegate.getWeaponPower(WeaponsPicker.pickWeapons());
		return weapon;
	}

	@Override
	public Fighter createOpponentFighter() {
		return null;
	}

}
