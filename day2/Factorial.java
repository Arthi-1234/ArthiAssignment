package week1.day2;

import java.util.Iterator;

public class Factorial {

	public static void main(String[] args) {
		
		int input = 5;
		int fact = 1;
		
		for(int i=1; i<=5; i++) {
			fact = fact*i;
			}
		System.out.println("Factorial value of 5 is " +fact);
	}

}
