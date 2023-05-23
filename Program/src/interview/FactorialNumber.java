package interview;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		System.out.println("plz enter number to calculate factorial number");
		Scanner s = new Scanner (System.in);
		int num =s.nextInt();
		
		int fact=1;
		int i;
		
		for(i=1;i<=num;i++) {
			
			fact = fact*i;
			
		}
		System.out.println(" The facctorial of  " +num +" is " +fact);
	}
	
}
