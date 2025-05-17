package sample;

public class Atm {
	
	private double money;
	private String location;
	private int pin=1234;
	
	private  double checker(int pin) {
		int pin1=pin;
		int count=0;
		while(pin1>0) {
			pin1/=10;
			count++;
		}
		if(count==4 && pin==this.pin) {
			return this.money;
		}
		return -1;
	}
	public double getMoney(int pin) {
		double money=checker(pin);
		return money;
		
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	/*public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}*/
	
	

}
