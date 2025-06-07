package string;

public class Moon {
	int distance;
	int size;

	public Moon(int distance,int size) {
		super();
		this.distance = distance;
		this.size=size;
	}
	public boolean equals(Object o){
//		Object o=m1....upcasting 
		
		Moon m=(Moon)o;
		
//	we re downcasting again to access the child class members...
		
		return this.distance==m.distance && this.size==m.size;
	}
	
	public static void main(String[] args) {
		Moon m1=new Moon(90,9);
		Moon m2=new Moon(90,9);
//		System.out.println(m1==m2);
		
		System.out.println(m1.equals(m2));
		
	}

}
