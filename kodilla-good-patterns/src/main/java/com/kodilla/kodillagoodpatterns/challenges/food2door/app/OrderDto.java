package com.kodilla.kodillagoodpatterns.challenges.food2door.app;

public class OrderDto {

    private Product product;
    private int amount;
    private Producent producent;
    private boolean isOrderProcessed;

    public OrderDto(Product product, int amount, Producent producent, boolean isOrderProcessed) {
        this.product = product;
        this.amount = amount;
        this.producent = producent;
        this.isOrderProcessed = isOrderProcessed;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public Producent getProducent() {
        return producent;
    }

    public boolean isOrderProcessed() {
        return isOrderProcessed;
    }

    public void displayStatus() {
        if (isOrderProcessed) {
            System.out.println("The order has been processed successfully.");
        } else {
            System.out.println("The order has not been processed.");
        }
    }
}
