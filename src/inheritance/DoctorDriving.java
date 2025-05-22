package inheritance;

public class DoctorDriving {

	public static void main(String[] args) {
		
		Doctor d1=new Doctor("vairam",101);
		System.out.println(d1.name);
		Cardiology c1=new Cardiology();
		System.out.println(c1.name);
		c1.name="pirajan";
		System.out.println(c1.name);
	}
}
