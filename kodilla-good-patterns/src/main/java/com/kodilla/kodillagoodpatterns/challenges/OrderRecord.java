package com.kodilla.kodillagoodpatterns.challenges;

import java.time.LocalDateTime;

public class OrderRecord {

    private User buyer;
    private User seller;
    private Product product;
    private LocalDateTime timeOfOrder;

    public OrderRecord(User buyer, User seller, Product product, LocalDateTime timeOfOrder) {
        this.buyer = buyer;
        this.seller = seller;
        this.product = product;
        this.timeOfOrder = timeOfOrder;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDateTime getTimeOfOrder() {
        return timeOfOrder;
    }

    public void setTimeOfOrder(LocalDateTime timeOfOrder) {
        this.timeOfOrder = timeOfOrder;
    }
}
