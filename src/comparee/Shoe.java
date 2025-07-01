package comparee;

public class Shoe implements Comparable {
	
	private String brand;
	private int price;
	private int size;
	private String type;
	public Shoe() {
		super();
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Shoe(String brand, int price, int size, String type) {
		super();
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.type = type;
	}
	
	
	
	//compareTo method for default sorting based on brand....
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Shoe s1=(Shoe)o;
		
		return this.brand.compareTo(s1.brand);
	}
	
	

}
