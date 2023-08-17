package abc;

import java.util.Scanner;

public class SearchElementsInArray {

	public int search(int []arr, int x) {
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==x) {
				return i;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
	
		SearchElementsInArray s = new SearchElementsInArray();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n = sc.nextInt();
		System.out.println("Enter Array Elements: ");
		int []arr = new int[n];
		for(int i=0; i<n; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter element to search: ");
		int x = sc.nextInt();
		
		int res = s.search(arr, x);
		
		if(res==0)
			System.err.println("Element Does NOT exist");
		else
			System.out.println(res);
		
	}
}
