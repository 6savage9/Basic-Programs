package encap;

import java.util.Scanner;

public class booking {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Movie Id:");
		int movieId=sc.nextInt();
		
		if(movieId==111 || movieId==112 || movieId==113) {
			System.out.println("Enter number of tickets: ");
			int noOfSeats=sc.nextInt();
			
			tickets t=new tickets(movieId, noOfSeats);
			
			switch(movieId) {
			
			case 111:{
				double ticketCost=noOfSeats*7;
				System.out.println("Ticket Cost= $"+ticketCost);
				
				double tax=(ticketCost*0.02);
				System.out.println("Tax= $"+tax);
				
				int net=(int) (ticketCost+tax);
				System.out.println("Total Cost= $"+net);
				break;
						
			}
			
			case 112:{
				double ticketCost=noOfSeats*8;
				System.out.println("Ticket Cost= $"+ticketCost);
				
				double tax=(ticketCost*0.02);
				System.out.println("Tax= $"+tax);
				
				int net=(int) (ticketCost+tax);
				System.out.println("Total Cost= $"+net);
				break;
						
			}
			
			
			case 113:{
				double ticketCost=(noOfSeats*8.5);
				System.out.println("Ticket Cost= $"+ticketCost);
				
				double tax=(ticketCost*0.02);
				System.out.println("Tax= $"+tax);
				
				int net=(int) (ticketCost+tax);
				System.out.println("Total Cost= $"+net);
				break;
						
			}
				
			}
		}
			
		else {
			System.out.println("Invalid Movie Id");
			return;
		}

		
		
		
		
	}
}
