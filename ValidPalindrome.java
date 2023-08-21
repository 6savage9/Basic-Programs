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
			
		if(s.isEmpty()) {
			return true;
		}
		
		char [] ch = s.toCharArray();
		String str = "";
		
		for(int i=0; i<ch.length; i++) {
			
			if(ch[i]>='a' && ch[i]<='z') {
				str = str + ch[i];
			}
		}
        
		char [] chStr =str.toCharArray();
		
		int start = 0;
		int end = str.length()-1;
		
		while(start<=end) {
			
			char ch1 = chStr[start];
			char ch2 = chStr[end];
		
			if(ch1!=ch2)
				return false;
			else {
				start++;
				end--;
			}
		
		}
		
		return true;
		
    }
}
