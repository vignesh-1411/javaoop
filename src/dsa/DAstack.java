package dsa;

public class DAstack {
	
	public static void main(String[] args) {
		Arraysstack list=new Arraysstack();
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		list.push(50);
		System.out.println(list.pop());
		System.out.println(list.pop());
		list.display();
		System.out.println(list.peek());
		
	}
	
	

}

class Arraysstack{
	
	int[] stack=new int[10];
	int top=-1;
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==stack.length-1;
	}
	
	public void push(int val) {
		if(isFull()){
			int[] temp=new int[stack.length*2];
			for(int i=0;i<stack.length;i++) {
				temp[i]=stack[i];
			}
			stack=temp;
		}
		stack[++top]=val;
		return;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.err.println("StackUnderflow");
			return -1;
		}
		if(top<stack.length/2) {
			int[] temp=new int[stack.length/2];
			for(int i=0;i<=top;i++) {
				temp[i]=stack[i];
			}
			stack=temp;
		}
		return stack[top--];
	}
	
	public int peek() {
		if(isEmpty()){
			System.err.println("StackUnderflow");
			return -1;
		}
		else {
			return stack[top];
		}
	}
	public void display() {
		if(isEmpty()) {
			System.out.println();
		}
		else {
			for(int i=0;i<=top;i++) {
				System.out.print(stack[i]+"  ");
			}
			System.out.println();
		}
		return;
	}
}
