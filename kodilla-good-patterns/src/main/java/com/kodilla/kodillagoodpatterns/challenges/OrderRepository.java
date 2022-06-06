package com.kodilla.kodillagoodpatterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createOrder(User buyer, User seller, Product product, LocalDateTime timeOfOrder);
}
