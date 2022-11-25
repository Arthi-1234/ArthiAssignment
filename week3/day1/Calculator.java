package week3.day1;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Calculator {
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void sub(double a, double b){
		System.out.println(a-b);
	}
	
	public void sub(int a, int b){
		System.out.println(a-b);
			}

	public void mul(int a, double b) {
		System.out.println(a*b);
	}
	
	public void mul(double a, double b) {
		System.out.println(a*b);
	}
	
	
	public static void main(String[] args) {
		Calculator Maths = new Calculator();
		Maths.add(2, 8);
		Maths.add(2, 8, 50);
		Maths.sub(12.45, 78.45);
		Maths.sub(60, 40);
		Maths.mul(45.67, 90.89);
		Maths.mul(50, 45.45);
		
	}

}
