package com.example.ryanforgie.rankingsystem;

/**
 * Created by ryanforgie on 29/09/2017.
 */

public class RatingsCalculator {

    private Player winner;
    private Player loser;
    private DefaultSettings defaultSettings;
    private Game game;

    public RatingsCalculator(Game game) {
        defaultSettings = new DefaultSettings();
        this.game = game;
        this.winner = game.getWinner();
        this.loser = game.getLoser();
    }


    public double transformedRating(Player player) {
        return Math.pow(10, (player.getRating()/400));
    }

    public double expectedScore(Player firstPlayer, Player secondPlayer) {
        double firstPlayerTranRating = this.transformedRating(firstPlayer);
        double secondPlayerTranRating = this.transformedRating(secondPlayer);
        return firstPlayerTranRating / (firstPlayerTranRating + secondPlayerTranRating);
    }

    public double newRating(Player primaryPlayer, Player otherPlayer) {
        double updatedRating = primaryPlayer.getRating() + this.kFactor(primaryPlayer) * (this.getScore(primaryPlayer) - this.expectedScore(primaryPlayer, otherPlayer));
        int rounded = (int) Math.round(updatedRating);
        return updatedRating;
    }

    public int getScore(Player player) {
        if (player.equals(game.getWinner())) return 1;
        return 0;
    }

    public int kFactor(Player player) {
        if (player.numberOfGamesPlayed() < defaultSettings.getStarterBoundry()) return 32;
        if (player.getRating() < defaultSettings.getProRatingBoundry()) return 15;
        return defaultSettings.getDefaultKFactor();
    }

//    public void updatePlayerRating(Player firstPlayer, Player secondPlayer) {
//        int firstNewRating = this.newRating(firstPlayer, secondPlayer);
//        int secondNewRating = this.newRating(secondPlayer, firstPlayer);
//        firstPlayer.setRating(firstNewRating);
//        secondPlayer.setRating(secondNewRating);
//    }



}

