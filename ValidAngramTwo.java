package abc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ValidAngramTwo {

	public boolean isAnagram(String s, String t) {
	        
		if(s.length() == t.length()) {
			
			String []s1 = s.split("");
			String []s2 = t.split("");
			
			Map<Character, Integer>m1 = new HashMap<Character, Integer>();
			Map<Character, Integer>m2 = new HashMap<Character, Integer>();

			for(int i=0; i<s.length(); i++) {
				
				if(m1.containsKey(s1[i])) {
					m1.put(s1[i].charAt(0), m1.get(s1[i])+1);
				}
				else
					m1.put(s1[i].charAt(0), 1);
				
				if(m2.containsKey(s2[i])) {
					m2.put(s2[i].charAt(0), m2.get(s2[i])+1);
				}
				else
					m2.put(s2[i].charAt(0), 1);
				
			}
			
			for(char ch : m1.keySet()) {
				
				if(!(m1.get(ch).equals(m2.get(ch))))
					return false;
			}

		}
		
		return true;
	}
	 
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		ValidAngramTwo v =new ValidAngramTwo();
		boolean b = v.isAnagram(s, t);
		
		System.out.println(b);
		
	}
}
