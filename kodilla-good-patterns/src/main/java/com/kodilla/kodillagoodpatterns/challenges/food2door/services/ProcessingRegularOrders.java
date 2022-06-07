package com.kodilla.kodillagoodpatterns.challenges.food2door.services;

public class ProcessingRegularOrders implements ProcessingService {

    @Override
    public boolean executeOrder() {
        System.out.println("Processing order by method 3.");
        return true;
    }
}
