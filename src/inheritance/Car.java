package inheritance;

public class Car extends Cab {
	private boolean ac=true;
	private String color;
	private String no;
	private Driver d1=new Driver();

	

	public boolean isAc() {
		return ac;
	}


	public void setAc(boolean ac) {
		this.ac = ac;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getNo() {
		return no;
	}


	public void setNo(String no) {
		this.no = no;
	}


	public Car() {
		super();
	}
	
	
	@Override
	public void book() {
		System.out.println("car is booked");
		System.out.println(this.ac);
		System.out.println(this.color);
		System.out.println(this.no);
		getD1().display();
	}

}
