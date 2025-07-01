package dsa;

public class HashTable {
	
	class Node{
		int val;
		Node next;
		Node(int val) {
			this.val=val;
		}
	}
	
	Node[] arr=new Node[10];
	int size;
	
	public int hashFunction(int key) {
		return key%arr.length;
	}
	
	public boolean insert(int key) {
		
		//this is how we handle collision, this technique is called as LINEAR PROBING..
		if(arr[hashFunction(key)]!=null) {
			Node temp=arr[hashFunction(key)];
			//here we're traversing to the last node in the hashcode.
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new Node(key);		//in the last node next variable we're storing the reference of the new Node that we created.
		}
		else
			arr[hashFunction(key)]=new Node(key);
		
		
		size++;
		return true;
	}
	
	public boolean contains(int key) {
		
		//here we're calling hashfuction with the key to check what index in array of nodes is present
		//then we want node.val to compare it with the key...this below line is equivalent to that
		Node temp=arr[hashFunction(key)];
		while(temp!=null) {		//here condition shouldn't be temp.next, it skips the lastnode in the index.
			if(key==temp.val) {
				return true;
			}
			else {
				temp=temp.next;
			}
		}
		return false;
//		return key==arr[hashFunction(key)].val;
	}
	
	public boolean delete(int key) {
		if(contains(key)) {
			int index=hashFunction(key);
			Node temp=arr[index];
			
			//here i'm handling the case if the key is present in the first node.
			if(temp.val==key) {
				
				temp=temp.next;
				arr[index]=temp;		//here we should update the arr index i.e hashcode if it's first node
			}
			
			
			//if it's not first node of the hascode, then we should traverse through the nodes in the hashcode i.e index....
			else {
				Node prev=null;
				while(temp.val!=key) {
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
		for(Node n:arr) {
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
		HashTable ht=new HashTable();
		ht.insert(10);
		ht.insert(20);
		ht.insert(40);
		ht.insert(11);
		ht.display();
		System.out.println(ht.contains(40));
		System.out.println(ht.size);
		
	}
	

}
