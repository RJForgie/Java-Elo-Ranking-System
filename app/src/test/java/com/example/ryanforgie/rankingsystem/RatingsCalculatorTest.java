package com.example.ryanforgie.rankingsystem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryanforgie on 02/10/2017.
 */
public class RatingsCalculatorTest {

    RatingsCalculator ratingsCalculator;
    Player player1;
    Player player2;
    Game game1;

    @Before
    public void before() {
        player1 = new Player("Ryan");
        player2 = new Player("Emily");
        player1.setRating(2400);
        player2.setRating(2000);
        game1 = new Game(player1, 1, player2, 0);
        ratingsCalculator = new RatingsCalculator(game1);
    }

    @Test
    public void testTransformedRating() {
        assertEquals(1000000.00, ratingsCalculator.transformedRating(player1), 0.001);
        assertEquals(100000.00, ratingsCalculator.transformedRating(player2), 0.001);
    }

    @Test
    public void testExpectedScore() {
        assertEquals(0.91, ratingsCalculator.expectedScore(player1, player2), 0.001);
        assertEquals(0.09, ratingsCalculator.expectedScore(player2, player1), 0.001);
    }

    @Test
    public void testNewRating(){
        assertEquals(2403, ratingsCalculator.newRating(player1, player2), 0.001);
    }

    @Test
    public void testGetScore() {
        assertEquals(1, ratingsCalculator.getScore(player1));
    }

    @Test
    public void testStartsWithCorrectPlayerKRating() {
        assertEquals(25, ratingsCalculator.kFactor(player1));
    }

    @Test
    public void testKFactor() {
        Game game2 = new Game(player1, 1, player2, 0);
        Game game3 = new Game(player1, 1, player2, 0);
        Game game4 = new Game(player1, 0, player2, 1);
        Game game5 = new Game(player1, 0, player2, 1);
        Game game6 = new Game(player1, 1, player2, 0);
        player1.setRating(2400);
        assertEquals(10, ratingsCalculator.kFactor(player1));
        player2.setRating(2300);
        assertEquals(15, ratingsCalculator.kFactor(player2));
    }









}