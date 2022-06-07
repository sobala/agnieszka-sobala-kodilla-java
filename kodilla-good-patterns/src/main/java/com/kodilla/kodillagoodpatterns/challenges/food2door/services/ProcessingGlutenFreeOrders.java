package com.kodilla.kodillagoodpatterns.challenges.food2door.services;

public class ProcessingGlutenFreeOrders implements ProcessingService {

    @Override
    public boolean executeOrder() {
        System.out.println("Processing order by method 1.");
        return true;
    }
}
