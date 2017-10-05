package com.example.ryanforgie.rankingsystem;

/**
 * Created by ryanforgie on 29/09/2017.
 */

public class RatingsCalculator {

    private Player primaryPlayer;
    private Player otherPlayer;

    public RatingsCalculator(Player primaryPlayer, Player otherPlayer) {
        this.primaryPlayer = primaryPlayer;
        this.otherPlayer = otherPlayer;
    }

    public void updateRating() {

    }

    public int expectedScore(Player primaryPlayer, Player otherPlayer) {
         return primaryPlayer.getRating() / (primaryPlayer.getRating() + otherPlayer.getRating());
    }





    


}

