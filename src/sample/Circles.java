package sample;

public class Circles {
	static double pi=3.14;
	
	
	public static void getArea(Circle c) {
		double area=pi*(c.getRadius()*c.getRadius());
		System.out.println(area);
	}

}
