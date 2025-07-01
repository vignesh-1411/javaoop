package dsa;

public class CircularSinglyLinkedList {
	
	Node head;
	Node tail;
	int size;
	
	
	public boolean isEmpty() {
		return head==null && tail==null;
	}
	
	public int size() {
		return size;
	}
	
	public void display() {
		System.out.println("the size is:"+size);
		Node temp=head;
		do {
			System.out.println(temp.val);
			temp=temp.next;
		}while(temp!=head);
		
	}
	
	public boolean append(int val) {
		return insert(size,val);
	}
	public boolean prepend(int val) {
		return insert(0,val);
	}
	
	public boolean insert(int ind,int val) {
		if(ind<0)	return false;
		Node n1=new Node(val);
		if(size==0) {
			head=tail=n1;
			tail.next=head;		//tail should point to head even it's itself(pointing to itself)
			
		}
		else if(ind==0) {
			n1.next=head;
			head=n1;
			tail.next=head;	//last node pointing to the first node again
		}
		else if(ind>size-1) {
			tail.next=n1;
			tail=n1;		//making the new node added as TAIL
			tail.next=head;		//making tail.next to head
		}
		else {
			Node temp=head;
			for(int i=0;temp!=tail;i++) {
				temp=temp.next;
			}
			n1.next=temp.next;
			temp.next=n1;
		}
		size++;
		return true;
	}
	
	public boolean delete(int ind) {
		if(isEmpty())	return false;
		if(ind<0 || ind>size-1)	return false;
		if(size==1)	head=tail=null;
		if(ind==0) {
			head=head.next;		//assigning head as the next node
			tail.next=head;		//we shouldn't forget to assign the tail.next to head again....
		}
		else if(ind==size-1) {
			Node temp=head;
			int c=0;
			while(temp.next.next!=head || temp.next!=tail) {
				temp=temp.next;
				c++;
			}
			temp.next=head;			//directly assign the head to prev node from last...
		}
		else {
			Node temp=head;
			for(int i=0;i<ind;i++) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
		size--;
		return true;
	}
	
	public boolean deleteFirst() {
		return delete(0);
	}
	public boolean deleteLast() {
		return delete(size-1);
	}
	
	public int getVal(int ind) {
		if(ind>=0) {
			Node temp=head;
			for(int i=0;i<ind;i++) {
				temp=temp.next;
			}
			return temp.val;
		}
		return -1;
		
		
	}

}
