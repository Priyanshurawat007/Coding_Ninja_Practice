public class Solution {
	
	public static void quickSort(int[] input, int startIndex, int endIndex) {
	
		if (startIndex < endIndex) {
		
			int pivotIndex = partition(input, startIndex, endIndex);
			
	
			quickSort(input, startIndex, pivotIndex - 1);
			quickSort(input, pivotIndex + 1, endIndex);
		}
	}
	
	private static int partition(int[] input, int startIndex, int endIndex) {
		
		int pivot = input[endIndex];
		int i = startIndex - 1;
		
		
		for (int j = startIndex; j < endIndex; j++) {
			if (input[j] < pivot) {
				i++;
				swap(input, i, j);
			}
		}

		swap(input, i + 1, endIndex);
		
		
		return i + 1;
	}
	
	private static void swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
}
