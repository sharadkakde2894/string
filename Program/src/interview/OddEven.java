package interview;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String[] args) {
		System.out.println(" plz enter number ");
		Scanner s= new Scanner(System.in);
		int num = s.nextInt();
		
		if(num%2==0) {
			
			System.out.println(" this is even number ");
		}
		else {
			System.out.println("this is odd number");
		}
	}

}
