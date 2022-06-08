package com.kodilla.kodillagoodpatterns.challenges.flightcompany.database;

import com.kodilla.kodillagoodpatterns.challenges.flightcompany.app.Flight;

import java.util.HashMap;
import java.util.Map;

public class FlightDatabase {

    private Map<Integer, Flight> flightDatabase;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightDatabase that = (FlightDatabase) o;

        return flightDatabase != null ? flightDatabase.equals(that.flightDatabase) : that.flightDatabase == null;
    }

    @Override
    public int hashCode() {
        return flightDatabase != null ? flightDatabase.hashCode() : 0;
    }

    public FlightDatabase() {
        flightDatabase = new HashMap<>();
        flightDatabase.put(8324, new Flight(8324, "Katowice", "Warszawa"));
        flightDatabase.put(8325, new Flight(8325, "Katowice", "Lodz"));
        flightDatabase.put(8326, new Flight(8326, "Lodz", "Warszawa"));
        flightDatabase.put(8327, new Flight(8327, "Katowice", "Szczecin"));
        flightDatabase.put(8328, new Flight(8328, "Szczecin", "Warszawa"));
        flightDatabase.put(8329, new Flight(8329, "Szczecin", "Poznan"));
        flightDatabase.put(8321, new Flight(8321, "Poznan", "Warszawa"));
        flightDatabase.put(8322, new Flight(8322, "Katowice", "Wroclaw"));
        flightDatabase.put(8323, new Flight(8323, "Wroclaw", "Warszawa"));
        flightDatabase.put(8320, new Flight(8320, "Warszawa", "Wroclaw"));
    }

    public Map<Integer, Flight> getFlightDatabase() {
        return flightDatabase;
    }
}
