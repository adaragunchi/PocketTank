package com.pocket.tank.app.enums;

public enum FighterActions {
HitTarget("1 Hit the Target"),
MissTarget("2 Missed the Target"),
SaveandExit("3 Save and Exit");
	
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

/**
 * @param actionName the actionName to set
 */
public void setActionName(String actionName) {
	this.actionName = actionName;
}
}
