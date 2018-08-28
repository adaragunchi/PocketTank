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
 * method contract interface for actions to ber performed on various menu display to user.
 *
 */
public interface IMenuActionDelegate {
	
	public static final FightInfo fight = new FightInfo();
	
	public static final FightInfoSaver fightSaver = new FighterInfoSaverImpl();
	
	void actOnMenuSelection(String input);

	void actOnOpponentAction();

	boolean isFightON();
	
}
