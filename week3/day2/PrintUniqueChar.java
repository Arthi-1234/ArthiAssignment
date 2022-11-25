package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueChar {

	public static void main(String[] args) {
		
		String n = "Aarthiii";
		n= n.toLowerCase();
		
		char[] n1 = n.toCharArray();
		Set<Character> uniChar = new HashSet<Character>();
		
		for(int i=0;i<n1.length;i++)
		{
			boolean add = uniChar.add(n1[i]);
			if(!add)
			{
				if(uniChar.contains(n1[i]))
				{
					uniChar.remove(n1[i]);
				}
				else
				{
				uniChar.add(n1[i]);
			}
		}
		}
		System.out.println(uniChar);

	}

}