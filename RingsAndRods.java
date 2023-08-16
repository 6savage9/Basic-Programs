package abc;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RingsAndRods {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RingsAndRods rr = new RingsAndRods();
		System.out.println("Enter String: ");
		String str = sc.next();
		int res = rr.countPoints(str);
		System.out.println(res);
		
	}
	
	public int countPoints(String rings) {
		
		String []str = rings.split("");
		Map m = new HashMap();
		List green = new LinkedList();
		List red = new LinkedList();
		List blue = new LinkedList();
		
		int count = 0;
		
		for(int i=0; i<str.length; i++) {
			
			if(str[i].equals("R")) {
				
				red.add(str[i+1]);
				i++;
			}
			else if(str[i].equals("G")){
				green.add(str[i+1]);
				i++;
			}
			else{
				blue.add(str[i+1]);
				i++;
			}
		}
		
		for(int i=0; i<green.size(); i++) {
			
			String x = (String) green.get(i);
			
			for(int j=0; j<red.size(); j++) {
				
				String y = (String) red.get(j);
				if(x.equals(y)) {
					
						for(int k=0; k<blue.size(); k++) {
							
							String z = (String) blue.get(k);
							if(x.equals(z) && y.equals(z)) {
								
								count++;
								break;
							}
						}
				}
				break;
			}
		}
		
		return count;
	}
}
