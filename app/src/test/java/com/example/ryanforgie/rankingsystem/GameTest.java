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
        game1 = new Game(player1, 1, player2, 0);

    }






}