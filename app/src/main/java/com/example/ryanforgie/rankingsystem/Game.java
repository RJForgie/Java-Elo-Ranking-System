package com.example.ryanforgie.rankingsystem;

import java.util.ArrayList;

/**
 * Created by ryanforgie on 29/09/2017.
 */

public class Game {

    private ArrayList<Player> players;
    private DefaultSettings defaultsettings;
    private Player player1;
    private Player player2;


    public Game(Player player1, Player player2) {
        defaultsettings = new DefaultSettings();
        this.players = new ArrayList<>();
        this.addPlayersToGame(player1, player2);
        this.addGameToPlayerGamesBank(player1, player2);
    }

    public int kFactor(Player player) {
        if (player.numberOfGamesPlayed() < defaultsettings.getStarterBoundry()) return 25;
        if (player.getRating() < defaultsettings.getProRatingBoundry()) return 15;
        return defaultsettings.getDefaultKFactor();
    }

    public void addPlayersToGame(Player firstPlayer, Player secondPlayer) {
        players.add(firstPlayer);
        players.add(secondPlayer);
    }

    public void addGameToPlayerGamesBank(Player firstPlayer, Player secondPlayer) {
        firstPlayer.addGametoGamesBank(this);
        secondPlayer.addGametoGamesBank(this);
    }







}
