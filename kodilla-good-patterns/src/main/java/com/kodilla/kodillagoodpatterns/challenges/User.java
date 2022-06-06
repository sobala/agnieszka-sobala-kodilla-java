package com.kodilla.kodillagoodpatterns.challenges;

public final class User {

    private final String firstName;
    private final String lastName;
    private final int id;

    public User(final String firstName, final String lastName, final int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }
}
