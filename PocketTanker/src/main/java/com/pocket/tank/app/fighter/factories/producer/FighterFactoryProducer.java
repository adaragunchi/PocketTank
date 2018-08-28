/**
 * 
 */
package com.pocket.tank.app.fighter.factories.producer;

import com.pocket.tank.app.constants.Constants;
import com.pocket.tank.app.fighter.factories.FighterAbstractFactory;
import com.pocket.tank.app.fighter.factories.OpponentFighterFactory;
import com.pocket.tank.app.fighter.factories.UserFighterFactory;

/**
 * @author Manjunath
 * 
 * provides instance of factory object based on value of input parameter.
 *
 */
public class FighterFactoryProducer {
	
	public static FighterAbstractFactory getFighterFacoty(String fighterType) {
		if(Constants.FIGHTER_TYPE_OPPONENT.equalsIgnoreCase(fighterType)) {
			return new OpponentFighterFactory();
		}else if(Constants.FIGHTER_TYPE_USER.equalsIgnoreCase(fighterType)) {
			return new UserFighterFactory();
		}
		return null;
	}

}
