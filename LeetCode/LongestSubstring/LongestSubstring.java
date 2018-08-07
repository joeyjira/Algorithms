public class LongestSubstring {
  public int lengthOfLongestSubstring(String s) {
     Set<Character> set = new HashSet<>();
     int result = 0;
     int i = 0;
     int j = 0;

     while (i < s.length() && j < s.length()) {
         if (!set.contains(s.charAt(j))) {
             set.add(s.charAt(j));
             j++;
             result = Math.max(result, j - i);
         } else {
             set.remove(s.charAt(i));
             i++;
         }
     }

     return result;
   }
}
