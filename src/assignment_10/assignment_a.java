package assignment_10;

import java.util.Scanner;

public class assignment_a {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a ");
		double a = input.nextDouble();
		
		System.out.println("Enter u ");
		double u = input.nextDouble();
		
		System.out.println("Enter t ");
		double t = input.nextDouble();
		
		double s = u * t + 0.5 * a * t * t;
		System.out.println(s);

	}

}
