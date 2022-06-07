package com.kodilla.kodillagoodpatterns.challenges.food2door.app;

public class OrderRequest {

    private Product product;
    private int amount;
    private Producent producent;

    public OrderRequest(Product product, int amount, Producent producent) {
        this.product = product;
        this.amount = amount;
        this.producent = producent;
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
}
