package practice;

import java.util.Arrays;


//copied every method from Array class but there are changes done inside evert method also for some i might forget to change the TC and SC..
//so don't bother


public class DynamicArrays {
	//time and space complexity of this array creation is
	//		O(1)
//	since the array size is not increasing or decreasing SC is also O(1);
	
	int[] arr=new int[5];
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
	
	public int size() {
//		size represents how many elements are there're in the array.
		
		return index+1;
	}
	
	public int capacity() {
		
//		capacity represents how many more elements it can store
		
		return arr.length-1;
	}
	
	public boolean append(int num) {
		
//		TC=O(n)..SC=O(1)
		if(isFull()) {
			int[] nArr=new int[arr.length*2];
			for(int i=0;i<arr.length;i++) {
				nArr[i]=arr[i];
			}
			arr=nArr;
		}
		index++;
		arr[index]=num;
		return true;
	}
	
	public boolean prepend(int num) {
		
//		updated comments
		
//		overall TC is O(n) and SC is O(n)
		
//		TC=O(n)+O(n)+O(1)=	2 O(n)+O(1) which is O(n) after removing the constants
		//this method will always prepend the elements at first..
		if(isFull()) {
//			here new array is getting created so the space complexity will be O(n)
			
			int[] nArr=new int[arr.length*2];
			for(int i=0;i<arr.length;i++) {			//TC is also O(n)
				nArr[i]=arr[i];
			}
			arr=nArr;
		}
		for(int i=arr.length-1;i>0;i--) {		//TC is O(n)
			arr[i]=arr[i-1];
		}
		arr[0]=num;		//TC is O(1)
		index++;
		return true;
	}
	public boolean insert(int in,int num) {
//		overall TC is O(n) and SC is O(n)
//		TC = O(1)+O(1)+O(n)+O(n)=2 O(1)+ 2 O(n)=O(n) after dropping the constants
		if(isFull()) {
			int[] nArr=new int[arr.length*2];
			for(int i=0;i<arr.length;i++) {
				nArr[i]=arr[i];
			}
			arr=nArr;
		}
		if(in>index)	append(num);	//TC is O(n)
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
		for(int i=0;i<index;i++) {
			arr[i]=arr[i+1];
		}
		index--;
		
		if(size()<=arr.length/2) {
			int[] nArr=new int[arr.length/2];
			for(int i=0;i<nArr.length;i++) {
				nArr[i]=arr[i];
			}
			arr=nArr;
		}
		System.out.println("current index="+index);
		System.out.println("deleted the element at first");
	}
	public void deletelast() {
//		TC=O(1)..SC=O(1)
		arr[index]=0;
		index--;
		
		if(size()<=arr.length/2) {
			int[] nArr=new int[arr.length/2];
			for(int i=0;i<nArr.length;i++) {
				nArr[i]=arr[i];
			}
			arr=nArr;
		}
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
		if(size()<=arr.length/2) {
			int[] nArr=new int[arr.length/2];
			for(int i=0;i<nArr.length;i++) {
				nArr[i]=arr[i];
			}
			arr=nArr;
		}
		System.out.println("the element is deleted at index:"+in);
		
	}
	
	public int getVal(int ind) {
		return ind<0 || ind>index? -1:arr[ind];
	}
	public static void main(String[] args) {
		DynamicArrays a1=new DynamicArrays();
		System.out.println(a1.isEmpty());
		System.out.println(a1.isFull());
		System.out.println(a1.append(8));
		System.out.println(a1.append(10));
		System.out.println(a1.isEmpty());
		a1.print();
//		System.out.println(Arrays.toString(a1.arr));
		System.out.println(a1.prepend(2));
		a1.print();
//		System.out.println(Arrays.toString(a1.arr));
		System.out.println(a1.prepend(1));
		a1.print();
//		System.out.println(Arrays.toString(a1.arr));
		System.out.println(a1.insert(1, 7));
		a1.print();
//		System.out.println(Arrays.toString(a1.arr));
		a1.deletefirst();
		a1.print();
//		System.out.println(Arrays.toString(a1.arr));
		a1.deletelast();
		a1.print();
//		System.out.println(Arrays.toString(a1.arr));
		
		
		
	}

}
