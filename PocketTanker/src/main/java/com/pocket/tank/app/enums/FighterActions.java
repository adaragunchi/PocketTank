package com.pocket.tank.app.enums;

/**
 * 
 * @author Manjunath
 * 
 * Fighter actions enum
 *
 */
public enum FighterActions {
	HIT_TARGET("1 Hit the Target"), MISS_TARGET("2 Missed the Target"), SAVE_AND_EXIT("3 Save and Exit");

	private String actionName;

	private FighterActions(String actionName) {
		this.actionName = actionName;
	}

	/**
	 * @return the actionName
	 */
	public String getActionName() {
		return actionName;
	}
}
