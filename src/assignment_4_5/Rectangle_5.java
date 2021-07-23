package assignment_4_5;

import java.util.Scanner;

public class Rectangle_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//A = area of rectangle
		//l = length
		//b= breath
		

		System.out.println("Enter area of rectangle:");
		double A = input.nextDouble();

		System.out.println("Enter length");
		double L = input.nextDouble();
		

		System.out.println("Enter breath:");
		double B = input.nextDouble();
		
		double AreaOfRectangle = L*B ;
		 System.out.println("areaofrectangle is = " +AreaOfRectangle);
		
	}

}
