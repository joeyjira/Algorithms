package sorting;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		Sort sorting = new Sort();
		int[] array = new int[] {5, 2, 4, 6, 1, 3};
		
//		sorting.insertionSort(array);
		sorting.mergeSort(array, 0, array.length - 1);
		
		System.out.println(Arrays.toString(array));
	}
	
	public void insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			
			array[j + 1] = key;
		}
	}
	
	public void mergeSort(int[] array, int l, int r) {
		if (l < r) {
			int m = (l + r) >> 1;
			mergeSort(array, l, m);
			mergeSort(array, m + 1, r);
			
			merge(array, l, m, r);
		}
		
	}
	
	public void merge(int[] array, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for (int i = 0; i < n1; i++) {
			left[i] = array[l + i];
		}
		
		for (int i = 0; i < n2; i++) {
			right[i] = array[m + 1 + i];
		}
		
		int i = 0, j = 0, k = l;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				array[k] = left[i];
				i++;
				k++;
			} else {
				array[k] = right[j];
				j++;
				k++;
			}
		}
		
		while (i < n1) {
			array[k] = left[i];
			i++;
			k++;
		}
		
		while (j < n2) {
			array[k] = right[j];
			j++;
			k++;
		}
	}
}
