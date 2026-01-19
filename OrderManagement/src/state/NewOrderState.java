package state;

public class NewOrderState implements OrderState {

    @Override
    public void handle(Order order) {
        System.out.println("Mới tạo: Kiểm tra thông tin đơn hàng");
    }
}
