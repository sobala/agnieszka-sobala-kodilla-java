package com.kodilla.kodillagoodpatterns.challenges.food2door.app;

import com.kodilla.kodillagoodpatterns.challenges.food2door.services.ProcessingService;

public class OrderService {

    public OrderDto process(final OrderRequest orderRequest) {
        ProcessingService processingService = orderRequest.getProducent().getProcessingService();
        boolean isOrderProcessed = processingService.executeOrder();

        if (isOrderProcessed) {
            return new OrderDto(orderRequest.getProduct(), orderRequest.getAmount(), orderRequest.getProducent(), true);
        } else {
            return new OrderDto(orderRequest.getProduct(), orderRequest.getAmount(), orderRequest.getProducent(), false);
        }
    }
}
