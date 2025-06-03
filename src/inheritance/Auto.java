package inheritance;

public class Auto extends Cab {
	private Boolean lever=true;
	private String no="tn-6969";

	
	

	public Boolean getLever() {
		return lever;
	}

	public void setLever(Boolean lever) {
		this.lever = lever;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Auto() {
		super();
	}

	public void pirajan() {
		System.out.println("vairam");
	}
	@Override
	public void book() {
		System.out.println("auto is booked");
		System.out.println(this.no);
		getD1().display();
	}
	

}
