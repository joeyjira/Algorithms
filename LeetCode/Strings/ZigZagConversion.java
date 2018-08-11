public class ZigZagConversion {
  public String convert(String s, int numRows) {
    if (numRows == 1) return s;

    List<List<Character>> matrix = new ArrayList<>();
    boolean down = true;
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < numRows; i++) {
        matrix.add(new ArrayList<Character>());
    }

    int row = 0;
    for (int i = 0; i < s.length(); i++) {
        matrix.get(row).add(s.charAt(i));
        if (row < numRows - 1 && down) {
            row++;
        } else if (row == numRows - 1) {
            down = false;
            row--;
        } else if (row > 0 && !down) {
            row--;
        } else if (row == 0 && !down) {
            down = true;
            row++;
        }
    }

    for (List<Character> rows : matrix) {
        for (Character c : rows) {
            result.append(c);
        }
    }

    return result.toString();
  }
}
