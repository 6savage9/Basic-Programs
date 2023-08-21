package abc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ValidAngram {

	public boolean isAnagram(String s, String t) {
	        
		if(s.length() == t.length()) {
			
			String [] str1 = s.split("");
			String [] str2 = t.split("");
			
			Map m1 = new TreeMap();
			Map m2 = new TreeMap();
			
			int hash1 = 0;
			int hash2 = 0;
			
			for(int i=0; i<str1.length; i++) {
				
				m1.put(str1[i].hashCode(), str1[i]);
				m2.put(str2[i].hashCode(), str2[i]);
				
				int one = str1[i].hashCode();
				int two = str2[i].hashCode();
				
				hash1 = hash1 + one;
				hash2 = hash2 + two;

			}
			
			//System.out.println(m1);
			//System.out.println(m2);
			
			Set s1 = m1.entrySet();
			ArrayList al1 = new ArrayList(s1);
			
			//System.out.println(al1);
			
			Set s2 = m2.entrySet();
			ArrayList al2 = new ArrayList(s2);
			
		//	System.out.println(al2);
			
			for(int i=0; i<al1.size(); i++) {
				
				if(!(al1.get(i).equals(al2.get(i)))) {
				//	System.out.println(al1.get(i)+"  "+al2.get(i));
					
					return false;
				}
			}
			
			return true;
	
		}
		else {
			return false;
		}
	}
	 
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		ValidAngram v =new ValidAngram();
		boolean b = v.isAnagram(s, t);
		
		System.out.println(b);
		
	}
}
