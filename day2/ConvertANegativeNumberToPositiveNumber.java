package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int N = -95;
		
		System.out.println("The given number is Negative number" +N);
		
		if(N < 0) {
			N=N*(-1);
			System.out.println("The coverted number is Positive" +N);
			}
		else if (N > 0) {
			N=N*(1);
			System.out.println("The coverted number is Positive" +N);
		}

	}

}
