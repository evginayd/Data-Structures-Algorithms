package array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDublicate {

	public static void main(String[] args) {
		int[] nums = {3,5,2,7,4,8,8,2,1};
		
		boolean result = containsDublicate(nums);
		
		if(result == true) 
		{
			System.out.println("This array contains dublicate...");
		}
		else 
		{
			System.out.println("This array doesn't contains dublicate...");
		}
		
	}
	public static boolean containsDublicate(int[] nums) 
	{
		// Create a HashSet for reducing Memory complexity
		Set<Integer> repeat = new HashSet<>();
		for(int num: nums) 
		{
			if(repeat.contains(num)) 
			{
				return true;
			}
			repeat.add(num);
		}
		return false;
	}
}
