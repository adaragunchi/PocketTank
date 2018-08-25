/**
 * 
 */
package com.pocket.tank.app.fighter.operations;

import com.pocket.tank.app.fightinfo.saver.FightInfoSaver;
import com.pocket.tank.app.fightinfo.saver.FighterInfoSaverImpl;
import com.pocket.tank.app.model.Fighter;

/**
 * @author Manjunath
 *
 */
public abstract class IFighterOperations {
	abstract Fighter createOpponentFighter();

	abstract Fighter createUserFighter();

	FighterOperationsDelegate delegate = new FighterOperationsDelegate();

	FightInfoSaver fightInfoSaver = new FighterInfoSaverImpl();;

	public Fighter viewFighterProfile() {
		return  fightInfoSaver.getFighter();
	}

}
