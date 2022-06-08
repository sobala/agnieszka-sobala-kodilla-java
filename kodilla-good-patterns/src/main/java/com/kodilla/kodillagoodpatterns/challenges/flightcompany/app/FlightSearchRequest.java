package com.kodilla.kodillagoodpatterns.challenges.flightcompany.app;

import com.kodilla.kodillagoodpatterns.challenges.flightcompany.services.FlightSearchServices;

public class FlightSearchRequest {

    private String city;
    private String cityFrom;
    private String cityTo;
    private String cityThrough;
    private FlightSearchServices service;

    public FlightSearchRequest(String city, FlightSearchServices service) {
        this.city = city;
        this.service = service;
    }

    public FlightSearchRequest(String cityFrom, String cityTo, String cityThrough, FlightSearchServices service) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.cityThrough = cityThrough;
        this.service = service;
    }

    public String getCity() {
        return city;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public String getCityThrough() {
        return cityThrough;
    }

    public FlightSearchServices getService() {
        return service;
    }
}
