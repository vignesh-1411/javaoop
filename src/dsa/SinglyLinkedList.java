package dsa;

public class SinglyLinkedList {
	
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
		System.out.println("the size is: "+size());
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.val+" ");
			temp=temp.next;
		}
	}
	public void prepend(int n) {
//		TC is O(1) and SC is O(1)
		Node n1=new Node(n);
		if(isEmpty()) {
			head=tail=n1;
		}
		else {
			n1.next=head;
			head=n1;
		}
		size++;
		System.out.println("node is prepended");
	}
	public void append(int n) {
//		TC is O(1) and SC is O(1)
		Node n1=new Node(n);
		if(isEmpty()) {
			head=tail=n1;
		}
		else {
			tail.next=n1;
			tail=n1;
			
//			both are same..
//			tail.next=new Node(n);
//			tail=tail.next;
		}
		size++;
	}
	public boolean insert(int ind,int n) {
		if(ind<0) 	return false;
		if(ind==0) {	prepend(n); }
		if(ind>=size) { 	append(n);	}
		Node n1=new Node(n);
		Node temp=head;
		for(int i=0;temp!=null && i<ind-1;i++) {
			temp=temp.next;
		}
		n1.next=temp.next;
		temp.next=n1;
		size++;
		return true;
		
	}
	public boolean deleteFirst() {
		if(isEmpty())	return false;
		if(size==1) {
			head=tail=null;
		}
		head=head.next;
		size--;
		return true;
	}
	public boolean deleteLast() {
		if(isEmpty())	return false;
		if(head==tail)	head=tail=null;
		Node temp=head;
		while(temp.next!=tail) {
			temp=temp.next;
		}
		temp.next=null;
		tail=temp;
		
		size--;
		return true;
	}
	public boolean deleteAtindex(int ind) {
		
		if(ind==0) {	deleteFirst(); return true; }
		if(ind==size-1) {	deleteLast();	return true; }
		if(head==tail)	head=tail=null;
		Node temp=head;
		int c=0;
		while(c<(ind-1)) {
			temp=temp.next;
			c++;
		}
		temp.next=temp.next.next;
		size--;
		return true;
		
	}
	
	public int getVal(int ind) {
		if(isEmpty() || ind<0 || ind>=size)	return -1;
		Node temp=head;
		for(int i=0;i<ind;i++) {
			temp=temp.next;
			
		}
		return temp.val;
	}
	
	public int midVal() {
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.val;
	}
	

}
