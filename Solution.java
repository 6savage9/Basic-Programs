package abc;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		
		int []nums=new int[size];
		System.out.println("Enter Array Elements: ");
		for(int i=0; i<nums.length; i++) {
			
			nums[i]=sc.nextInt();
		}
		int res=singleNumber(nums);
		System.out.println(res);
	}
	
	public static int singleNumber(int[] nums) {
		
		for(int i=0; i<nums.length; i++) {
			
			int number=nums[i];
			int count=0;
			
			for(int j=0; j<nums.length; j++) {
				
				if(j!=i) {
					
					if(nums[i]==nums[j]) {
						count++;
					}
					
				}
				
			}
			if(count==0) {
				return nums[i];
			}
		}
        return 0;
	}
}
