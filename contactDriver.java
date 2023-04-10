package contacts;

import java.util.Scanner;

public class contactDriver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		phone p=new phone();
		
		for(;;) {
			
			System.out.println("1. Add Contact    2. Display Contact   3. Remove Contact    4.Search Contact    5. Exit");
			int a=sc.nextInt();
			
			switch(a) {
			
			case 1:{
				p.createAccount();
				break;
			}
			
			case 2:{
				
				p.display();
				break;
			}
			
			case 3:{
				
				p.removeContact();
				break;
				
			}
			
			case 4:{
				
				p.search();
				break;
				
			}
			
			case 5:{
				System.out.println("Application Closed!!");
				System.exit(0);
			}
			
			}
		}
	}
}
