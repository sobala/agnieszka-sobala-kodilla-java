package com.kodilla.kodillagoodpatterns.challenges;

public class OrderDto {

    private User buyer;
    private User seller;
    private boolean isOrderProcessed;

    public OrderDto(final User buyer, final User seller, final boolean isOrderProcessed) {
        this.buyer = buyer;
        this.seller = seller;
        this.isOrderProcessed = isOrderProcessed;
    }

    public User getBuyer() { return buyer; }

    public User getSeller() { return seller; }

    public boolean isOrderProcessed() { return isOrderProcessed; }
}
