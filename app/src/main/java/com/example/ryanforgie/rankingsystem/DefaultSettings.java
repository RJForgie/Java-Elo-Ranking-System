package com.example.ryanforgie.rankingsystem;

/**
 * Created by ryanforgie on 29/09/2017.
 */

public class DefaultSettings {

    private int proRatingBoundry;
    private int starterBoundry;
    private int defaultRating;
    private int defaultKFactor;


    public DefaultSettings() {
        proRatingBoundry = 2400;
        starterBoundry = 30;
        defaultRating = 2000;
        defaultKFactor = 10;
    }

    public int getProRatingBoundry() {
        return proRatingBoundry;
    }

    public int getStarterBoundry() {
        return starterBoundry;
    }

    public int getDefaultRating() {
        return defaultRating;
    }

    public int getDefaultKFactor() {
        return defaultKFactor;
    }

    public void setStarterBoundry(int starterBoundry) {
        this.starterBoundry = starterBoundry;
    }
}
