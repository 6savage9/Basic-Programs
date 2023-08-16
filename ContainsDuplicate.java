package abc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {
		
		Map <Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for(int i : nums) {
			
			m.put(i, i);
		}
		
		if(m.size()==nums.length) 
 	        return false;
		else
			return true;
					
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int [] arr = new int[size];

		System.out.println("Enter Array Elements");
		
		for(int i=0; i<size; i++) {
		
			arr[i]=sc.nextInt();
		}
		
		ContainsDuplicate cd =new ContainsDuplicate();
		boolean b = cd.containsDuplicate(arr);
		
		System.out.println(b);
		
	}
}
