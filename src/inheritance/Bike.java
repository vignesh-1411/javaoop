package inheritance;

public class Bike extends Cab {
	private Boolean helmet;
	private String model="ktm";
	private String no="9898";
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Bike(Boolean helmet, String model, String no) {
		super();
		this.helmet = helmet;
		this.model = model;
		this.no = no;
	}
	public Bike() {
		super();
	}
	
	@Override
	public void book() {
		System.out.println("Bike is booked");
		System.out.println(this.model);
		System.out.println(this.no);
		getD1().display();
	}

	public Boolean getHelmet() {
		return helmet;
	}

	public void setHelmet(Boolean helmet) {
		this.helmet = helmet;
	}
	
	
	

	

}
