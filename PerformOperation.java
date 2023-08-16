package abc;

import java.util.Scanner;

public class PerformOperation {

	public static void main(String[] args) {
		
		PerformOperation pb =new PerformOperation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of string to enter: ");
		int input =sc.nextInt();
		System.out.println("Enter String: ");
		String []str = new String[input]; 
		
		for(int i=0; i<str.length; i++) {
			str[i] =sc.next();
		}
		
		int res = pb.finalValueAfterOperations(str);
		System.out.println(res);
	}
	
	public int finalValueAfterOperations(String[] operations) {
    
		int num = 0;
		for(int i=0; i<operations.length; i++) {
			
			String []s = operations[i].split("");
			
			if(s[0].equals("-") && s[2].equals("X")) {
				 
				num = num-1;
				
			}
			else if(s[0].equals("+") && s[2].equals("X")) {
				num = num+1;
			}
			else if(s[1].equals("-") && s[0].equals("X")) {
				num = num-1;
			}
			else if(s[1].equals("+") && s[0].equals("X")){
				num = num+1;
			}	
			
		}
		return num;
    }
}
