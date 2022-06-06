package com.kodilla.kodillagoodpatterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {

    boolean executeOrder(User buyer, User seller, Product product, LocalDateTime timeOfOrder);
}
