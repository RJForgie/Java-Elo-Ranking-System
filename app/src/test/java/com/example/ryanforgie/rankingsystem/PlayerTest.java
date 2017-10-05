package com.example.ryanforgie.rankingsystem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryanforgie on 03/10/2017.
 */
public class PlayerTest {

    Player player1;
    Player player2;
    Game game1;

    @Before
    public void before() {
        player1 = new Player("Ryan");
        player2 = new Player("Emily");
        game1 = new Game(player1, player2);
    }

    @Test
    public void testPlayerHasName() {
        assertEquals("Ryan", player1.getName());
    }

    @Test
    public void testNewPlayerHasNoGames() {
        assertEquals(true, player1.getGamesBank().isEmpty());
    }

    @Test
    public void testNewPlayerHas0Games() {
        assertEquals(0, player1.numberOfGamesPlayed());
    }

    @Test
    public void testCanSetRating() {
        player1.setRating(2000);
        assertEquals(2000, player1.getRating());
    }

    @Test
    public void testGameAddedToGamesBank() {
        assertEquals(1, player1.numberOfGamesPlayed());
        assertEquals(1, player2.numberOfGamesPlayed());
    }



}