package javaString;

public class ReverseString {

public static void main(String[] args) {
	
	String s= "SHARAD";
	int l = s.length();
	System.out.println(l);
	
	for(int i=l-1;i>=0;i--) {
		
		char m = s.charAt(i);
		
		System.out.print(m);
		
	}
	
}
	
	
}
