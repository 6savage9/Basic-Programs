package contacts;

import java.util.Scanner;

public class details {
	
	Scanner sc=new Scanner(System.in);
	
	String name;
	int size;
	
	
	public details(String name, int size) {
		super();
		this.name = name;
		this.size = size;
		
	}
	
	
	
	public void store() {
		
		long []cno=new long[size];
		
		System.out.println("1. Store Number    2. Display Number");
		int input=sc.nextInt();
		
		switch(input) {
		
		case 1:{
			
			for(int i=0; i<size; i++) {
				
				System.out.println("Enter Contact Number: ");
				cno[i]=sc.nextLong();
				
			}
		}
		
		case 2:{
			
			for(int i=0; i<size; i++) {
				
				System.out.println(cno[i]);
				
			}
		}
		
		}
		
	}
	
	
	public String toString() {
	
		return name;
	}
	
	
	
}
