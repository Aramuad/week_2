/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Assingment #:	2	←		*/

package assingment_2;

import java.lang.Math;
import java.util.Scanner;

public class distance {

	public static void main(String[] args) {
		
		double x1, y1, x2, y2;
		double distance;
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter the X value of the first location: ");
		x1 = sc.nextDouble();
		System.out.print("Enter the Y value of the first location: ");
		y1 = sc.nextDouble();
		System.out.print("Enter the X value of the second location: ");
		x2 = sc.nextDouble();
		System.out.print("Enter the Y value of the second location: ");
		y2 = sc.nextDouble();
		distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		
		System.out.println();
		System.out.println("Entered X1: " + x1);
		System.out.println("Entered Y1: " + y1);
		System.out.println("Entered X2: " + x2);
		System.out.println("Entered Y2: " + y2);
		System.out.println("Distance: " + distance);
		System.out.println();
	}

}