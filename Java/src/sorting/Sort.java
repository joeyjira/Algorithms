package sorting;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		Sort sorting = new Sort();
		int[] array = new int[] {5, 2, 4, 6, 1, 3};
		sorting.insertionSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public int[] insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			
			array[j + 1] = key;
		}
		
		return array;
	}
	
	public int[] merge(int[] array, int p, int q, int r) {
		return array;
	}
}
