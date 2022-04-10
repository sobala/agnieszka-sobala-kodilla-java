package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] arg) {
        Boolean end = false;
        while(!end) {
            Scanner key = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String username = key.nextLine();
            System.out.println("Enter the number of rounds: ");
            int nOfRounds = key.nextInt();
            end = true;
        }
    }
}
