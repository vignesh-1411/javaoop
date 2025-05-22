package hasA;

public class Phone {
	
	private String model;
	private String color;
	private double price;
	
	private Externalmemory em1=new Externalmemory("crucial",1800,16);
	
	private Sim sim;
	
	
	public void createSim(int balance, long phoneno) {
		sim=new Sim(balance,phoneno);
	}

	public Externalmemory getEm1() {
		return em1;
	}

	public void setEm1(Externalmemory em1) {
		this.em1 = em1;
	}

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public Phone(String model, String color, double price) {
		super();
		this.model = model;
		this.color = color;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

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

	public Phone() {
		super();
	}
	
	public void display(Sim s1,Externalmemory m1) {
		System.out.println("properties of phone");
		System.out.println(model);
		System.out.println(color);
		System.out.println(price);
		
		System.out.println("properties of externalmemory");
		System.out.println(m1.getBrand());
		System.out.println(m1.getPrice());
		System.out.println(m1.getCapacity());
		
		System.out.println("properties of phone");
		System.out.println(s1.getBalance());
		System.out.println(s1.getPhoneno());
	}
	
	

}
