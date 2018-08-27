package com.pocket.tank.app.menu;

import com.pocket.tank.app.enums.FighterActions;
import com.pocket.tank.app.util.ReadInput;

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
