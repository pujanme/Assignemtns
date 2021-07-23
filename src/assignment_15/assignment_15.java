package assignment_15;

import java.util.Scanner;

public class assignment_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  number 0-128 :");
		int n = input.nextInt();
		if (n >= 0 && n <= 135) {
		
		char c = (char)n;
		System.out.println("Ascii charater code is :" +c );
		
		
		
	}

}
}