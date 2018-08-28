package com.pocket.tank.app.menu;

import com.pocket.tank.app.enums.WelcomeMenuItems;
import com.pocket.tank.app.util.ReadInput;

/**
 * 
 * @author Manjunath
 * This is used to display welcome menu names and to get user input from the displayed menu options.
 *
 */
public class WelcomeMenu implements IMenu{

	@Override
	public void getMenuItems() {
		for (WelcomeMenuItems homescreenmenu : WelcomeMenuItems.values()) {
			System.out.println(homescreenmenu.getMenuName());
		}
	}

	@Override
	public String getUserInput() {
		return ReadInput.readString();
	}

}
