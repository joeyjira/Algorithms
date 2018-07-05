package arrays;

import java.util.*;

public class FindMissingPositive {
    public int firstMissingPositive(int[] nums) {
      int max = Integer.MIN_VALUE;
      Map<Integer, Boolean> map = new HashMap<>();

      for(int num : nums) {
        map.put(num, true);
        max = num > max ? num : max;
      }

      for(int i = 1; i <= max + 1; i++) {
        if (map.get(i) == null) return i;
      }
        return -1;
    }
}
