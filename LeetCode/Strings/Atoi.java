public class Atoi {
  public int myAtoiBrute(String str) {
        if (str.isEmpty()) return 0;
        String s = str.trim();
        Integer startIdx = null;
        int length = 0;
        int result = 0;
        Boolean negative = false;
        Boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' && !found) {
                negative = true;
                found = true;
                continue;
            } else if (s.charAt(i) == '+' && !found) {
                found = true;
                continue;
            }
            try {
                Integer.parseInt(s.charAt(i) + "");
                if (startIdx == null) startIdx = i;
                found = true;
                length++;
            } catch (NumberFormatException e) {
                if (startIdx == null) return 0;
                break;
            }
        }

        if (startIdx == null) return 0;

        try {
            int temp = Integer.parseInt(s.substring(startIdx, startIdx + length));
            result = negative ? -temp : temp;
        } catch (NumberFormatException e) {
            result = negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        return result;
    }
}
