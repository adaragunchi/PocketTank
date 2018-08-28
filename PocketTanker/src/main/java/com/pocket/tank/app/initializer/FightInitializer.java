/**
 * 
 */
package com.pocket.tank.app.initializer;

import com.pocket.tank.app.menu.FighterActionsMenu;
import com.pocket.tank.app.menu.shower.FightActionsMenuShower;
import com.pocket.tank.app.menu.shower.IMenuShower;

/**
 * @author Manjunath
 *
 * This layer initiates view of menu options for fighter's actions after the play is started or resumed. 
 */
public class FightInitializer {

	public static void initialize() {
		IMenuShower fightMenu = new FightActionsMenuShower();
		fightMenu.showMenu(new FighterActionsMenu());
		fightMenu.actOnMenuSelect();
	}
}
