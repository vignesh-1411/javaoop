package inheritance;

public class Driver {
	private String driverId;
	private String driverLisence;
	public Driver(String driverId, String driverLisence) {
		super();
		this.driverId = driverId;
		this.driverLisence = driverLisence;
	}
	public Driver() {
		super();
	}
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	public String getDriverLisence() {
		return driverLisence;
	}
	public void setDriverLisence(String driverLisence) {
		this.driverLisence = driverLisence;
	}
	public void display() {
		System.out.println(this.driverId);
		System.out.println(this.driverLisence);
	}

}
