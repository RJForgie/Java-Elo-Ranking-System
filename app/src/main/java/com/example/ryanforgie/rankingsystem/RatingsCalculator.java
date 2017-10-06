package com.example.ryanforgie.rankingsystem;

/**
 * Created by ryanforgie on 29/09/2017.
 */

public class RatingsCalculator {

    private Player primaryPlayer;
    private Player otherPlayer;
    private DefaultSettings defaultSettings;
    private Game game;

    public RatingsCalculator(Game game) {
        defaultSettings = new DefaultSettings();
        this.game = game;
        primaryPlayer = game.getPlayers().get(0);
        otherPlayer = game.getPlayers().get(1);
    }

    public double transformedRating(Player player) {
        return Math.pow(10, (player.getRating()/400));
    }

    public double expectedScore(Player primaryPlayer, Player otherPlayer) {
        double primaryPlayerTransformedRating = this.transformedRating(primaryPlayer);
        double otherPlayerTransformedRating = this.transformedRating(otherPlayer);
        return primaryPlayerTransformedRating / (primaryPlayerTransformedRating + otherPlayerTransformedRating);
    }

    public int newRating(Player player) {
        player.getRating() + this.kFactor(player) * pl

    }

    public int kFactor(Player player) {
        if (player.numberOfGamesPlayed() < defaultSettings.getStarterBoundry()) return 25;
        if (player.getRating() < defaultSettings.getProRatingBoundry()) return 15;
        return defaultSettings.getDefaultKFactor();
    }



}

