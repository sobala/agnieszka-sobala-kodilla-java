package com.kodilla.kodillagoodpatterns.challenges.food2door.app;

public class Application {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest newOrder = orderRequestRetriever.retrieve();

        OrderDto orderDto = orderService.process(newOrder);
        orderDto.displayStatus();
    }
}
