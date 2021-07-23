package assignment_12;

import java.util.Scanner;

public class assignment_12_left {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		Scanner s = new Scanner(System.in);
		
		System.out.print(" Enter your Name and Age: ");
		System.out.println(s.nextLine() + " You are " + s.nextDouble() + " Years old!");
		System.out.println();
		System.out.print(" Enter your Nationality: ");
		System.out.print(" Enter your Roll Number: ");
		System.out.println(s.nextLine() + " You're From " + s.nextDouble() + ". Your Roll number is !");
		
		
		
		String name = input.nextLine();
		double age = input.nextDouble();
		
        String nationality = input.nextLine();
        double roll = input.nextDouble();
	}

}
