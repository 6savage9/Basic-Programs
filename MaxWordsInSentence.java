package abc;

import java.util.Scanner;

public class MaxWordsInSentence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size = sc.nextInt();
		String [] str = new String[size];
		
		for(int i=0; i<str.length; i++) {
			System.out.println("Enter String: ");
			String s = sc.nextLine();
			str[i] = s;
		}
		
		MaxWordsInSentence ms = new MaxWordsInSentence();
		int res = ms.mostWordsFound(str);
		System.out.println(res);
	}
	
	public int mostWordsFound(String[] sentences) {
        
		
    }
}
