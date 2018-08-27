package com.pocket.tank.app.enums;

public enum OpponentFighterName {
	ROCK("Rock"), VIN_DISEAL("Vin Diseal"), LORD_VOLDEMORT("Lord Voldemort");
	private String opponentName;

	/**
	 * @return the opponentName
	 */
	public String getOpponentName() {
		return opponentName;
	}

	/**
	 * 
	 * @param opponentName
	 */
	private OpponentFighterName(String opponentName) {
		this.opponentName = opponentName;
	}

}
