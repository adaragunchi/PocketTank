/**
 * 
 */
package com.pocket.tank.app.model;

import java.io.Serializable;

import com.pocket.tank.app.enums.FightStatus;

/**
 * @author Manjunath
 *
 */
public class FightInfo  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Fighter userFighter;
	private Fighter opponentFighter;
	private FightStatus status;	
	private Fighter winner;
	private int iteration;
	
	/**
	 * 
	 * @param fight
	 */
	public void loadFight(FightInfo fight) {
		this.userFighter = fight.getUserFighter();
		this.opponentFighter = fight.getOpponentFighter();
		this.status = fight.getStatus();
		this.iteration = fight.getIteration();
	}
	
	public void resetFight(FightInfo fight) {
		fight.setUserFighter(null);
		fight.setOpponentFighter(null);
		fight.setStatus(null);
		fight.setWinner(null);
		fight.setIteration(0);
	}
	/**
	 * @return the userFighter
	 */
	public Fighter getUserFighter() {
		return userFighter;
	}
	/**
	 * @param userFighter the userFighter to set
	 */
	public void setUserFighter(Fighter userFighter) {
		this.userFighter = userFighter;
	}
	/**
	 * @return the opponentFighter
	 */
	public Fighter getOpponentFighter() {
		return opponentFighter;
	}
	/**
	 * @param opponentFighter the opponentFighter to set
	 */
	public void setOpponentFighter(Fighter opponentFighter) {
		this.opponentFighter = opponentFighter;
	}
	/**
	 * @return the status
	 */
	public FightStatus getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(FightStatus status) {
		this.status = status;
	}
	/**
	 * @return the winner
	 */
	public Fighter getWinner() {
		return winner;
	}
	/**
	 * @param winner the winner to set
	 */
	public void setWinner(Fighter winner) {
		this.winner = winner;
	}
	
	public void startFight() {
		//show fight actions menu here
		//switch case 
	}
	/**
	 * @return the iteration
	 */
	public int getIteration() {
		return iteration;
	}
	/**
	 * @param iteration the iteration to set
	 */
	public void setIteration(int iteration) {
		this.iteration = iteration;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder fightInfoBuilder = new StringBuilder();
		fightInfoBuilder.append("\nuserFighter:" + userFighter.getFighterName() + ",\nOpponentFighter:" + opponentFighter.getFighterName() + ",\nFight Status:" + status);
		
		if(winner!=null && this.getStatus()!=FightStatus.draw) {
			fightInfoBuilder.append("\nWinner:");
			fightInfoBuilder.append(winner.getFighterName());
			fightInfoBuilder.append("with score");
			fightInfoBuilder.append(winner.getTotalScore()+"\n");
		}else if(this.getStatus()!=FightStatus.draw){
			fightInfoBuilder.append("\nWinner:");
			fightInfoBuilder.append("Yet to be decided\n");
		}
		return fightInfoBuilder.toString();
	}
}