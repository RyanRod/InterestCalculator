/*Practice Java programming to compute interest earned by a savings account
 * with a known yearly interest rate.
 * 
 *  input:  
 *  
 * 
 * 
 * */

package interestcalc;

import java.util.Scanner;

// collaboration project by Ryan Rodriguez and M. Robert Diaz Jr.


public class Calculator {

	private static double loanAmount = 100;
	private static double interestRate = 1.1;
	private static double years = 1;
	
	public static void main(String args[]){
		GatherData();			
		
	}
	
	private static void GatherData(){ // Asks user for info needed and sets it to globals
		Scanner s = new Scanner(System.in);
		
		System.out.println("What is the amount of your principle? (Loan amount)");
		loanAmount = Double.parseDouble(s.nextLine());
		
		System.out.println("What is the interest rate? (%)");
		interestRate = Double.parseDouble(s.nextLine());
		
		System.out.println("How long will this interest accumulate? (In days)");
		years = Double.parseDouble(s.nextLine()) / 365;
		
		System.out.println("Perfect!");
		s.close();
	}
	
	
	
}
