package com.pocket.tank.app.menu;

import com.pocket.tank.app.enums.FighterActions;
import com.pocket.tank.app.util.ReadInput;

/**
 * 
 * @author Manjunath
 * 
 * This is used to display action name and to get user input from the displayed menu options.
 *
 */
public class FighterActionsMenu implements IMenu{

	@Override
	public void getMenuItems() {
		for (FighterActions fighterActions : FighterActions.values()) {
			System.out.println(fighterActions.getActionName());
		}
	}

	@Override
	public String getUserInput() {
		return ReadInput.readString();
	}
}
