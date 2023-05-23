package javaString;

public class SplitString1 {

	public static void main(String[] args) {
		
		String s = "123s456s789s123";
		String[] k = s.split("s",4);
		
		for(String a:k) {
			
			System.out.println(a);
		}
	}
}
