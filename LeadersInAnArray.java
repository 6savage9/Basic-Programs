package abc;

import java.util.Scanner;

public class LeadersInAnArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter Array Elements");
		
		for(int i=0 ; i<size; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<size; i++) {
			
			if(i<size-1) {
				
				int countNum=0;
				int greater=0;
				
				for(int j=i+1; j<size; j++) {
				
					countNum++;
					if(arr[i]>arr[j]) {
						
						greater++;
					}
					
					
				}
				
				if(countNum==greater) {
					System.out.print(arr[i]+" ");
				}
			}
			
		}
		System.out.println(arr[size-1]);
	}
}
