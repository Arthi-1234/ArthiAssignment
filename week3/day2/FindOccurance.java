package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindOccurance {

	public static void main(String[] args) {
		int[] nums = {1, 2, 1, 3, 2, 5};
		Map<Integer, Integer> occ = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
//			if(occ.containsKey(nums[i])) {
//				Integer Value = occ.get(nums[i]);
//				occ.put(nums[i], Value+1);
//			} else {
//				occ.put(nums[i], 1);
//			}
			occ.put(nums[i], occ.getOrDefault(nums[i],0)+1);
			
		}
			System.out.println(occ);
	}	
	
}

//