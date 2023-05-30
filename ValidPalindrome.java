package abc;

import java.util.Scanner;

public class ValidPalindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);	
		System.out.println("Enter String: ");
		String s=sc.nextLine();
		s=s.toLowerCase();
		
		boolean b=isPalindrome(s);
		System.out.println(b);
		
		
	}
	
	public static boolean isPalindrome(String s) {
        
		
		char[]ch=s.toCharArray();
		String b="";
		
		for(int i=0; i<ch.length; i++) {
			
			if(ch[i]>='a' && ch[i]<='z') {
				b=b+ch[i];
			}
		}
		
		String c="";
		
		for(int i=ch.length-1; i>=0; i--) {
			
			if(ch[i]>='a' && ch[i]<='z') {
				c=c+ch[i];
			}
		}
		
		if(b.equals(c)) {
			return true;
		}
		else
			return false;
    }
}
