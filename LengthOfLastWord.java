package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LengthOfLastWord {
	
	public static int lengthOfLastWord(String s) {
	
		return s.length();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[]ch=str.toCharArray();
		
		List l = new ArrayList();
		String word="";
		
		for(char c : ch) {
			
			if(c==' ') {
				l.add(word);
				word="";
				
			}
			else {
				word = word + c;
			}
		}
		l.add(word);
		
		//System.out.println(l);
		
		for(int i=0; i<l.size(); i++) {
			
			String st = (String)l.get(i);
			if(st.equals("")) {
				l.remove("");
			}
		}
		
		System.out.println(l);
		
		for(int i=l.size()-1; i>=0; i--) {
			
			String srt = (String)l.get(i);
			if(!(srt.equals(""))) {

				int length=lengthOfLastWord(srt);
				System.out.println(srt+ " " +srt.length());
				return;
			}
		}
		

	}
}
