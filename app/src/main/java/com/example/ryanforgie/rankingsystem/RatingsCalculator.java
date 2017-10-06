package com.example.ryanforgie.rankingsystem;

/**
 * Created by ryanforgie on 29/09/2017.
 */

public class RatingsCalculator {

    private Player primaryPlayer;
    private Player otherPlayer;
    private DefaultSettings defaultSettings;

    public RatingsCalculator(Player primaryPlayer, Player otherPlayer) {
        defaultSettings = new DefaultSettings();
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

    public int newRating(Player primaryPlayer, Player otherPlayer, int score) {
        double updatedRating = primaryPlayer.getRating() + this.kFactor(primaryPlayer) * (score - this.expectedScore(primaryPlayer, otherPlayer));
        int rounded = (int) Math.round(updatedRating);
        return rounded;
    }

    public int kFactor(Player player) {
        if (player.numberOfGamesPlayed() < defaultSettings.getStarterBoundry()) return 25;
        if (player.getRating() < defaultSettings.getProRatingBoundry()) return 15;
        return defaultSettings.getDefaultKFactor();
    }



}

