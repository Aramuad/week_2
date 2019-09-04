/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Assingment #:	2			*/

package assingment_2;

import java.util.Scanner;

public class modulus { 
	
	public static void main(String[] args) {
		
		int number;
		int sum;
		int mod;
		int holder;
		
		System.out.println();
		System.out.print("Enter a number between 1 and 1000 to find the sum of its digits: ");
		
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		holder = number;
		sum = 0;
		
			if (number > 0 && number <= 1000) {
				
				while (number > 0) {		// I got help from
											// Stack Exchange
					mod = number % 10;		// 		with
					sum = sum + mod;		//	 these four
					number = number / 10;	// 	lines of logic
			
				}
				
				System.out.println();
				System.out.println("Entered number: " + holder);
				System.out.println("Sum of digits: " + sum);
				System.out.println();
				
			} else {
				
				System.out.println();
				System.out.print("Don't break the rules!");
				System.out.println();
				modulus.main(args);
			}
		
	}

}