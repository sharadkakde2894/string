package javaString;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("plz enter number to check even or odd");
		int num = s.nextInt();
		
		if(num%2==0) {
			
			System.out.println("given number  "+num +" is even");
		}
		else {
			
			System.out.println("given number  "+num +" is odd");
		}
	}
}
