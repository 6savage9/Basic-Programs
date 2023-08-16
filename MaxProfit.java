package abc;

import java.util.Scanner;

public class MaxProfit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		System.out.println("Enter elements of array: ");
		int [] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i]=sc.nextInt();
			
		}
		
		BestStrockPrice bs = new BestStrockPrice();
		int res = bs.maxProfit(arr);
		System.out.println(res);
	}
	
	public int maxProfit(int [] prices) {
		
		int min = prices[0];
		int max = prices[0];
		
		int minIndex = 0;
		int maxIndex = 0;
		
		for(int i=0; i<prices.length; i++) {
			
			if(prices[i]<min) {
				min = prices[i];
				minIndex = i;
				
			}
		}
		
		if(minIndex == prices.length-1) {
			return 0;
		}
		else {
			
			max = min;
			for(int j=minIndex+1; j<prices.length; j++) {
				
				if(prices[j]>max) {
					max = prices[j];
					maxIndex = j;
				}
			}
		}
		
		int result = maxIndex - minIndex;

		return result;
		
	}
}
