package assignment_12;

import java.util.Scanner;

public class assignment_12 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   

    System.out.print(" Enter your Name and Roll Number: ");
   int nameandroll = sc.nextInt();
		
	System.out.print(" Enter your Nationality: ");
	 String nationality = sc.next();
     
	 System.out.println(sc.nextLine() + " You're name is: " + sc.nextInt() + ". Your Roll number is !" + sc.nextInt() + " You're nationality is: " + sc.next());
		
	}

}
