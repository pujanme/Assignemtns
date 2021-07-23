package assignment_11;

import java.util.Scanner;

public class assignment_11 {

	public static void main(String[] args) {

		int a , b, temp;
		a = 10;
		b = 20;
		System.out.println("Before you swap");
		System.out.println("value of z is :" + a);
		System.out.println("value of y is :" + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After you swap");
		System.out.println("value of z is :" + a);
		System.out.println("value of y is :" + b);
	}
	
}
