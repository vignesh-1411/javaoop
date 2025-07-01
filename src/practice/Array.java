package practice;

import java.util.Arrays;

public class Array {
	//time and space complexity of this array creation is
	//		O(1)
//	since the array size is not increasing or decreasing SC is also O(1);
	
	int[] arr=new int[10];
	int index=-1;
	public boolean isEmpty() {
//		TC=O(1)..SC=O(1)
		if(index==-1)	return true;
		return false;
	}
	public boolean isFull() {
//		TC=O(1)..SC=O(1)
		if(index==arr.length-1)	return true;
		return false;
	}
	
	public boolean append(int num) {
		
//		TC=O(1)..SC=O(1)
		if(isFull()) {
			return false;
		}
		index++;
		arr[index]=num;
		return true;
	}
	
	public boolean prepend(int num) {
//		overall TC is O(n) and SC is O(1)
		
//		TC=O(1)+O(1)+O(n)=	2 O(1)+O(n) which is O(n) after removing the constants
		//this method will always prepend the elements at first..
		if(isFull()) {
			return false;	//TC is O(1)
		}
		for(int i=arr.length-1;i>0;i--) {		//TC is O(n)
			arr[i]=arr[i-1];
		}
		arr[0]=num;		//TC is O(1)
		index++;
		return true;
	}
	public boolean insert(int in,int num) {
//		overall TC is O(n) and Sc is O(1)
//		TC = O(1)+O(1)+O(n)+O(n)=2 O(1)+ 2 O(n)=O(n) after dropping the constants
		if(isFull())	return false;	//TC is O(1)
		if(in>index)	append(num);	//TC is O(1)
		if(in==0)	prepend(num);		//TC is O(n)
		else {
//			TC is O(n)
//			System.out.println(index);
			for(int i=index;i>=in;i--) {
				arr[i+1]=arr[i];
			}
			index++;	//TC is O(1)
			arr[in]=num;
		}
		return true;
	}
	public void deletefirst() {
		
//		TC=O(n)..SC=O(1)
		for(int i=0;i<=index;i++) {
			arr[i]=arr[i+1];
		}
		index--;
		System.out.println("current index="+index);
		System.out.println("deleted the element at first");
	}
	public void deletelast() {
//		TC=O(1)..SC=O(1)
		arr[index]=0;
		index--;
		System.out.println("current index="+index);
		System.out.println("deleted the element at last");
	}
	public void print() {
//		TC is O(n) and SC is O(n)
		if(isEmpty()) {		//TC is O(1)
			System.out.println("{}");
		}
		String s="{"+arr[0];
		for(int i=1;i<=index;i++) {
			s+=","+arr[i];		
//			here the TC is O(n) and  SC is also  O(n) since its a string and every time we manipulate it 
//			one new object will be created so the SC of this will be O(n)..
		}
		System.out.println(s+"}");
		
	}
	
	public void deleteAtPos(int in) {
//		overall TC is O(n) and SC is O(1)
		
		if(in==0)	deletefirst();		//TC is O(n)
		if(in==arr.length-1)	deletelast();	//TC is O(n)
		else {
			for(int i=in+1;i<=in;i++) {		//TC is O(n)
				arr[i-1]=arr[i];
			}
			index--;
		}
		System.out.println("the element is deleted at index:"+in);
		
	}
	
	public int getVal(int ind) {
		return ind<0 || ind>index? -1:arr[ind];
	}
	public static void main(String[] args) {
		Array a1=new Array();
		System.out.println(a1.isEmpty());
		System.out.println(a1.isFull());
		System.out.println(a1.append(8));
		System.out.println(a1.append(10));
		System.out.println(a1.isEmpty());
		System.out.println(Arrays.toString(a1.arr));
		System.out.println(a1.prepend(2));
		System.out.println(Arrays.toString(a1.arr));
		System.out.println(a1.prepend(1));
		System.out.println(Arrays.toString(a1.arr));
		System.out.println(a1.insert(1, 7));
		System.out.println(Arrays.toString(a1.arr));
		a1.deletefirst();
		System.out.println(Arrays.toString(a1.arr));
		a1.deletelast();
		System.out.println(Arrays.toString(a1.arr));
		a1.print();
		
		
	}

}
