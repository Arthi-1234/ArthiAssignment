package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int[] Values = {30,20,10,40,60,70};
		//System.out.println(Values[1]);

		int noOfData=Values.length;
		//System.out.println(noOfData);
		Arrays.sort(Values);
		
		for (int i=0; i < noOfData ;i++) 
			//System.out.println(Values[i]); 
			System.out.println(Values[Values.length-2]); 
	}

}
