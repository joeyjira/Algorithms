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
	
	public static long multiply(long x, long y) {
		long sum = 0;
		
		while (x != 0) {
			if ((x & 1) != 0) {
				sum = add(sum, y);
			}
			x >>>= 1;
			y <<= 1;
		}
		
		return sum;
	}
		
		
	
	private static long add(long a, long b) {
		long sum = 0, carryin = 0, k = 1, tempA = a, tempB = b;
		while (tempA != 0 || tempB != 0) {
			long ak = a & k, bk = a & k;
			long carryout = (ak & bk) | (ak & carryin) | (bk & carryin);
			sum |= (ak ^ bk ^ carryin);
			carryin = carryout << 1;
			k <<= 1;
			tempA >>>= 1;
			tempB >>>= 1;
		}
		return sum | carryin;
	}
}
