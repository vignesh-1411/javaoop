package dsa;

public class LinkedList {
	
	public static void main(String[] args) {
//		SinglyLinkedList sl=new SinglyLinkedList();
//		sl.display();
//		sl.prepend(10);
//		sl.display();
//		sl.prepend(20);
//		sl.prepend(30);
//		sl.display();
//		sl.append(5);
//		sl.display();
//		sl.insert(3, 6);
//		sl.append(8);
//		sl.display();
//		sl.deleteFirst();
//		sl.display();
//		sl.deleteLast();
//		sl.display();
//		sl.deleteAtindex(0);
//		sl.display();
//		System.out.println(sl.getVal(1));
//		System.out.println(sl.midVal());
		
		
		
//		CircularSinglyLinkedList csl=new CircularSinglyLinkedList();
//		csl.insert(0,1);
//		csl.insert(2, 10);
//		csl.insert(0, 11);
//		csl.display();
//		csl.insert(3, 99);
//		csl.display();
//		csl.delete(0);
//		csl.display();
//		System.out.println(csl.getVal(2));
		
//		DoublyLinkedList dl=new DoublyLinkedList();
//		System.out.println(dl.isEmpty());
//		dl.append(4);
//		dl.append(5);
//		dl.append(6);
//		dl.append(7);
//		dl.insert(2, 1);
//		dl.display();
//		dl.delete(2);
//		dl.display();
		
		
		CircularDLL cdl=new CircularDLL();
		cdl.append(4);
		cdl.append(5);
		cdl.prepend(3);
		cdl.prepend(2);
		cdl.display();
		cdl.insert(4, 30);
		cdl.display();
		cdl.delete(4);
		cdl.deleteLast();
		cdl.display();
		
	}

}
