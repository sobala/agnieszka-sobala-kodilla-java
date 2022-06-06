package com.kodilla.kodillagoodpatterns.challenges;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Database implements OrderRepository {

    List<OrderRecord> database = new ArrayList<>();

    @Override
    public boolean createOrder(User buyer, User seller, Product product, LocalDateTime timeOfOrder) {
        OrderRecord orderRecord = new OrderRecord(buyer, seller, product, timeOfOrder);
        database.add(orderRecord);
        return true;
    }
}
