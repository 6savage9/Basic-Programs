package abc;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		
		SquareRoot rt = new SquareRoot();
		
		int root = rt.mySqrt(num);
		System.out.println(root);
	}
	
	public int mySqrt(int x) {
		
		double d= 0;
		
		while(d<x) {
			
			if(d*d==x) {
				int numb=(int)d;
				return numb;
			}
		}
		
		return (int)d;
    }
}
