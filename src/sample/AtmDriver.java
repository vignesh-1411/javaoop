package sample;

public class AtmDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Atm a1=new Atm();
		a1.setLocation("chennai");
		//a1.setPin(1234);
		a1.setMoney(9000);
		System.out.println(a1.getLocation());
		//System.out.println(a1.getPin());
		System.out.println(a1.getMoney(1234));

	}

}
