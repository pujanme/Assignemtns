package assignment_6_7;

import java.util.Scanner;

public class assignment_7 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	//v=r*r*pi*l
	System.out.println("Enter the redius of cylinder");
	double redius = input.nextDouble();

	System.out.println("Enter the length of cylinder");
	double length = input.nextDouble();
	
	System.out.println("Enter the volume of cylinder");
	double Volume = input.nextDouble();
	
	final double PI = Math.PI;
	
	
	
	double volume =redius*redius*PI*length;
	System.out.println(" area of volume : "+volume);
	

	}

}
