package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    Map<String,Boolean> availableAirports;

    public FlightSearch() {
        availableAirports = new HashMap<>();
        availableAirports.put("Oslo", true);
        availableAirports.put("Warsaw", false);
        availableAirports.put("Moscow", true);
        availableAirports.put("Berlin", false);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        if (availableAirports.get(flight.getArrivalAirport()) == null) {
            throw new RouteNotFoundException();
        } else {
            return availableAirports.get(flight.getArrivalAirport());
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
