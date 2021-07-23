package assignment_4_5;

import java.util.Scanner;

public class Assignment_5_second_way_circle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		 // (pi) = (22/7) = 3.14
		
	     // r =radius is always half the of its diameter 
		
	   	//A= area of circle
		
        //Area of circle(A) = pi r²(formula)
		
		
		System.out.println("Enter PI:");
	    double PI = Math.PI;
		double VALUE_OF_PI = 3.14;
		
		System.out.println("Enter Radius:");
		double R = input.nextDouble();
		
		
		double Area= PI*R*R;
		System.out.println("Area of Circle is : "+Area);
		
		
		
	
	}

}
