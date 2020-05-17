package com.udit.template;

/**
 * This class defines a template of Game
 * 
 * @author udmishra
 *
 */
public abstract class Game {

	protected int currentPlayer;
	protected final int noOfPlayers;

	public Game(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	/**
	 * Skeleton of operation defined as high-level steps whose implementation will
	 * be given by concrete classes
	 */
	public void run() {
		start();
		while (!hasWinner()) {
			takeTurn();
		}
		System.out.println(getWinningPlayer());

	}

	protected abstract String getWinningPlayer();

	protected abstract void takeTurn();

	protected abstract boolean hasWinner();

	protected abstract void start();
}
