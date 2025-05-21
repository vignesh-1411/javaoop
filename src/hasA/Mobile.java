package hasA;

public class Mobile {
	
	private String brand;
	private double price;
	private int ram;
	private Battery b1=new Battery("3-cell",5000);
	public Mobile(String brand, double price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public Battery getB1() {
		return b1;
	}
	public void setB1(Battery b1) {
		this.b1 = b1;
	}
	
	public void mobileDetails(Battery b1) {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(ram);
		System.out.println(b1.getBatteryCapacity());
		System.out.println(b1.getType());
	}
	
	
}
