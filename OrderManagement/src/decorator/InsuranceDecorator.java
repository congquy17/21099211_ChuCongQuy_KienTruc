package decorator;

public class InsuranceDecorator extends OrderDecorator {

    public InsuranceDecorator(OrderService service) {
        super(service);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("Thêm bảo hiểm cho đơn hàng");
    }
}
