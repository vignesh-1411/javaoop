package exception;

public class Exceptionn {
	void dixith() throws InterruptedException  {
		System.out.println("dixith");
		Thread.currentThread().interrupt(); // Interrupts the current thread
		Thread.sleep(0);
		System.out.println("end");
		
		

	}
	void hari() throws InterruptedException  {
		System.out.println("hari");
		dixith();
	}
	void vimal()    {
		System.out.println("vimal");
		try {
			hari();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main start");
		Exceptionn e1=new Exceptionn();
		
		e1.vimal();
		
		
		
		
		
		
	}


}
