package string;

public class SplitString {
	
	public static void main(String[] args) {
		
		
		String s1="sharadprakashkakde";
		String s2="sharad@prakash@kakde";

		
		String[] str = s2.split("@", 6);
		for(String a:str) {
			System.out.println(a);
		}
	    
			
		}
		
	}


