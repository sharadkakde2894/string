package javaString;

import java.util.Scanner;

public class ReverseStringWithScannerClass {
	
	public static void main(String[] args) {
		System.out.println("plz enter string to reverse");
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		int l=string.length();
		System.out.println(l);
		for(int i=l-1;i>=0;i--) {
			
			char m = string.charAt(i);
			System.out.print(m);
			
		}
		
	}

}
