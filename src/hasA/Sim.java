package hasA;

public class Sim {
	
	private int balance;
	private long phoneno;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public Sim(int balance, long phoneno2) {
		super();
		this.balance = balance;
		this.phoneno = phoneno2;
	}
	public Sim() {
		super();
	}
	
	

}
