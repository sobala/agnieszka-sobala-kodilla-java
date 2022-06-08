package com.kodilla.kodillagoodpatterns.challenges.flightcompany.app;

import java.util.List;

public class SearchDto {

    private List<Flight> listOfFlights;
    private boolean isSearchSuccessful;

    public SearchDto(List<Flight> listOfFlights, boolean isSearchSuccessful) {
        this.listOfFlights = listOfFlights;
        this.isSearchSuccessful = isSearchSuccessful;
    }

    public List<Flight> getListOfFlights() {
        return listOfFlights;
    }

    public boolean isSearchSuccessful() {
        return isSearchSuccessful;
    }

    public void displayStatus() {
        if (isSearchSuccessful) {
            System.out.println("Flights have been found.");
        } else {
            System.out.println("No flights have been found.");
        }
    }
}
