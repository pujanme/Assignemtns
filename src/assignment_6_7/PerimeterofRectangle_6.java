package assignment_6_7;

import java.util.Scanner;

public class PerimeterofRectangle_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//p=2(l+b)
		
		System.out.println("Perimeter of Rectangle:");
		double P = input.nextDouble();

		System.out.println("Enter length");
		double L = input.nextDouble();
		

		System.out.println("Enter breath:");
		double B = input.nextDouble();
		
		double PerimeterofRectangle =2*(L+B) ;
		 System.out.println("Perimeter of Rectangle is = " +PerimeterofRectangle);
		
		
		
		

	}

}
