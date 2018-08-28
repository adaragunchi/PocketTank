/**
 * 
 */
package com.pocket.tank.app.enums;

/**
 * @author Manjunath
 * 
 * Fight status is maintained from below options.
 *
 */
public enum FightStatus {
	LIVE("live"), FINISHED("finished"), DRAW("draw"), ON_HOLD("On Hold");

	private String fightStatus;

	/**
	 * @param fightStatus
	 */
	private FightStatus(String fightStatus) {
		this.fightStatus = fightStatus;
	}

	/**
	 * @return the fightStatus
	 */
	public String getFightStatus() {
		return fightStatus;
	}

}
