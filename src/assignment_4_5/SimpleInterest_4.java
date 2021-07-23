package assignment_4_5;

import java.util.Scanner;

public class SimpleInterest_4 {

public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	        //P = Principal(amount)
			//R = Rate(annual interest)
			//T = Time(in years)
			
			//simpleIntererst = P*R*T/100 (formula)
	
	System.out.println("Enter Principal:");
	double P = input.nextDouble();
	System.out.println("");
	
	System.out.println("Enter Rate:");
	double R = input.nextDouble();
	System.out.println("");
	
	System.out.println("Enter Time:");
	double T = input.nextDouble();
	System.out.println("");
	
	double simpleInterest = (P*T*R)/100;
	 System.out.println("Simple interest is = " +simpleInterest);
	
	
	

	
	
	
	
	
	
	
    
  
	
			
   

		
		
	}

}
