package com.kodilla.rps;

import java.util.Scanner;

public class Game {

    private int nOfRounds;
    public int counter;
    private Player player;
    private Computer computer;
    private String playerMove;
    private String computerMove;
    private GamePlayer currentWinner;
    private boolean draw;
    Scanner key = new Scanner(System.in);

    public Game() {
        this.counter = 0;
    }

    public void askInitialInfo() {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = key.nextLine();
        System.out.println("Enter the number of rounds: ");
        int nOfRounds = Integer.parseInt(key.nextLine());
        this.setupGame(username, nOfRounds);
    }

    public void setupGame(String username, int nOfRounds) {
        player = new Player(null, username);
        computer = new Computer();
        this.nOfRounds = nOfRounds;
    }

    public int getNOfRounds() {
        return nOfRounds;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int n) {
        counter += n;
    }

    public void displayInstructions() {
        System.out.println("Press the key:\n" +
                "1 - to play stone\n" +
                "2 - to play paper\n" +
                "3 - to play scissors\n" +
                "x - to end the game\n" +
                "n - to play a new game\n");
    }

    public int executePlayerMove(String move) {
        if (move.equals("x")) {
            System.out.println("Are you sure you want to end the game? Press y if yes or n if no.");
            if (key.nextLine().equals("y")) {
                return 0;
            }
        } else if (move.equals("n")) {
            System.out.println("Are you sure you want to start a new game? Press y if yes or n if no.");
            if (key.nextLine().equals("y")) {
                return 1;
            }
        } else {
            player.setCurrentMove(move);
        }
        return 2;
    }

    public void playRound() {
        computerMove = computer.returnRandomMove();
        playerMove = player.getCurrentMove();
        if (computerMove.equals(playerMove)) {
            this.setCounter(-1);
            draw = true;
        } else if (computerMove.equals("1")) {
            if (playerMove.equals("2")) {
                player.setWonRounds(1);
                currentWinner = player;
            }
            else {
                computer.setWonRounds(1);
                currentWinner = computer;
            }
        } else if (computerMove.equals("2")) {
            if (playerMove.equals("3")) {
                player.setWonRounds(1);
                currentWinner = player;
            }
            else {
                computer.setWonRounds(1);
                currentWinner = computer;
            }
        } else if (computerMove.equals("3")) {
            if (playerMove.equals("1")) {
                player.setWonRounds(1);
                currentWinner = player;
            }
            else {
                computer.setWonRounds(1);
                currentWinner = computer;
            }
        }
    }

    public void displayCurrentRound() {
        System.out.println("Computer played " + returnMoveName(computerMove) + ".");
        System.out.println(player.getName() +" played " + returnMoveName(playerMove) + ".");
        if (draw) {
            System.out.println("There's a draw, play again.\n");
        } else {
            System.out.println(currentWinner.getName() + " won this round.\n");
            System.out.println("So far computer has won " + computer.getWonRounds() + " rounds, and " + player.getName() + " has won " + player.getWonRounds() + ".\n");
        }
        draw = false;
    }

    public void displayGameWinner() {
        if (player.getWonRounds() == computer.getWonRounds()) {
            System.out.println("There's a draw.");
        } else if (player.getWonRounds() > computer.getWonRounds()) {
            System.out.println(player.getName() + " is a winner.");
        } else {
            System.out.println("Computer is a winner.");
        }
    }

    public String returnMoveName(String move) {
        if (move.equals("1")) {return "stone";}
        else if (move.equals("2")) {return "paper";}
        else {return "scissors";}
    }
}
