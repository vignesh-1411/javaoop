package dsa;

public class AQueue {
	
	int[] queue=new int[5];
	int f=-1;	//FRONT
	int r=-1;	//REAR
	int size;
	
	public boolean isEmpty() {
		return f==-1 || r==-1;
	}
	public boolean isFull() {
		return r+1%queue.length==f;
	}
	
	public void display() {
		System.out.println("the size of the queue is: "+size);
		if(isEmpty()) {
			System.out.println("queue is empty");
			return;
		}
		int i=f;
		do {
			System.out.print(queue[i]+" ");
			i=(i+1)%queue.length;
		}while(i!=(r+1)%queue.length);

//		while(true) {
//			System.out.print(queue[i]+" ");
//			if(i==r)	break;
//			i=(i+1)%queue.length;
//		}
		System.out.println();
	}
	
	public boolean Enqueue(int val) {
		
		if(isEmpty()) {
			r++;
			f++;
			queue[r]=val;
		}
		else if(isFull()) {
			return false;
			
		}
		else {
			r=(r+1)%queue.length;
			queue[r]=val;
		}
		size++;
		return true;
	}
	public boolean Dequeue() {
		if(isEmpty()) {
			return false;
		}
		else {
			f=(f+1)%queue.length;
			size--;
			return true;
		}
	}

}
