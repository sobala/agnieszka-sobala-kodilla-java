package com.kodilla.kodillagoodpatterns.challenges.flightcompany.services;

import com.kodilla.kodillagoodpatterns.challenges.flightcompany.app.Flight;
import com.kodilla.kodillagoodpatterns.challenges.flightcompany.app.FlightSearchRequest;
import com.kodilla.kodillagoodpatterns.challenges.flightcompany.app.SearchDto;

import java.util.List;
import java.util.Map;

public class FindFlightsThroughOtherCities extends Services implements FlightSearchServices {

    @Override
    public SearchDto findFlights(FlightSearchRequest flightSearchRequest) {

        String cityFrom = flightSearchRequest.getCityFrom();
        String cityTo = flightSearchRequest.getCityTo();
        String cityThrough = flightSearchRequest.getCityThrough();

        List<Flight> flightsFrom = database.entrySet().stream()
                .filter(f -> cityFrom.equals(f.getValue().getCityFrom()))
                .map(Map.Entry::getValue).toList();
        List<Flight> flightsTo = database.entrySet().stream()
                .filter(f -> cityTo.equals(f.getValue().getCityFrom()))
                .map(Map.Entry::getValue).toList();
        for (Flight flight1 : flightsFrom) {
            for (Flight flight2 : flightsTo) {
                if (flight1.getCityTo().equals(flight2.getCityFrom()) || flight1.getCityTo().equals(cityThrough)) {
                    listOfFlights.add(flight1);
                    listOfFlights.add(flight2);
                }
            }
        }
        return new SearchDto(listOfFlights, true);
    }
}
