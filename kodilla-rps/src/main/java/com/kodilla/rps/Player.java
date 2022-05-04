package com.kodilla.rps;

public class Player implements GamePlayer {

    private String currentMove;
    private final String name;
    private int wonRounds = 0;

    public Player(String currentMove, String name) {
        this.currentMove = currentMove;
        this.name = name;
    }

    public String getCurrentMove() {
        return currentMove;
    }

    public void setCurrentMove(String currentMove) {
        this.currentMove = currentMove;
    }

    public String getName() {
        return name;
    }

    public int getWonRounds() {
        return wonRounds;
    }

    public void setWonRounds(int n) {
        wonRounds += n;
    }
}
