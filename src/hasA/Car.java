package hasA;

public class Car {
	
	private String color;
	private double price;
	private int mileage;
	
	//creating the dependent variable and instantiating it into the depending object as a initializer..
	
	private Engine e1=new Engine("1500cc","v8");

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public Engine getE1() {
		return e1;
	}

	public void setE1(Engine e1) {
		this.e1 = e1;
	}

	public Car(String color, double price, int mileage) {
		super();
		this.color = color;
		this.price = price;
		this.mileage = mileage;
	}
	
	
}
