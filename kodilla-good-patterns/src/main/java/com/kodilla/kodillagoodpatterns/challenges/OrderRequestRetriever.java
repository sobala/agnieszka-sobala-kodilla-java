package com.kodilla.kodillagoodpatterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User buyer = new User("John", "Wekl", 48392);
        User seller= new User("Tom", "Edison", 29485);

        Product product = new Product("Car", 3421);

        LocalDateTime timeOfOrder = LocalDateTime.of(2017, 8, 1, 12, 0);

        return new OrderRequest(buyer, seller, product, timeOfOrder);
    }
}
