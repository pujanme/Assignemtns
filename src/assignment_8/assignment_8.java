package assignment_8;

import java.util.Scanner;

public class assignment_8 {

	public static void main(String[] args) {
		  
	    //Fahrenheit to Celsius //

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Fahrenheit ");
		double fahrenheit = input.nextDouble();

		System.out.println("Enter the Celsius ");
	    double celsius = input.nextDouble();
	    
	      fahrenheit = (9/5 * celsius) + 32;
	      System.out.println(" Fahrenheit to Celsius : "+fahrenheit);
	      
	     
}
	
}
