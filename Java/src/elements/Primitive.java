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
	
	public static long closestIntSameBit(long x) {
		final int UNSIGNED_BITS = 63;
		
		for (int i = 0; i < 63; i++) {
			if (((x >>> i) & 1) != ((x >>> (i + 1) & 1))) {
				x ^= (1L << i) | (1L << i + 1);
				return x;
			}
		}
		
		throw new IllegalArgumentException("All bits are 0 or 1");
	}
}
