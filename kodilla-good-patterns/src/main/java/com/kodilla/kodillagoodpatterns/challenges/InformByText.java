package com.kodilla.kodillagoodpatterns.challenges;

public class InformByText implements InformationService {

    @Override
    public void inform(User buyer, User seller) {
        System.out.println("Hi " + buyer.getFirstName() + "! You have successfully bought the product.");
        System.out.println("Hi " + seller.getFirstName() + "! You have sold your product.");
    }
}
