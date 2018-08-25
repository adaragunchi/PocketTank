package com.pocket.tank.app.enums;

public enum OpponentFighterName {
	rock("rock"), vindiseal("vin diseal"), LordVoldemort("Lord Voldemort");
	private String opponentName;

	/**
	 * @return the opponentName
	 */
	public String getOpponentName() {
		return opponentName;
	}

	/**
	 * @param opponentName
	 *            the opponentName to set
	 */
	public void setOpponentName(String opponentName) {
		this.opponentName = opponentName;
	}

	private OpponentFighterName(String opponentName) {
		this.opponentName = opponentName;
	}

}
