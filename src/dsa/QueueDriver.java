package dsa;

import java.util.Arrays;

public class QueueDriver {
	
	public static void main(String[] args) {
		AQueue queue=new AQueue();
		System.out.println(queue.isEmpty());
		System.out.println(queue.Enqueue(1));
		System.out.println(queue.isEmpty());
		
		
		System.out.println(queue.Enqueue(2));
		queue.display();
		queue.Dequeue();
		
		queue.Enqueue(3);
		queue.Enqueue(4);
		queue.Enqueue(5);
		
		queue.Enqueue(6);
		queue.display();
//		System.out.println(Arrays.toString(queue.queue));
		
		
		DAQueue dq=new DAQueue();
		dq.enQueue(10);
		dq.enQueue(20);
		dq.enQueue(30);
		dq.enQueue(40);
		dq.enQueue(50);
		dq.enQueue(60);
		
		
		
	}


}
