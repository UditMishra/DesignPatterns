package com.udit.template;

public class Chess extends Game {

	private static final int MAX_TURNS = 10;
	private int turn = 1;

	public Chess() {
		super(2);
		currentPlayer = 1;
	}

	@Override
	protected String getWinningPlayer() {
		return "Player : " + currentPlayer + " wins !";
	}

	@Override
	protected void takeTurn() {
		currentPlayer = (currentPlayer + 1) % noOfPlayers;
		System.out.println("Player " + currentPlayer + " is taking turn " + turn++);
	}

	@Override
	protected boolean hasWinner() {
		return turn == MAX_TURNS;
	}

	@Override
	protected void start() {
		System.out.println("Starting Game..");
	}

}
