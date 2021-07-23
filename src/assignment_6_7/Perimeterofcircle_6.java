package assignment_6_7;

import java.util.Scanner;

public class Perimeterofcircle_6 {

	public static void main(String[] args) {
		
	
			Scanner input = new Scanner(System.in);
		 
		    //C = 2 pi r//
			


			System.out.println("Enter PI:");
			final double PI = Math.PI;
			
			
			System.out.println("Enter Radius:");
			double R = input.nextDouble();
			
			double PerimeterOfCircle= 2*PI*R;
			System.out.println("Area of Circle is : "+PerimeterOfCircle);
			
			
		
		
		
		

	}

}
