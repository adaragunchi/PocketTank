/**
 * 
 */
package com.pocket.tank.app.menu.shower;

import com.pocket.tank.app.menu.IMenu;
import com.pocket.tank.app.menu.delegate.FighterActionDelegate;
import com.pocket.tank.app.menu.delegate.IMenuActionDelegate;
import com.pocket.tank.app.menu.delegate.OpponentActionDelegate;
import com.pocket.tank.app.menu.delegate.WelcomeActionsDelegate;

/**
 * @author Manjunath
 * 
 * Shower layer interface : manages all display layer options,actions by user and deals with it's delegates to 
 * get relevant information about fights or fighters.
 *
 */
public abstract class IMenuShower {

	protected IMenu menu;
	
	protected IMenuActionDelegate showerDelegate;
	
	/**
	 * commonly used method and its implementation for all implementing classes.
	 * @param menu
	 */
	public void showMenu(IMenu menu) {
		menu.getMenuItems();
	}
	/**
	 * delegate getters to manage operations and information
	 * @return
	 */
	public FighterActionDelegate getFighterActionShowerDelegate() {
		return new FighterActionDelegate();
	}
	
	public WelcomeActionsDelegate getWelcomeMenuShowerDelegate() {
		return new WelcomeActionsDelegate();
	}
	
	public OpponentActionDelegate getOpponentActionShowerDelegate() {
		return new OpponentActionDelegate();
	}
	
	/**
	 * method commonly used by all implementing classes adding different definitions to it.
	 */
	public abstract void actOnMenuSelect();
}
