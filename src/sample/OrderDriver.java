package sample;

public class OrderDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Order o1=new Order();
		o1.setName("camera");
		o1.setProdId("9u7g4u3h");
		o1.setPrice(90000);
		o1.setPayment("gpay");
		
		System.out.println(o1.getName());
		System.out.println(o1.getProdId());
		System.out.println(o1.getPrice());
		System.out.println(o1.getPayment());
	}

}
