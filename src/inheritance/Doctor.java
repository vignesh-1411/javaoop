package inheritance;

public class Doctor {
	
	public String name;
	public int license;
	public Doctor() {
		super();
	}
	public Doctor(String name, int license) {
		super();
		this.name = name;
		this.license = license;
	}
	
	public void checkPulse() {
		System.out.println("pulsse is there ");
	}

}
