/**
 * 
 */
package com.pocket.tank.app.fighter.factories.producer;

import com.pocket.tank.app.fighter.factories.FighterAbstractFactory;
import com.pocket.tank.app.fighter.factories.OpponentFighterFactory;
import com.pocket.tank.app.fighter.factories.UserFighterFactory;

/**
 * @author Manjunath
 *
 */
public class FighterFactoryProducer {
	
	public static FighterAbstractFactory getFighterFacoty(String fighterType) {
		if("OPPFIGHTER".equalsIgnoreCase(fighterType)) {
			return new OpponentFighterFactory();
		}else if("USERFIGHTER".equalsIgnoreCase(fighterType)) {
			return new UserFighterFactory();
		}
		return null;
	}

}
