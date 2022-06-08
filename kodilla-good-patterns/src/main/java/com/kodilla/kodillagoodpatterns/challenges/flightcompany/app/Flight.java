package com.kodilla.kodillagoodpatterns.challenges.flightcompany.app;

public class Flight {

    private int id;
    private String cityFrom;
    private String cityTo;

    public Flight(int id, String cityFrom, String cityTo) {
        this.id = id;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
    }

    public int getId() {
        return id;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }
}
