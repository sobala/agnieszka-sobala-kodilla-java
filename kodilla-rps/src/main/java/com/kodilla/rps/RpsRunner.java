package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] arg) {
        boolean end = false;
        while(!end) {
            Scanner key = new Scanner(System.in);
            Game game = new Game();
            game.askInitialInfo();
            for (game.setCounter(1); game.getCounter() <= game.getNOfRounds(); game.setCounter(1)) {
                game.displayInstructions();
                String currentMove = key.nextLine();
                int returnedValue = game.executePlayerMove(currentMove);
                if(returnedValue == 0) {
                    game.setCounter(-1);
                    end = true;
                    break;
                }
                if(returnedValue == 1) {
                    game.setCounter(-1);
                    break;
                }
                game.playRound();
                game.displayCurrentRound();
                if(game.getCounter() == game.getNOfRounds()) {
                    game.displayGameWinner();
                    end = true;
                }
            }
        }
    }
}
