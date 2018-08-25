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
	
	FightInfo fight = new FightInfo();
	
	FightInfoSaver fightSaver = new FighterInfoSaverImpl();
	
	public void actOnMenuSelection(String input);
	
	public void showMenuForNextAction();
	
	public boolean isFightON();
	
	public void actOnOpponentAction();
}
