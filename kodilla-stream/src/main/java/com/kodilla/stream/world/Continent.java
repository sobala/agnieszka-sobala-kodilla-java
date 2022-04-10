package com.kodilla.stream.world;

import java.util.List;

public class Continent {

    private final String name;
    private final List<Country> countries;

    public Continent(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
