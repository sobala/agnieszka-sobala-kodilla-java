package com.kodilla.kodillagoodpatterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User buyer;
    private User seller;
    private Product product;
    private LocalDateTime timeOfOrder;

    public OrderRequest(User buyer, User seller, Product product, LocalDateTime timeOfOrder) {
        this.buyer = buyer;
        this.seller = seller;
        this.product = product;
        this.timeOfOrder = timeOfOrder;
    }

    public User getBuyer() {
        return buyer;
    }

    public User getSeller() {
        return seller;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getTimeOfOrder() {
        return timeOfOrder;
    }
}
