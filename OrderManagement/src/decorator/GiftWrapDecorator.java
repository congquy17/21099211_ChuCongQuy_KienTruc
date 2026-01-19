package decorator;

public class GiftWrapDecorator extends OrderDecorator {

    public GiftWrapDecorator(OrderService service) {
        super(service);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("Gói quà cho đơn hàng");
    }
}
