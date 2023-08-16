package abc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RingsRods {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RingsRods rr = new RingsRods();
		System.out.println("Enter String: ");
		String str = sc.next();
		int res = rr.countPoints(str);
		System.out.println(res);
		
	}
	
	public int countPoints(String rings) {
		
		Map m = new HashMap();
		
		for(int i=0; i<rings.length(); i=i+2) {
			
			if(!m.containsKey(rings.charAt(i+1))) {
				m.put(rings.charAt(i+1), Character.toString(rings.charAt(i)));
			}
			else {
				String str = (String) m.get(rings.charAt(i+1));
				str = str + rings.charAt(i);
				m.replace(rings.charAt(i+1), str);
			}
		}
		
		int count =0;
		
		for(Object o : m.entrySet()) {
			
			String s = ""+o;
			if(s.contains("R") && s.contains("G") && s.contains("B")) {
				count++;
			}
		}
		
		return count;
	}
}
