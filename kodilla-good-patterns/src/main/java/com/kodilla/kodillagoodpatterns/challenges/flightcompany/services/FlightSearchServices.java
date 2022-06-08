package com.kodilla.kodillagoodpatterns.challenges.flightcompany.services;

import com.kodilla.kodillagoodpatterns.challenges.flightcompany.app.FlightSearchRequest;
import com.kodilla.kodillagoodpatterns.challenges.flightcompany.app.SearchDto;

public interface FlightSearchServices {

    SearchDto findFlights(FlightSearchRequest flightSearchRequest);
}
