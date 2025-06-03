
package inheritance;
import java.util.*;

public class CabDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("PRESS 1 FOR BIKE | PRESS 2 FOR AUTO | PRESS 3 FOR CAR");
		int input=s.nextInt();
		/*Cab c1;
		//implicit non-primitive typecasting.....
		switch(input) {
		case 1:
			c1=new Bike();
			System.out.println("bike is booked");
			break;
		case 2:
			c1=new Auto();
			System.out.println("auto is booked");
			break;
		case 3:
			c1=new Car();
			System.out.println("car is booked");
			break;
			
		default:{
			System.out.println("enter the valid number");
		}
		}*/
		
		
		//polymorphism..methodoverriding
		
		Cab c1;
		switch(input) {
		case 1:
			c1=new Bike();
			c1.setNoOfWheels(2);
			c1.book();
			break;
		case 2:
			c1=new Auto();
			c1.book();
			break;
		case 3:
			c1=new Car();
			c1.book();
			break;
		default:
			System.out.println("enter the valid number");
		}
	
		s.close();
		

	}

}
