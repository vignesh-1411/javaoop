package comparee;

public class Pen implements Comparable {
	int price;
	String brand;
	public Pen(int price,String brand) {
		super();
		this.brand=brand;
		this.price=price;
	}
	public int compareTo(Object o) {
		Pen p1=(Pen)o;
		return this.price-p1.price;
		
	}

}
