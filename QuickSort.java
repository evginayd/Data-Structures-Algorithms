package array;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = {1,5,3,7,2,9,8,6,4};
		
		quickSort(array, 0, array.length-1);

		for(int num: array) 
		{
			System.out.println(num + " ");
		}
	}

	private static void quickSort(int[] array, int start, int end) {
		// TODO Auto-generated method stub
		if(end <= start) 
		{
			return;
		}
		int pivot = partition(array, start, end);
		quickSort(array, start, pivot-1);
		quickSort(array, pivot+1, end);
	}

	private static int partition(int[] array, int start, int end) {
		// TODO Auto-generated method stub
		int pivot = array[end];
		int i = start - 1;
		
		for(int j = start; j <= end - 1; j++) 
		{
			if(array[j] < pivot) 
			{
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;			
			}

		}
		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;	
		return i;
	}

}
