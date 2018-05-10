package matrix;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Math {
	public static void main(String[] args) {
		int[][] A = new int[][] {{1, 2, 3,}, {4, 5, 6}};
		int[][] B = new int[][] {{7, 8}, {9, 10}, {11, 12}};
		
		System.out.println(Arrays.deepToString(Math.multiply(A, B)));
	}
	
	public static int[][] multiply(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a[0].length];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				c[i][j] = 0;
				for (int k = 0; k < a.length; k++) {
					c[i][j] = c[i][j] + (a[i][k] * a[k][j]);
				}
			}
		}
		
		return c;
	}
}
