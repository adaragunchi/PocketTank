/**
 * 
 */
package com.pocket.tank.app.menu.delegate;

import com.pocket.tank.app.fightinfo.saver.FightInfoSaver;
import com.pocket.tank.app.fightinfo.saver.FighterInfoSaverImpl;
import com.pocket.tank.app.model.FightInfo;

/**
 * @author Manjunath
 *
 */
public interface IMenuActionDelegate {
	
	public static final FightInfo fight = new FightInfo();
	
	public static final FightInfoSaver fightSaver = new FighterInfoSaverImpl();
	
	void actOnMenuSelection(String input);

	void actOnOpponentAction();

	boolean isFightON();
	
}
