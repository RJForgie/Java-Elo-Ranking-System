package com.example.ryanforgie.rankingsystem;

/**
 * Created by ryanforgie on 09/10/2017.
 */

public class Console {

    static PlayerPool playerPool = new PlayerPool();
    static Runner runner = new Runner(playerPool);

    public static void main(String[] args){
        runner.play10Games();
    }

}
