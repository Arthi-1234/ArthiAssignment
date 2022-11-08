package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int [] Num1 = {3,2,11,4,6,7};
		int [] Num2 = {1,2,8,4,9,7};
		System.out.println("To find Intersection of two arrays");
		
		for (int i = 0; i < Num1.length; i++) {
			for (int j = 0; j < Num2.length; j++) {
				if(Num1[i] == Num2[j]) {
					System.out.println(Num2[j]);
				}
			}
			
		}

	}

}
