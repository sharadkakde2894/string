package interview;

import java.util.Scanner;

public class FabbonacciSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("plz enter number ");
		int num =s.nextInt();
		int first = 0;
		int second = 1;
		int next;
		for(int i=0;i<=num;i++) {
			System.out.println(first);
			next =first+second;
			first=second;
			second=next;
			
			
		}
		
		
				
	}
}
