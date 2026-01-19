package main;

import state.*;
import strategy.*;
import decorator.*;

public class Main {
    public static void main(String[] args) {

        // STATE
        Order order = new Order();
        order.setState(new NewOrderState());

        order.process();

        order.setState(new ProcessingOrderState());
        order.process();

        // STRATEGY
        ShippingContext context = new ShippingContext();
        context.setStrategy(new FastShipping());
        context.execute();

        // DECORATOR
        OrderService service =
                new InsuranceDecorator(
                        new GiftWrapDecorator(
                                new BasicOrderService()));
        service.process();
    }
}
