/**
 * 
 */
package com.pocket.tank.app.fightinfo.saver;

import com.pocket.tank.app.model.FightInfo;
import com.pocket.tank.app.model.Fighter;

/**
 * @author Manjunath
 *
 */
public interface FightInfoSaver {
	public void saveFighter(Fighter fighter);

	public void saveFighterInfo(FightInfo fightInfo);

	public FightInfo getFightInfo();

	public Fighter getFighter();
}
