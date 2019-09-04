/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Assingment #:	2			*/

package assingment_2;

import java.util.Scanner;

public class ferrari {

	public static void main(String[] args) {
		
		float francs;
		float dollars;
		
		System.out.println();
		System.out.print("Please enter how many US dollars you currently have: $");
		
		Scanner sc = new Scanner(System.in);
		dollars = sc.nextFloat();
		francs = dollars * 9240;
		
		System.out.printf("You have %1.2f Guinean Francs", francs);
		System.out.println();
	}

}