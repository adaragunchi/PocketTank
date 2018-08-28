package com.pocket.tank.app.enums;

/**
 * 
 * @author Manjunath
 * Menu options for application feature is maintained in this enum.
 *
 */
public enum WelcomeMenuItems {
	NEW_PROFILE("1. Create new fighter"),
	EXISTING_PROFILE("2. View fighter profile"),
	VIEW_EXISTING_FIGHT("3. View existing fights"),
	RESUME("4. Resume previous game"),
	EXIT("5. Exit");
	
	private String menuName;
	
	private WelcomeMenuItems(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuName() {
		return menuName;
	}

}
