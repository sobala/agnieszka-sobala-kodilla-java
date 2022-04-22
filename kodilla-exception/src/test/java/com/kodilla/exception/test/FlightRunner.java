package com.kodilla.exception.test;

public class FlightRunner {

    public static void main(String[] args) {

        FlightSearch fs = new FlightSearch();
        try {
            boolean canFly = fs.findFlight(new Flight("Oslo", "Moscow"));
            if (canFly) {
                System.out.println("You can fly!");
            } else {
                System.out.println("You can't fly there.");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found.");
        }
    }
}
