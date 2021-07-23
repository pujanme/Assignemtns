package assignment_8;

import java.util.Scanner;

public class assignment_8_ {

	public static void main(String[] args) {
		
		//Celsius to Fahrenheit//
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Celsius ");
	    double celsius = input.nextDouble();
		
		System.out.println("Enter the Fahrenheit ");
		double fahrenheit = input.nextDouble();

		celsius = (fahrenheit - 32) * 5/9;
	      System.out.println("Celsius to Fahrenheit : "+celsius);
		
	}

}
