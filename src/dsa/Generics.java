package dsa;

import java.util.Arrays;

public class Generics {
	
	public static void main(String[] args) {
		
		GO go=new GO();
		go.add(10);
		go.add(10);
		go.add(10);
//		go.add(true);
		go.display();
		int sum=0;
		for(int i=0;i<go.val.length;i++) {
			sum+=(Integer)go.getVal()[i];
		}
		System.out.println(sum);
	}

}


//generalized class Object.
class GO{
	
	Object[] val=new Object[3];
	int ind=-1;
	
	public void add(Object val) {
		if(ind==this.val.length-1)	return;
		this.val[++ind]=val;
	}
	public Object[] getVal() {
		return val;
	}
	public void display() {
		System.out.println(Arrays.toString(val));
	}
	
}

//generic class
class GC<T>{
	class Node<T>{
		T data;
		
		Node(T data){
			this.data=data;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return data+"";
		}
	}
	
	Node<T> val[]=new Node[10];
	int ind=-1;
	
	public void add(T val) {
		if(ind==this.val.length-1)	return;
		this.val[++ind]=new Node(val);
	}
	public Node<T>[] getVal(){
		return val;
	}
	
	public void display() {
		System.out.println(Arrays.toString(val));
	}
}
