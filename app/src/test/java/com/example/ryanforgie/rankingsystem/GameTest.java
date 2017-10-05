package com.example.ryanforgie.rankingsystem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryanforgie on 05/10/2017.
 */
public class GameTest {

    Game game1;
    Player player1;
    Player player2;
    DefaultSettings defaultSettings;

    @Before
    public void before() {
//        defaultSettings = new DefaultSettings();
//        defaultSettings.setStarterBoundry(2);
        player1 = new Player("Ryan");
        player2 = new Player("Emily");
        game1 = new Game(player1, player2);

    }

    @Test
    public void testStartsWithCorrectPlayerKRating() {
        assertEquals(25, game1.kFactor(player1));
    }

    @Test
    public void testKFactor() {
        Game game2 = new Game(player1, player2);
        Game game3 = new Game(player1, player2);
        Game game4 = new Game(player1, player2);
        Game game5 = new Game(player1, player2);
        Game game6 = new Game(player1, player2);
        player1.setRating(2400);
        assertEquals(10, game2.kFactor(player1));
        player2.setRating(2300);
        assertEquals(15, game2.kFactor(player2));
    }




}