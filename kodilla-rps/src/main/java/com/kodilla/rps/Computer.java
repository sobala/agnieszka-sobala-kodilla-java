package com.kodilla.rps;

import java.util.Random;

public class Computer implements GamePlayer {

    private int wonRounds = 0;
    private String currentMove;

    public String returnRandomMove() {
        Random ran = new Random();
        int x = ran.nextInt(2) + 1;
        return String.valueOf(x);
    }

    public int getWonRounds() {
        return wonRounds;
    }

    public void setWonRounds(int n) {
        wonRounds += n;
    }

    @Override
    public String getName() {
        return "Computer";
    }
}
