package com.testing.maven.quickstart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 
class JUnit5ExampleTest {
    
    @Test
    void rockAndPlayer() {
    	Game game = new Game(1);
    	
    	String draw = game.playGame("ROCK");
    	assertEquals("It's a draw!", draw);
    	
    	String win = game.playGame("PAPER");
    	assertEquals("You win!", win);
    	
    	String lose = game.playGame("SCISSORS");
    	assertEquals("You lose!", lose);
    }
    
}