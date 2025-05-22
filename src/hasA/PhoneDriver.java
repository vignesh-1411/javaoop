package hasA;

public class PhoneDriver {
	
	public static void main(String[] args) {
		
		Phone p1=new Phone("1plus","green",20000);
		
		p1.createSim(900,6379185498L);
		
		
		
		p1.display(p1.getSim(),p1.getEm1());
	}
}
