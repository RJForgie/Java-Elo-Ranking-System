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
        this.proRatingBoundry = 2400;
        this.starterBoundry = 30;
        this.defaultRating = 1000;
        this.defaultKFactor = 15;
    }
}
