package com.kodilla.kodillagoodpatterns.challenges.flightcompany.services;

import com.kodilla.kodillagoodpatterns.challenges.flightcompany.app.Flight;
import com.kodilla.kodillagoodpatterns.challenges.flightcompany.app.FlightSearchRequest;
import com.kodilla.kodillagoodpatterns.challenges.flightcompany.app.SearchDto;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DisplayFlightsTo extends Services implements FlightSearchServices  {

    @Override
    public SearchDto findFlights(FlightSearchRequest flightSearchRequest) {
        String city = flightSearchRequest.getCity();
        List<Flight> listOfFlights = database.entrySet().stream()
                .filter(f -> city.equals(f.getValue().getCityTo()))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        return new SearchDto(listOfFlights, true);
    }
}
