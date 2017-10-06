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

    @Before
    public void before() {
        player1 = new Player("Ryan");
        player2 = new Player("Emily");
        player1.setRating(2400);
        player2.setRating(2000);
        ratingsCalculator = new RatingsCalculator(player1, player2);
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









}