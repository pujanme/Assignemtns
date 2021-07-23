package assignment_4_5;

import java.util.Scanner;

public class Circle_5 {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		 // (pi) = (22/7) = 3.14
		
	     // r =radius is always half the of its diameter 
		
	   	//A= area of circle
		
       //Area of circle(A) =  r²(formula)
		
		
		System.out.println("Enter PI:");
		final double PI = Math.PI;
		
		
		System.out.println("Enter Radius:");
		double R = input.nextDouble();
		
		double Area= PI*R*R;
		System.out.println("Area of Circle is : "+Area);
		
		
		

	}

}
