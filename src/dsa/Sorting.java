package dsa;

import java.util.Arrays;

public class Sorting {
	
	public static int[] selectionSort(int[] nums) {
		
		for(int i=0;i<nums.length;i++) {
			int min=i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[min]>nums[j]) {
					min=j;
				}
				int temp=nums[i];
				nums[i]=nums[min];
				nums[min]=temp;
			}
		}
		return nums;
	}
	
	public static void insertionsort(int[] nums) {
		for(int i=1;i<nums.length;i++) {
			int temp=nums[i];
			int j=i-1;
			while(j>=0) {
				if(nums[j]>temp)
					nums[j+1]=nums[j];
				else
					break;
				j--;
			}
			nums[j+1]=temp;
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static void main(String[] args) {
		int[] nums= {8,44,3,84,30,1,4,5};
		System.out.println(Arrays.toString(selectionSort(nums)));
		
	}

}
