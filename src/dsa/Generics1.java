package dsa;

public class Generics1<T> {
	
	T val;
	Generics1(T val){
		this.val=val;
	}
	
	public void setVal(T val) {
		this.val=val;
	}
	public T getVal() {
		return val;
	}
	
	public static void main(String[] args) {
		
		//here we're creating the object without placeholder/ we haven't specified any particular type of datatype
		//so defaultly it 'll take Object as a type.
		
//		Generics1 g=new Generics1(2);
//		System.out.println(g.getVal());
		
		Generics1<String> g1=new Generics1<>("hello"); 
		System.out.println(g1.getVal());
	}

}
