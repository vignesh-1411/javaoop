package dsa;

public class DoublyLinkedList {
	
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
		System.out.println("the size is: "+size());
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}
	}
	
	public boolean append(int val) {
		Node n=new Node(val);
		if(isEmpty()) {
			head=tail=n;
		}
		else {
			tail.next=n;
			n.prev=tail;
			tail=n;
		}
		size++;
		return true;
	}
	
	public boolean prepend(int val) {
		Node n=new Node(val);
		if(isEmpty())	head=tail=n;
		else {
			head.prev=n;
			n.next=head;
			head=n;
		}
		size++;
		return true;
	}
	
	public boolean insert(int ind,int val) {
		if(ind<0)	return false;
		Node n=new Node(val);
		if(ind==0) {	prepend(val);	return true; }
		if(ind==size()-1) {	append(val);	return false; }
		else {
			Node temp=head;
			for(int i=0;i<ind;i++) {
				temp=temp.next;
				
			}
			n.next=temp;
			n.prev=temp.prev;
			temp.prev.next=n;
			temp.prev=n;
			
			
		}
		size++;
		return true;
	}
	
	public boolean deleteFirst() {
		if(size()==1)	head=tail=null;
		else {
			head=head.next;
			head.prev=null;
		}
		size--;
		return true;
	}
	public boolean deleteLast() {
		if(size()==1)	head=tail=null;
		else {
			tail=tail.prev;
			tail.next=null;
		}
		size--;
		return true;
	}
	
	public boolean delete(int ind) {
		if(ind==0) { deleteFirst();	return true;	}
		if(ind==size-1) { 	deleteLast();	return true;	}
		else {
			Node temp=head;
			
			for(int i=0;i<ind-1;i++) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
			temp.next.prev=temp;
			
			
			//if IF condition is given as (i<ind)
//			temp.prev.next = temp.next;
//		    temp.next.prev = temp.prev;
//			
		}
		size--;
		return true;
		
	}

}
