package dsa;

import dsa.DoublyLinkedList.Node;

public class CircularDLL {
	
		static class Node{
		
		//this is the inner class of dll, only accessed by DLL.Node
		//here we're doing this because ther's class named node already in the package..so we create inner class for this DLL particularly
		
		// i'm making this class as static, if not i've to create a object for DLL to access this class.
		
		
		int val;
		Node prev;
		Node next;
		public Node(int val) {
			super();
			this.val = val;
		}
		
		
	}
	
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
		System.out.println("the size is: "+ size());
		
		Node temp=head;
		do {
			System.out.println(temp.val);
			temp=temp.next;
		}while(temp!=head);
	}
	public boolean append(int val) {
		Node n1=new Node(val);
		if(isEmpty()) {
			head=tail=n1;
			tail.next=head;
			head.prev=tail;
			
		}
		else {
			n1.prev=tail;
			tail.next=n1;
			tail=n1;
			n1.next=head;
			head.prev=tail;
		}
		size++;
		return true;
	}
	
	public boolean prepend(int val) {
		Node n1=new Node(val);
		if(isEmpty()) {
			head=tail=n1;
			tail.next=head;
			head.prev=tail;
		}
		else {
			n1.next=head;
			n1.prev=tail;
			head.prev=n1;
			head=n1;
			tail.next=head;
		}
		size++;
		return true;
	}
	
	public boolean insert(int ind,int val) {
		if(ind==0) {
			prepend(val);
			return true;
		}
		else if(ind>=size()) {
			append(val);
			return true;
		}
		else {
			Node n1=new Node(val);
			Node temp=head;
			for(int i=0;i<ind-1;i++) {
				temp=temp.next;
			}
			n1.next=temp.next;
			n1.prev=temp;
			temp.next.prev=n1;
			temp.next=n1;
			
		}
		size++;
		return true;
	}
	
	public boolean delete(int ind) {
		if(ind<0 || ind>size())	return false;
		if(ind==0) {
			head.next.prev=tail;
			head=head.next;
			tail.next=head;
		}
		else if(ind==size) {
			tail=tail.prev;
			tail.next=head;
			head.prev=tail;
		}
		else {
			Node temp=head;
			for(int i=0;i<ind;i++) {
				temp=temp.next;
			}
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
		}
		size--;
		return true;
	}
	
	public boolean deleteIFirst() {
		return delete(0);
	}
	public boolean deleteLast() {
		return delete(size);
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
