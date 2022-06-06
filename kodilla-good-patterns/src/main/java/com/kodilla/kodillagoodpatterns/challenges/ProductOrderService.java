package com.kodilla.kodillagoodpatterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrderProcessed = orderService.executeOrder(orderRequest.getBuyer(), orderRequest.getSeller(),
                orderRequest.getProduct(), orderRequest.getTimeOfOrder());

        if (isOrderProcessed) {
            informationService.inform(orderRequest.getBuyer(), orderRequest.getSeller());
            orderRepository.createOrder(orderRequest.getBuyer(), orderRequest.getSeller(), orderRequest.getProduct(), orderRequest.getTimeOfOrder());
            return new OrderDto(orderRequest.getBuyer(), orderRequest.getSeller(), true);
        } else {
            return new OrderDto(orderRequest.getBuyer(), orderRequest.getSeller(), false);
        }
    }
}
