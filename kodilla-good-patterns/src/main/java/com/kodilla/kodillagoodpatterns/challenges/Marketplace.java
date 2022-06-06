package com.kodilla.kodillagoodpatterns.challenges;

import java.time.LocalDateTime;

public class Marketplace implements OrderService {

    @Override
    public boolean executeOrder(User buyer, User seller, Product product, LocalDateTime timeOfOrder) {
        System.out.println("The order has been processed.");
        return true;
    }
}
