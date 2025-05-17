package sample;

public class Book {
	
	//static initializer should be before the constructor
	//here its multi line initializer
	
	static {
		System.out.println("static");
	}
	
	String title;
	double price;
	Book(){
		
	}
	Book(String title,double price){
		this.title=title;
		this.price=price;
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		
		/*Book b1=new Book();
		Book b2=new Book("adc",200);
		System.out.println(b2.price);
		System.out.println(b1.price);
		*/
		
		
	}

}
