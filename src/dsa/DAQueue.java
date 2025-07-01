package dsa;

public class DAQueue {
	
	int[] q=new int[5];
	int front=-1;
	int rear=-1;
	int size;
	
	public boolean isEmpty() {
		return front==-1 || rear==-1;
	}
	
	public boolean isFull() {
		return (rear+1)%q.length==front;
	}
	
	public boolean enQueue(int val) {
		if(isFull()) {
			int[] arr=new int[q.length*2];
			for(int i=0;i<q.length;i++) {
				arr[i]=q[(front+i)%q.length];
			}
			q=arr;
			front=0;
			rear=size;
		}
		q[rear]=val;
		rear=(rear+1)%q.length;
		size++;
		return true;
	}
	public boolean deQueue() {
		if(isEmpty()) {
			System.err.println("QueueUnderflow");
			return false;
		}
		front =(front+1)%q.length;
		size--;
		if(size<q.length/2) {
			int[] arr=new int[q.length/2];
			for(int i=0;i<=rear;i++) {
				arr[i]=arr[(front+i)%q.length];
			}
			q=arr;
			front=0;
			rear=size-1;
		}
		return true;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("QueueUnderFlow!..");
			return -1;
		}
		return q[front];
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("QueueUnderFlow!..");
		}
		else {
			for(int i=0;i<size;i++) {
				int j=(front+i)%q.length;
				System.out.print(q[j]+"  ");
			}
			System.out.println();
		}
	}

}
