package contacts;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class phone {
	
	Scanner sc = new Scanner(System.in);
	
	List l=new LinkedList();

	public void createAccount(){
		
		
		System.out.println("Enter Name: ");
		String name=sc.next();
		
		for(int i=0; i<l.size(); i++){
			
			details m=(details)l.get(i);
			
			if(name.equals(m.name)) {
				System.out.println("Cannot Store Duplicate");
				return;
			}
			
		}
		
		System.out.println("Enter how many contact number you want to store: ");
		int size=sc.nextInt();
		
		details d=new details(name, size);
		d.store();
		l.add(d);
		
		
		System.out.println("Contact Added!!!");
		
	}
	
	public void display() {
		
		for(int i=0; i<l.size(); i++) {
			
			System.out.println(l.get(i));
			
		}
		
	}
	
	public void removeContact() {
		
		System.out.println("Enter Contact name to be removed");
		String name1=sc.next();
		
		for(int i=0; i<l.size(); i++){
			
			details d=(details)l.get(i);
			
			if(name1.equals(d.name)) {
				l.remove(i);
				System.out.println("Contact Deleted!!");
				return;
			}
			
			
		}
		System.out.println("Name not found");
	}
	
	public void repeatContact() {
		
		for(int i=0; i<l.size(); i++){
			
			details d=(details)l.get(i);
			
			
			
			
		}
	}
	
	public void search() {
		
		System.out.println("Enter Contact name to be Searched: ");
		String name1=sc.next();
		
		for(int i=0; i<l.size(); i++){
			
			
			details m=(details)l.get(i);
			
			if(name1.equals(m.name)) {
				System.out.println(l.get(i));
				
				return;
			}
			
			
		}
		System.out.println("Name not found");
	}
}
