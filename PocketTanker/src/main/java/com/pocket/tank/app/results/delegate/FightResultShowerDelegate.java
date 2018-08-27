/**
 * 
 */
package com.pocket.tank.app.results.delegate;

import com.pocket.tank.app.enums.FightStatus;
import com.pocket.tank.app.menu.delegate.IMenuActionDelegate;
import com.pocket.tank.app.model.Fighter;

/**
 * @author Manjunath
 *
 */
public class FightResultShowerDelegate implements IMenuActionDelegate {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pocket.tank.menu.shower.delegate.IMenuShowerDelegate#actOnMenuSelection(
	 * java.lang.String)
	 */
	@Override
	public void actOnMenuSelection(String input) {
		System.out.println("Not supporting method");
	}

	public void notifyFightIntermediateResults() {
		if (fight.getIteration() == 5) {
			announceWinner();
		} else {
			System.out.println(getUserScore());
			System.out.println(getOpponentScore());
			fight.setIteration(fight.getIteration()+1);
		}
		fightSaver.saveFighterInfo(fight);
	}

	private String getUserScore() {
		return fight.getUserFighter().getFighterName() + " has scored " + fight.getUserFighter().getTotalScore();
	}

	private String getOpponentScore() {
		return fight.getOpponentFighter().getFighterName() + " has scored "
				+ fight.getOpponentFighter().getTotalScore();
	}

	private void announceWinner() {
		Fighter winner = null;
		int result = ((Integer) fight.getUserFighter().getTotalScore())
				.compareTo(fight.getOpponentFighter().getTotalScore());
		if (result == 0) {
			System.out.println("Fight is draw. \n score::" + fight.getUserFighter().getTotalScore());
			fight.setStatus(FightStatus.draw);
		} else if (result > 0) {
			System.out.println("You won the fight with score :: " + fight.getUserFighter().getTotalScore());
			winner = fight.getUserFighter();
		} else {
			System.out.println("Your opponent " + fight.getOpponentFighter().getFighterName()
					+ " won the fight with score :: " + fight.getOpponentFighter().getTotalScore());
			winner = fight.getOpponentFighter();
		}
		fight.setWinner(winner);
		fight.setStatus(FightStatus.finished);
		
		//show welcome menu
	}

	

	@Override
	public void actOnOpponentAction() {
		System.out.println("This method is not supported here");
	}

	@Override
	public boolean isFightON() {
		System.out.println("This method is not supported here");
		return false;
	}

}
