package com.example.ryanforgie.rankingsystem;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ryanforgie on 28/09/2017.
 */

public class PlayerPool {

    private ArrayList<Player> players;

    public PlayerPool() {
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void sortPlayersByRanking() {
        Collections.sort(players, Player.Rating);
    }


}
