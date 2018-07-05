package string;

import java.util.*;

public class Unique {
  public static int solution(String str) {
    HashMap<Character, ArrayList<Integer>> map = new HashMap<Character, ArrayList<Integer>>();

    for (int i = 0; i < str.length(); i++) {
      ArrayList<Integer> arr = map.get(str.charAt(i));
      if (arr == null)
        arr = new ArrayList<Integer>();
      arr.add(i);
      map.put(str.charAt(i), arr);
    }

    int total_unique = 0;
    for (ArrayList<Integer> ndxs : map.values())
      for (int i = 0; i < ndxs.size(); i++) {
        int prev_loc = i == 0 ? -1 : ndxs.get(i-1);
        int next_loc = i + 1 == ndxs.size() ? str.length() : ndxs.get(i+1);
        total_unique += (ndxs.get(i) - prev_loc) * (next_loc - ndxs.get(i));
      }

    return total_unique % 1000000007;
  }

  public static void main(String args[]) {
    System.out.println(solution("codility"));
  }
}
