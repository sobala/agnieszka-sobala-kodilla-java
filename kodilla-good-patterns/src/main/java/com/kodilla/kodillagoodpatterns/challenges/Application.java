package com.kodilla.kodillagoodpatterns.challenges;

public class Application {

    public static void main(String[] args) {

        InformationService informByText = new InformByText();
        OrderService marketplace = new Marketplace();
        OrderRepository database = new Database();
        ProductOrderService productOrderService = new ProductOrderService(informByText, marketplace, database);
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest newOrder = orderRequestRetriever.retrieve();

        OrderDto result = productOrderService.process(newOrder);
    }
}
