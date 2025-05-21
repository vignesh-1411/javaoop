package hasA;

public class CarDriver {
	public static void main(String[] args) {
		
		Car c1=new Car("black",800000,10);
		System.out.println(c1.getColor());
		
		System.out.println(c1.getE1().getEngineType());
		System.out.println(c1.getE1().getPower());
	}
}
