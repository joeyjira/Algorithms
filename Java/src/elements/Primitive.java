package elements;

public class Primitive {
	public static int parity(int number) {
		int result = 0;
		while (number > 0) {
			result ^= number & 1;
			number = number>>>1;
		}
		
		return result;
	}
	
	public static long bitSwap(long x, int i, int j) {
		// Extract the i-th and j-th bits, and see if they differ
		if (((x >>> i) & 1) != ((x >>> j) & 1)) {
			long bitMask = (1L << i) | (1L << j);
			x ^= bitMask;
		}
		
		return x;
	}
}
