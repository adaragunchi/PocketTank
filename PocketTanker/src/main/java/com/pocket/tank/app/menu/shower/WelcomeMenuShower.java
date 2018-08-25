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
 */
public class WelcomeMenuShower extends IMenuShower {

	@Override
	public void actOnMenuSelect() {
			menu = new WelcomeMenu();
			String menuInput = menu.getUserInput();
			IMenuActionDelegate menuDelegate = new WelcomeActionsDelegate();
			menuDelegate.actOnMenuSelection(menuInput);
	}

}
