package com.kodilla.kodillagoodpatterns.challenges.flightcompany.services;

import com.kodilla.kodillagoodpatterns.challenges.flightcompany.app.Flight;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.kodilla.kodillagoodpatterns.challenges.flightcompany.app.Application.flightDatabase;

public abstract class Services {
    protected Map<Integer, Flight> database = flightDatabase.getFlightDatabase();
    protected List<Flight> listOfFlights = new ArrayList<>();
}
