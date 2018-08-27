/**
 * 
 */
package com.pocket.tank.app.menu.shower;

import com.pocket.tank.app.menu.WelcomeMenu;
import com.pocket.tank.app.menu.delegate.IMenuActionDelegate;
import com.pocket.tank.app.menu.delegate.WelcomeActionsDelegate;

/**
 * @author Manjunath
 *
 *Action of user among the available feature is picked and respective implementation is called here.
 */
public class WelcomeMenuShower extends IMenuShower {

	/**
	 * User's input is picked to be executed.
	 */
	@Override
	public void actOnMenuSelect() {
			menu = new WelcomeMenu();
			String menuInput = menu.getUserInput();
			IMenuActionDelegate menuDelegate = new WelcomeActionsDelegate();
			menuDelegate.actOnMenuSelection(menuInput);
	}

}
