package comparee;

import java.util.Arrays;
import java.util.Iterator;

public class PenDriver {
	public static void main(String[] args) {
		Pen p1=new Pen(90,"hero");
		Pen p2=new Pen(10,"XO");
		Pen p3=new Pen(140,"parker");
		
		Pen[] pens= {p1,p2,p3};
		for(Pen p:pens) {
			System.out.println(p.brand);
			System.out.println(p.price);
		}
		System.out.println("------");
		
		Arrays.sort(pens);
		for(Pen p:pens) {
			System.out.println(p.brand + " "+ p.price);
		}
	}
	


}
