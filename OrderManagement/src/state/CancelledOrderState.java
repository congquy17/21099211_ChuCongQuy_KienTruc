package state;

public class CancelledOrderState implements OrderState {
    public void handle() {
       
    }

	@Override
	public void handle(Order order) {
		 System.out.println("Hủy: Hủy đơn hàng và hoàn tiền");
		
	}
}
