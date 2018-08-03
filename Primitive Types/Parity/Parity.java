public class Parity {
  public static short bruteParity(long x) {
    short result = 0;
    while (x != 0) {
      result ^= (x & 1);
      x >>>= 1;
    }
    return result;
  }

  public static short betterParity(long x) {
    short result = 0;
    while (x != 0) {
      result ^= 1;
      x &= (x - 1); // Drops the lowest set bit of x
    }
    return result;
  }
}
