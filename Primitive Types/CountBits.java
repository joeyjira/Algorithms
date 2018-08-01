public class CountBits {
  /**
    Problem: Count the number of bits that are set to 1 in an integer
  */
  public static short countBits(int x) {
    short count = 0;
    while (x != 0) {
      count += (x & 1);
      x >>>= 1;
    }
  }
}
