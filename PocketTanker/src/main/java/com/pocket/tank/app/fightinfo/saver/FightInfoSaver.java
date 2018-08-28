/**
 * 
 */
package com.pocket.tank.app.fightinfo.saver;

import com.pocket.tank.app.model.FightInfo;
import com.pocket.tank.app.model.Fighter;

/**
 * @author Manjunath
 * 
 * This is method contract for saving and retrieving data in and from file.
 */
public interface FightInfoSaver {
	void saveFighter(Fighter fighter);

	void saveFighterInfo(FightInfo fightInfo);

	FightInfo getFightInfo();

	Fighter getFighter();
}
