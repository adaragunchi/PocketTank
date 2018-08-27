package com.pocket.tank.app.enums;

public enum WelcomeMenuItems {
	newprofile("1. Create new fighter"),
	existingProfile("2. View fighter profile"),
	viewExistingFight("3. View existing fights"),
	resume("4. Resume previous game"),
	exit("5. Exit");
	
	public String menuName;
	
	private WelcomeMenuItems(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

}
