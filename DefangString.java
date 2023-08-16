package abc;

import java.util.Scanner;

public class DefangString {

	public static void main(String[] args) {
		
		DefangString ds = new DefangString();
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		String res = ds.defangIPaddr(str);
		System.out.println(res);
		
	}
	
	public String defangIPaddr(String address) {
        
		String []st = address.split("");
		String strr = "";
		
		for(int i = 0; i<st.length; i++) {
			
			String temp = "";
			if(st[i].equals(".")) {
				temp = "["+st[i]+"]";
			}
			else
				temp = st[i];
			
			strr=strr+temp;
		}
		
		return strr;
    }
}
