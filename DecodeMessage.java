package abc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DecodeMessage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key: ");
		String key = sc.nextLine();
		System.out.println("Enter Message: ");
		String message = sc.nextLine();
		
		DecodeMessage dm = new DecodeMessage();
		String res = dm.decodeMessage(key, message);
		System.out.println(res);
	}
	
	public String decodeMessage(String key, String message) {
	       
		Map<String, Character> m = new HashMap<String, Character>();
		char ch = 'a';
		
		String []str = key.split("");
		
		for(int i=0; i<str.length; i++) {
			
			if(str[i].equals(" ")){
				
			}
			else {
				m.put(str[i], ch++);
			}
		}
		
		String []strr = message.split("");
		String res = "";
		
		for(int i=0; i<strr.length; i++) {
			
			if(strr[i].equals(" ")) {
				res = res+" ";
			}
			else {
				Character s = m.get(strr[i]);
				res = res+s;
			}
			
			
		}
		
		return res;
		
	}
}
