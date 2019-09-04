package assingment_2;

import java.util.Scanner;

public class prius {

	public static void main(String[] args) {
		
		float fDistance;
		double fCost;
		double fTotal;
		int people;
		float ticket;
		double profit;
		float mpg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter the flight distance: ");
		fDistance = sc.nextFloat();
		System.out.print("Enter the current cost of jet fuel: $");
		fCost = sc.nextDouble();
		
		fTotal = fDistance * fCost;
		System.out.printf("The flight will cost $%1.1f in jet fuel.", fTotal);
		System.out.println();
		
		System.out.print("Enter the number of passengers: ");
		people = sc.nextInt();
		
		System.out.print("Enter the average cost of a ticket: $");
		ticket = sc.nextFloat();
		
		profit = (people * ticket) - fTotal;
		
		System.out.printf("You will make a profit of %1.1f", profit);
		System.out.println();
		
		mpg = (fDistance * 5) / people;
		
		System.out.printf("You averaged %1.1f miles per person per gallon!", mpg);
		System.out.println();
		System.out.println();
		
	}

}
