package com.kodilla.kodillagoodpatterns.challenges.flightcompany.app;

import com.kodilla.kodillagoodpatterns.challenges.flightcompany.database.FlightDatabase;

public class Application {
    public static FlightDatabase flightDatabase;

    public static void main(String[] args) {

        FlightSearchService flightSearchService = new FlightSearchService();
        flightDatabase = new FlightDatabase();
        FlightSearchRequestRetriever flightSearchRequestRetriever = new FlightSearchRequestRetriever();
        FlightSearchRequest flightSearchRequest1 = flightSearchRequestRetriever.retrieve1();
        FlightSearchRequest flightSearchRequest2 = flightSearchRequestRetriever.retrieve2();
        FlightSearchRequest flightSearchRequest3 = flightSearchRequestRetriever.retrieve3();

        SearchDto searchDto1 = flightSearchService.process(flightSearchRequest1);
        SearchDto searchDto2 = flightSearchService.process(flightSearchRequest2);
        SearchDto searchDto3 = flightSearchService.process(flightSearchRequest3);

        searchDto1.displayStatus();
        searchDto2.displayStatus();
        searchDto3.displayStatus();
    }

}
