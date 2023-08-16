package abc;

import java.util.Scanner;

public class RemoveElement {

	public int removeElement(int []nums, int val) {
		
		int []arr = new int[nums.length];
		int count = 0; 
		int j = 0;
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i] != val) {
				
				arr[j] = nums[i];
				j++;
			}
			else {
				count++;
			}

		}
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			System.err.print(arr[i]+" ");
		}
		
		return nums.length-count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int size =sc.nextInt();
		int []nums = new int[size];
		
		for(int i=0; i<nums.length; i++) {
			
			System.err.println("Enter element: ");
			int number = sc.nextInt();
			nums[i]=number;
		}
		
		int val = sc.nextInt();
		
		RemoveElement re = new RemoveElement();
		int res = re.removeElement(nums, val);
		System.out.println("Result "+res);
	}
}
