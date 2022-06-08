package com.kodilla.kodillagoodpatterns.challenges.flightcompany.app;

import com.kodilla.kodillagoodpatterns.challenges.flightcompany.services.FlightSearchServices;

public class FlightSearchService {

    public SearchDto process(FlightSearchRequest flightSearchRequest) {
        FlightSearchServices flightSearchProcess = flightSearchRequest.getService();

        return flightSearchProcess.findFlights(flightSearchRequest);
    }
}
