package abc;

import java.util.Scanner;

public class ReversePrefix {

	public static void main(String[] args) {
		
		ReversePrefix r = new ReversePrefix();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		System.out.println("Enter Character: ");
		char ch = sc.next().charAt(0);
		String res = r.reversePrefix(str, ch);
		System.out.println(res);
	}
	
	public String reversePrefix(String word, char ch) {
		
		String s = "";
		int x = 0;
		for(int i=0; i<word.length(); i++) {
			
			char c = word.charAt(i);
			if(c == ch) {
				x=i;
				break;
			}
		}
		
		for(int i=0; i<=x; i++) {
			
			s=s+word.charAt(i);
		}
		
		String st = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			st = st+s.charAt(i);
		}
		
		for(int i=x+1; i<word.length(); i++) {
			
			st=st+word.charAt(i);
		}
		
		return st;
		
	}
}
