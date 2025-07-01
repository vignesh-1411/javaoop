package dsa;

public class StackLL {
	
	static class Node{
		int val;
		Node next;
		
		Node(int val){
			this.val=val;
		}
		
	}
	
	Node top;
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public int push(int val) {
		Node n1=new Node(val);
		if(isEmpty()) {
			top=n1;
		}
		else {
			n1.next=top;
			top=n1;
		}
		return top.val;
		
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("StackUnderFlow!..");
			return -1;
			
		}
		else {
			int val=top.val;
			top=top.next;
			return val;
			
		}
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("StackUnderFlow!..");
			return -1;
		}
		return top.val;
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("StackisEmpty!..");
		}
		else {
			Node temp=top;
			System.out.println("the elements in the stack are: ");
			while(temp!=null) {
				System.out.print(temp.val+"	");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		StackLL sll=new StackLL();
		sll.push(10);
		sll.push(20);
		sll.push(30);
		System.out.println(sll.peek());
		sll.pop();
		sll.display();
	}

}
