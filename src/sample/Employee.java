package sample;
import java.time.LocalDateTime;


class EmployeeTS{
	
	static {
		System.out.println("Employee tracking system");
	}
	{
		count++;
	}
	{
		System.out.println(LocalDateTime.now());
	}
	int id;
	String name;
	String dept;
	static String companyName="Google";
	static int count;

	public EmployeeTS(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public void display() {
		System.out.println(companyName);
		//System.out.println(count);
		System.out.println(id);
		System.out.println(name);
		System.out.println(dept);
	}
}
public class Employee {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeTS e1=new EmployeeTS(01,"vairam","tech");
		EmployeeTS e2=new EmployeeTS(02,"vasanth","tech");
		e1.display();
		e2.display();
		


	}

}
