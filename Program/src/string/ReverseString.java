package string;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s = "SHARAD";
		String s1 = "KAKDE";
		
		StringBuffer str = new StringBuffer(s);//string buffer class 
		StringBuffer k = str.reverse();
		System.out.println(k);
		
		StringBuilder b = new StringBuilder(s1);//string builder class
		StringBuilder k1 = b.reverse();
		System.out.println(k1);
		
		String s2 ="";
		int l = s.length();
		System.out.println(l);
		for(int i=l-1;i>=0;i--) {
			s2=s2+s.charAt(i);
			
		}
		System.out.println(s2);
		
	}

}
