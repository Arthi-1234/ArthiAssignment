package week1.day2;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int input=153;
		int result=0;
		int remainder, original, quotient;
		original=input;
		while(original !=0) {
			remainder=original%10;
			quotient=original/10;
			original=quotient;
			result=result+(remainder*remainder*remainder);
			
		}

		if(input==result) {
			System.out.println("Number is Armstrong NUmber");
			
		}else {
			System.out.println("Number is not Armstrong Number");
		}
	}


	}