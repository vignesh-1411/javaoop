package dsa;


//in this class which uses generics instead of specific datatype..
//i've modified some methods which uses equals() method instead of == operator. because we use == mostly to compare with primitve,
//by using equals() method we can compare the states of non primitive. that's why i've changed.

//also i'm not allowing duplicates into my hashtable and handelled collision if one key have same hashcode. for that i'm using buckets(Linkedlist)....

public class HTgenerics<T> {
	
	class Node<T>{
		T val;
		Node next;
		Node(T val) {
			this.val=val;
		}
	}
	
	Node<T>[] arr=new Node[10];
	int size=-1;
	
	public int hashFunction(T key) {
		return key.hashCode()%arr.length;
	}
	
	public boolean insert(T key) {
		
		//this is how we handle collision, this technique is called as LINEAR PROBING..
		if(arr[hashFunction(key)]!=null) {
			Node<T> temp=arr[hashFunction(key)];
			//here we're traversing to the last node in the hashcode.
			
			
			//here's the change in method, we should use equals method when working with generics.
			
			while(true) {
				if(temp.val.equals(key))	return false;			//we're not allowing duplicate values
				if(temp.next==null)	break;
				temp=temp.next;
			}
			temp.next=new Node<>(key);		//in the last node next variable we're storing the reference of the new Node that we created.
			
			
			
		}
		else
			arr[hashFunction(key)]=new Node<>(key);
		
		
		size++;
		return true;
	}
	
	public boolean contains(T key) {
		
		//here we're calling hashfuction with the key to check what index in array of nodes is present
		//then we want node.val to compare it with the key...this below line is equivalent to that
		Node<T> temp=arr[hashFunction(key)];
		while(temp!=null) {		//here condition shouldn't be temp.next, it skips the lastnode in the index.
			if(temp.val.equals(key)) {
				return true;
			}
			else {
				temp=temp.next;
			}
		}
		return false;
//		return key==arr[hashFunction(key)].val;
	}
	
	public boolean delete(T key) {
		if(contains(key)) {
			int index=hashFunction(key);
			Node<T> temp=arr[index];
			
			//here i'm handling the case if the key is present in the first node.
			if(temp.val.equals(key)) {
				
				temp=temp.next;
				arr[index]=temp;		//here we should update the arr index i.e hashcode if it's first node
			}
			
			
			//if it's not first node of the hascode, then we should traverse through the nodes in the hashcode i.e index....
			else {
				Node<T> prev=null;
				while(!(temp.val.equals(key))){
					prev=temp;
					temp=temp.next;
				}
				//here i'm tracking the prev node of the temp node(where key is present) 
				//then i'm assigning the temp.next to the prev.next
				prev.next=temp.next;
			}
			size--;
			return true;
			
		}
		else {
			return false;
		}
	}
	
	public void display() {
		System.out.println("the elements present in the hashtable are: ");
		for(Node<T> n:arr) {
			if(n!=null) {
				while(n!=null) {
					System.out.print(n.val+" ");
					n=n.next;
				}
				
//				System.out.print(n.val+" ");
			}
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		HTgenerics ht=new HTgenerics<>();
		ht.insert(10);
		ht.insert("hello");
		ht.insert(true);
		ht.insert(90);
		ht.insert(10);
		ht.insert('j');
		ht.display();
		System.out.println(ht.contains(90));
		System.out.println("the size is: "+ht.size);
		
	}
}
