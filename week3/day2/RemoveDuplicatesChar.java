package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesChar {

	public static void main(String[] args) {
		String CompanyName = "Google";
		char[] charArray= CompanyName.toCharArray();
		Set<Character> unique = new HashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			unique.add(charArray[i]);
		}
			
		System.out.println(unique);
	}
}
