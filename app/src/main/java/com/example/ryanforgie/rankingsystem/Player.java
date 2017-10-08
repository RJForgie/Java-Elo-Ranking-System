package com.example.ryanforgie.rankingsystem;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by ryanforgie on 28/09/2017.
 */

public class Player implements Playable {

    private String name;
    private int winCount;
    private int rating;
    private ArrayList<Game> gamesBank;
    private int lossCount;
    private DefaultSettings defaultSettings;



    public Player(String name) {
        this.name = name;
        gamesBank = new ArrayList<>();
        winCount = 0;
        lossCount = 0;
    }


    public int numberOfGamesPlayed() {
        return gamesBank.size();
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Game> getGamesBank() {
        return gamesBank;
    }

    public void addGametoGamesBank(Game gamePlayed) {
        gamesBank.add(gamePlayed);
    }

    public static Comparator<Player> Rating = new Comparator<Player>() {
        public int compare(Player player1, Player player2) {
            int ratingNo1 = player1.getRating();
            int ratingNo2 = player2.getRating();
            return ratingNo2 - ratingNo1;
        }
    };

}
