package com.kodilla.kodillagoodpatterns.challenges.flightcompany.app;

import com.kodilla.kodillagoodpatterns.challenges.flightcompany.services.DisplayFlightsFrom;
import com.kodilla.kodillagoodpatterns.challenges.flightcompany.services.DisplayFlightsTo;
import com.kodilla.kodillagoodpatterns.challenges.flightcompany.services.FindFlightsThroughOtherCities;
import com.kodilla.kodillagoodpatterns.challenges.flightcompany.services.FlightSearchServices;

public class FlightSearchRequestRetriever {
    public FlightSearchRequest retrieve1() {
        String cityFrom = "Katowice";
        FlightSearchServices service = new DisplayFlightsFrom();
        return new FlightSearchRequest(cityFrom, service);
    }

    public FlightSearchRequest retrieve2() {
        String cityTo = "Warszawa";
        FlightSearchServices service = new DisplayFlightsTo();
        return new FlightSearchRequest(cityTo, service);
    }

    public FlightSearchRequest retrieve3() {
        String cityFrom = "Katowice";
        String cityTo = "Warszawa";
        String cityThrough = "Llodz";
        FlightSearchServices service = new FindFlightsThroughOtherCities();
        return new FlightSearchRequest(cityFrom, cityTo, cityThrough, service);
    }
}
