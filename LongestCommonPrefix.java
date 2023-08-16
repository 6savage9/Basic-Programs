package abc;

import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size = sc.nextInt();
		String []str = new String[size];
		System.out.println("Enter Array elements: ");
		
		for(int i=0; i<str.length; i++) {
			
			str[i]=sc.next();
		}
		
		
	}

	public String longestCommonPrefix(String[] strs) {
        
    }
	
}
