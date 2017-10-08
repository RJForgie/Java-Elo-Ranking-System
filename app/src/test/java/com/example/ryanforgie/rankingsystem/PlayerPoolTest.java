package com.example.ryanforgie.rankingsystem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ryanforgie on 08/10/2017.
 */
public class PlayerPoolTest {

    PlayerPool playerPool;
    Player player1;
    Player player2;

    @Before
    public void before() {
        playerPool = new PlayerPool();
        player1 = new Player("Ryan");
        player2 = new Player("John");
        player1.setRating(2400);
        player2.setRating(2000);
    }

    @Test
    public void testAddPlayersToPool() {
        playerPool.addPlayer(player1);
        assertEquals(1, playerPool.getPlayers().size());
    }

    @Test
    public void testSortRanking() {
        playerPool.addPlayer(player2);
        playerPool.addPlayer(player1);
        playerPool.sortPlayersByRanking();
        assertEquals(player1, playerPool.getPlayers().get(0));
        assertEquals(player2, playerPool.getPlayers().get(1));
    }
}