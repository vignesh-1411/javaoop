package sample;

import java.util.Arrays;

public class Demo {
	
	
	
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		int[] res = display(a);
		System.out.println(Arrays.toString(res));
		
		
	}
	
	
	
      public static int[] display(int[] a) {
    	  
       // int[] ress=new int[2];
        int sum=0,prod=1;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				sum+=a[i];
			}
			else
				prod*=a[i];
		}
		//ress[0]=sum;
		//ress[1]=prod;
		
		return new int[] {sum,prod};
		
      }
		
	

}
