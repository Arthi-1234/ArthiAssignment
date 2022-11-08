package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator operator = new Calculator();
		
		int add = operator.add(10,20,30);
		int sub = operator.sub(50, 20);
		double mul = operator.mul(80.45, 56.23);
		float div = operator.divide(100.50f, 2.50f);
		
		
		System.out.println("Addition is" +add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		

	}

}
