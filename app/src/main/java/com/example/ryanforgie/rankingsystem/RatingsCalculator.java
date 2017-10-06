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

    public double transformedRating(Player player) {
        return Math.pow(10, (player.getRating()/400));
    }

    public double expectedScore(Player primaryPlayer, Player otherPlayer) {
        double primaryPlayerTransformedRating = this.transformedRating(primaryPlayer);
        double otherPlayerTransformedRating = this.transformedRating(otherPlayer);
        return primaryPlayerTransformedRating / (primaryPlayerTransformedRating + otherPlayerTransformedRating);
    }



}

