package assignment_9;

import java.util.Scanner;

public class assignment_9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number in pounds ");
		double pounds = input.nextDouble();
        double kilogram = input.nextDouble();
		kilogram=pounds*0454;
		
		 System.out.println(pounds + " is " + kilogram+ "kilogram");

		 
		 
		 
		 
	}

}
