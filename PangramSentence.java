package abc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PangramSentence {

	public static void main(String[] args) {
		
		PangramSentence ps = new PangramSentence();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean b = ps.checkIfPangram(str);
		System.out.println(b);
	}
	
	public boolean checkIfPangram(String sentence){
		
		String [] s = sentence.split("");
		int num = 0;
		for(int i=0; i<s.length; i++) {
			
			num = num + s[i].hashCode();
			
		}
		
//		Map m = new HashMap();
//		String [] str = sentence.split("");
//		String temp = "";
//		for (int i=0; i<str.length; i++) {
//			if(str[i].equals(" ")) {
//				
//			}
//			else{
//				m.put(str[i], str[i]);
//				temp = temp + str[i];
//			}
//		}
//		String res = "";
//		for(Object s : m.values()) {
//			
//			res = res + (String)s;
//		}
//		
//		System.out.println(res);
//		return true;
    }
}
