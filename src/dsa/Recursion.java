package dsa;

public class Recursion {
	
	public static int exponent(int no,int pow) {
		if(pow==0)
			return 1;
		return no*exponent(no,pow-1);
	}
	
	public static int multiply(int a,int b) {
		if(b==0)	return 0;
		return a+multiply(a,b-1);
	}
	
	public static String reverseString(String s) {
		if(s.length()==1)	return s;
		return reverseString(s.substring(1))+s.charAt(0);
	}
	
	public static boolean palindrome(String s) {
		if(s.length()<=1)	return true;
		if(s.charAt(0)==s.charAt(s.length()-1)) {
			return palindrome(s.substring(1,s.length()-1));
		}
		else	return false;
		
	}
	
	public static int binarySearch(int[] nums,int key, int low, int high) {
		int mid=low+(high-low)/2;
		if(nums[mid]==key)	return mid; 
		if(key<nums[mid]) {
			return binarySearch(nums,key,low,mid);
		}
		
		return binarySearch(nums,key,mid,high);
		
	}
	public static void main(String[] args) {
//		System.out.println(exponent(2,4));
//		System.out.println(multiply(2,3));
//		System.out.println(reverseString("hello"));
//		System.out.println(palindrome("liril"));
		
		int[] nums= {1,2,3,4,5,6,7};
		System.out.println(binarySearch(nums,6,0,nums.length-1));
	}

}
