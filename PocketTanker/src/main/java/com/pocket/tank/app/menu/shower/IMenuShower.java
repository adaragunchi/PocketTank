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
 */
public abstract class IMenuShower {

	protected IMenu menu;
	
	protected IMenuActionDelegate showerDelegate;
	
	public void showMenu(IMenu menu) {
		menu.getMenuItems();
	}
	
	public FighterActionDelegate getFighterActionShowerDelegate() {
		return new FighterActionDelegate();
	}
	
	public WelcomeActionsDelegate getWelcomeMenuShowerDelegate() {
		return new WelcomeActionsDelegate();
	}
	
	public OpponentActionDelegate getOpponentActionShowerDelegate() {
		return new OpponentActionDelegate();
	}
	
	public abstract void actOnMenuSelect();
}
