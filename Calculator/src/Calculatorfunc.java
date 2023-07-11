import java.util.*;
import java.lang.System;
public class Calculatorfunc {
	
	Scanner scan=new Scanner(System.in);
	

	

	public void addition(int a,int b) {
		int c=a+b;
		
		System.out.println("addition of a and b is "+c);
	}
	public void subtraction(int a,int b) {
		int d=b-a;
		System.out.println("subtraction of a and b is "+d);
	}
	public void multiplication(int a,int b) {
		int d=a*b;
		System.out.println("multiplication of a and b is "+d);
	}
	public void division(int a,int b) {
		int d=a/b;
		
		System.out.println("division of a and b is "+d);
	}
	public void modulo(int a,int b) {
		int d=a%b;
		System.out.println("remainder of a and b is "+d);
	}
	public void perfectsquare(int a) {
		int d=a*a;
		System.out.println("square  of a is "+d);
		
	}
	
	

}
