package inheritance;

public class Cab  {
	
	private int noOfWheels;
	private Driver d1=new Driver("vairam114","1234");
	


	public Driver getD1() {
		return d1;
	}


	public void setD1(Driver d1) {
		this.d1 = d1;
	}


	public int getNoOfWheels() {
		return noOfWheels;
	}


	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}	
	


	public Cab() {
		super();
	}
	public void book() {
		System.out.println("cab is booked");
		System.out.println(this.noOfWheels);
		getD1().display();
	}

}
