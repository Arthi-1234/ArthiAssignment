package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,8};
	System.out.println("Missing number is from Array1:" +getmissingnumber(arr)); 

		
	}

	public static int getmissingnumber(int[] arr) {
		int i, total;
		int n=arr.length;
		total = (n+1) * (n+2) /2;
		for (i=0; i<n; i++)
		total -= arr[i];
		return total;
	}

}


