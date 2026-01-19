package state;

public class ProcessingOrderState implements OrderState {

    @Override
    public void handle(Order order) {
        System.out.println("Đang xử lý: Đóng gói và vận chuyển");
    }
}
