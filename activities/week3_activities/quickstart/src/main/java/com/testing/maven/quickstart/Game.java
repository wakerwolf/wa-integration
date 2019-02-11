package com.testing.maven.quickstart;

import java.util.Random;

/*
 * The class Game is for the Rock, Paper, Scissors game.
 * Thought the name was too long for a class, so I went for "Game"
 * Not sorry...
 * 
 * The game is Player versus Computer
 * 
 * When instance is created
 * */

public class Game {

	private static final int ROCK     = 1,
					  		 PAPER    = 2,
					  		 SCISSORS = 3;
	private static final String[] WORDS = {"ROCK", "PAPER", "SCISSORS"};
	private int hostGame;
	
	public Game() {
		this.hostGame = -1;
	}
	
	public Game(int hostGame) {
		this.hostGame = hostGame;
	}
	
	public String playGame(String keyWord) {
		
		if (keyWord.equalsIgnoreCase("ROCK")) {
			return this.rockGame();
		}
		
		if (keyWord.equalsIgnoreCase("PAPER")) {
			return this.paperGame();
		}
		
		if (keyWord.equalsIgnoreCase("SCISSORS")) {
			return this.scissorsGame();
		}
		
		return "Invalid play";
	}
	
	private String rockGame() {
		return this.getGameResult(ROCK);
	}
	
	private String paperGame() {
		return this.getGameResult(PAPER);
	}
	
	private String scissorsGame() {
		return this.getGameResult(SCISSORS);
	}
	
	private int getRandomPlay() {
		Random rand = new Random();
		return rand.nextInt(3) + 1;
	}
	
	private String getGameResult(int player) {
		if (this.hostGame < 0) {
			this.hostGame = this.getRandomPlay();
		}
		
		System.out.println("Your play: " + WORDS[player-1] + 
				"\nComputer play: " + WORDS[this.hostGame-1]);
		
		String playerWins = "You win!",
				hostWins  = "You lose!",
				draw	  = "It's a draw!";
		
		if (player == this.hostGame) {
			return draw;
		}
		
		switch(player) {
		case ROCK:
			if(this.hostGame == SCISSORS)
				return playerWins;
			else
				return hostWins;
		
		case PAPER:
			if(this.hostGame == ROCK)
				return playerWins;
			else
				return hostWins;
		
		default:
			if(this.hostGame == PAPER)
				return playerWins;
			else
				return hostWins;
		}
		
	}
	
}
