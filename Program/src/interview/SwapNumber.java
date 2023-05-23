package interview;

import java.util.Scanner;

public class SwapNumber {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("plz enter values of a ");
		int  a= s.nextInt();
		
		System.out.println("plz enter values of b ");
		int  b= s.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a is = "+a);
		System.out.println("value of b is = "+b);
		
		
	}

}
