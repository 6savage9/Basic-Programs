package abc;

import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		
		 	Scanner sc=new Scanner (System.in);
		 	System.out.println("Enter Array Size");
	        int size=sc.nextInt();
	        int []arr=new int[size];
	        
	        System.out.println("Enter Array Elements");
	        for(int i=0; i<size; i++){
	            arr[i]=sc.nextInt();
	        }
	        
	        System.out.println("Enter target");
	        int target=sc.nextInt();

	        int []res=twoSum(arr, target);
	        System.out.println(res[0]+" "+res[1]);
	}
	
	public static int[] twoSum(int [] nums, int target) {
		
		int []res=new int[2];
		
		
		for(int i=0; i<nums.length; i++) {
			
			int sum=0;
			sum=sum+nums[i];
			
			if(i<nums.length-1) {
				
				for(int j=i+1; j<nums.length; j++) {
					sum=sum+nums[j];
					if(sum==target) {
						res[0]=i;
						res[1]=j;
						return res;
					}
					sum=nums[i];
				}
			}
		}
//		res[0]=0;
//		res[1]=0;
		return res;
	}
}
