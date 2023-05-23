package javaString;

public class Swap2Number {

	//swap
	//a=20
	//b=10
	//we can do by way 1...with the help of third variable ...2...without third variable
	public static void main (String[]arg) {
	int a=40;
	int b=10;
	int c;
	
	c=a;//c=40
	a=b;//a=10
	b=c;//b=40
	System.out.println(a+" "+b);
	
	
	//a=a+b;//50       a=50
    //b=a-b;//50-10=40 b=40......current 
	//a=a-b;//50-40    a=10......current
	//System.out.println(a+" "+b);
	}
}
