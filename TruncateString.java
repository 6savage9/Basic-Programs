package abc;

import java.util.Scanner;

public class TruncateString {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		int k = sc.nextInt();
		TruncateString ts = new TruncateString();
		String res = ts.truncateSentence(str, k);
		System.out.println(res);
	}
	
	public String truncateSentence(String s, int k) {
        
		String [] st = s.split(" ");
		String res = "";
		for(int i=0; i<k; i++) {
			
			if(i == k-1) {
				res = res + st[i];
			}
			else
				res = res + st[i] + " ";
			
		}
		return res;
    }
}
