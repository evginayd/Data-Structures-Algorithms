package array;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,4,2,7,3,9,8,1,6};
		
		int target = 3;
		
		int result = search(array, target);
		System.out.println("The target is in the " + result + "th index...");
		
	}

	private static int search(int[] array, int target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = array.length - 1;
		while(start <= end) 
		{
			int mid = start + (end - start) / 2;
			if(array[mid] < target) 
			{
				start = mid + 1;
			}
			if(array[mid] > target) 
			{
				end = mid - 1;
			}
			if(array[mid] == target) 
			{
				return mid;
			}
		}
		return -1;
	}

}
