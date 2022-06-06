package com.kodilla.kodillagoodpatterns.challenges;

public final class Product {

    private final String name;
    private final int id;

    public Product(final String name, final int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
