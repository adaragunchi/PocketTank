/**
 * 
 */
package com.pocket.tank.app.enums;

/**
 * @author Manjunath
 *
 */
public enum FightStatus {
	live("live"), finished("finished"), draw("draw"),onHold("onHold");

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

	/**
	 * @param fightStatus
	 *            the fightStatus to set
	 */
	public void setFightStatus(String fightStatus) {
		this.fightStatus = fightStatus;
	}

}
