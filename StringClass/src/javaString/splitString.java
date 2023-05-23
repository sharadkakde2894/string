package javaString;

public class splitString {
	
	public static void main(String[] args) {
		
		String s="sharadprakashkakde";
		
		String[] k = s.split("a", 7);
		
		for(String a :k) {
			System.out.println(a);
		}
		
	}

}
