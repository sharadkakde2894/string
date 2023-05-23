package javaString;

public class StringPractical {
	
	
	public static void main (String[]arg) {
		
		String s1 = "Software Tester";
		String s2 = "velocity";//constant string //
		String s3 = "Velocity";
		String s4 = "VELOCITY";
		String s5 = "Software";
		String s6 = new String("velocity");//non constant
		String s7 = new String("velocity");
		String s8 = "velocity";
		
		System.out.println(	s1.isEmpty());
		System.out.println(	s1.isBlank());
		System.out.println(	s1.length());
		System.out.println(	s4.toLowerCase());
		System.out.println(	s2.toUpperCase());
		System.out.println(	s1.startsWith("Soft"));
		System.out.println(	s2.endsWith("ity"));
		System.out.println(	s1.startsWith(s5));//compare with start text
		System.out.println(	s2.endsWith(s3));//compare with end text....case sensitive
		System.out.println(	s1.concat(" "+s5));
		System.out.println(	s1.charAt(5));//to find out index of any string
		System.out.println(	s1.indexOf("t"));//to find out first  index of char //same char 
		System.out.println(	s1.lastIndexOf("t"));//to find out last  index of char 
		System.out.println(	s1.substring(2,6));
		System.out.println(	s2.equals(s8));
		System.out.println(	s2.equalsIgnoreCase(s3));
		System.out.println(	s1.replace("Software","sharad"));
		System.out.println(s2.length());
	}

}
