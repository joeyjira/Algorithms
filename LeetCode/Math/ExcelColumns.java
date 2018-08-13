public class ExcelColumns {
  public int titleToNumber(String s) {
    int result = 0;

    for (int i = 0, j = s.length() - 1; j >= 0; i++, j--) {
        result += (Math.pow(26, i) * (Integer.valueOf(s.charAt(j)) - 64));
    }

    return result;
  }
}
