package elements;

import java.util.Collections;
import java.util.List;

public class Arrays {
	public static void evenOdd(List<Integer> A) {
		int nextEven = 0, nextOdd = A.size() - 1;
		while (nextEven < nextOdd) {
			if ((A.get(nextEven) & 1) == 0) {
				nextEven++;
			} else {
				Collections.swap(A, nextEven, nextOdd);
			}
		}
	}
}
