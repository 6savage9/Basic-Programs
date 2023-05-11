package abc;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		boolean b=isPalindrome(num);
		System.out.println(b);
	}

	public static boolean isPalindrome(int num) {
		
		int x=num;
		int n=0;
		
		while(x>0) {
			int rem=x%10;
			n=(n*10)+rem;
			x=x/10;
		}
		
		if(n==num)
			return true;
		else
			return false;
	  
	}
}
