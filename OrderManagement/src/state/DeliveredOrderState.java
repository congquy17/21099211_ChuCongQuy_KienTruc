package state;

public class DeliveredOrderState implements OrderState {
  

	@Override
	public void handle(Order order) {
		// TODO Auto-generated method stub
		 System.out.println("Đã giao: Cập nhật trạng thái đã giao");
		
	}
}
