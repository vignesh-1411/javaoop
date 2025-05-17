package sample;

public class BagDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bag b1=new Bag();
		
		b1.setColor("green");
		b1.setPrice(2500);
		System.out.println(b1.getColor());
		System.out.println(b1.getPrice());
		
		b1.setColor("white");
		b1.setPrice(5000);
		System.out.println(b1.getColor());
		System.out.println(b1.getPrice());
	}

}
