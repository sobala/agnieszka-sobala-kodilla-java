package com.kodilla.kodillagoodpatterns.challenges.food2door.app;

import com.kodilla.kodillagoodpatterns.challenges.food2door.services.ProcessingHealthyOrders;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        Product product = new Product("Flour", 3421);
        int amount = 20;
        Producent producent = new Producent("HealthyShop", new ProcessingHealthyOrders());

        return new OrderRequest(product, amount, producent);
    }
}
