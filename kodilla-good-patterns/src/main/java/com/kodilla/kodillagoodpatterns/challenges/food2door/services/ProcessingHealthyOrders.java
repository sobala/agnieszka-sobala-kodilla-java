package com.kodilla.kodillagoodpatterns.challenges.food2door.services;

public class ProcessingHealthyOrders implements ProcessingService {

    @Override
    public boolean executeOrder() {
        System.out.println("Processing order by method 2.");
        return true;
    }
}
