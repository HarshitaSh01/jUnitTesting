package jUnitTestPackage;
import java.util.*;


public class jUnitFunctions {
	public static void main(String args[]) {
		int x,y,sum;
		String s1,s2,val;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		x = s.nextInt();
		System.out.print("Enter the 2nd number: ");
		y = s.nextInt();
		sum = sum(x,y);
		System.out.print("Sum = "+sum);
		
		System.out.println();
		System.out.print("Enter the first string: ");
		s1 = s.next();
		System.out.print("Enter the second string: ");
		s2 = s.next();
		val = addition(s1,s2);
		System.out.print("Sum of String: "+val);
	}

public static int sum(int a, int b) {
	int sum = a + b;
	return sum;
}

public static String addition(String s1, String s2) {
	String val = s1 + s2;
	return val;
}
}
