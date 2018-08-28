package com.pocket.tank.app.enums;

/**
 * 
 * @author Manjunath
 * 
 * Opponent's name is randomly chosen from below names enum.
 *
 */
public enum OpponentFighterName {
	JOKER("The Joker"), DARTH_VADER("Darth Vader"), LORD_VOLDEMORT("Lord Voldemort");
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
