package week3.day2;

import java.util.TreeMap;

public class FindNumberOccurances {

	public static void main(String[] args) {
		
		int[] a = {2,3,5,6,3,2,1,4,2,1,6,-1};
				
	     TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
	     
	     for (int i = 0; i < a.length; i++) {
	    	 
	    	 if(tm.containsKey(a[i])) {
			     tm.put(a[i], tm.get(a[i])+1);
		       }
	    	 else {
				tm.put(a[i], 1);
			}
	}
	     System.out.println(tm);
	}
}