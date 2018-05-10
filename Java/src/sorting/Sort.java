package sorting;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		Sort sorting = new Sort();
		int[] array = new int[] {90, 23, 17, 75, 36, 
				38, 54,	66,	32,	80,	44, 100, 93, 97, 
				39,	62,	16,	88,	92,	50,	37,	52,	69,	
				92,	21,	80,	46,	19,	94,	63,	34,	72,	
				17,	2, 3, 69, 88, 12, 42, 99, 17, 16,
				87,	32,	38,	96,	50,	63,	90,	42,	41, 
				79,	75, 1, 47, 64, 75, 90, 54, 18, 88, 
				10,	82,	71,	20,	18,	27,	14,	87,	18,	
				69,	8, 33,	17,	30,	53,	25,	49,	23,	
				76, 9, 75, 49, 46, 86, 47, 4, 69, 62, 
				26,	65,	9, 65, 18, 56, 36, 7, 19, 57, 70};
		
//		sorting.insertionSort(array);
		sorting.mergeSort(array, 0, array.length - 1);
		
		System.out.println(Arrays.toString(array));
	}
	
	public void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
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
			if (left[i] < right[j]) {
				array[k] = left[i];
				i++;
			} else {
				array[k] = right[j];
				j++;
			}
			k++;
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
