package abc;

import java.util.Scanner;

public class MostWordsInSentence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		String [] str = new String[size];
		
		for(int i=0; i<str.length; i++) {
			
			System.out.println("Enter String: ");
			String s = sc.nextLine();
			str[i] = s;
		}
		
		MostWordsInSentence ms = new MostWordsInSentence();
		int res = ms.mostWordsFound(str);
		System.out.println(res);
	}
	
	public int mostWordsFound(String[] sentences) {
        
		int max = 0;
		for(int i=0; i<sentences.length; i++) {
			String []st = sentences[i].split(" ");
			if(st.length>max)
				max = st.length;
		}
		
		return max;
    }
}
