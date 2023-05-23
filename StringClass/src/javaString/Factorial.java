package javaString;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("plz enter number to calculate factorials");
		int a=s.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}

//5=120
//1x2x3x4x5
//2x3
//6x4
//24x5
//120

//9=1x2x3x4x5x6x7x8x9=362880