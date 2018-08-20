public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
        List<List<Integer>> temp = twoSum(nums, -nums[i], i);

        for (int j = 0; j < temp.size(); j++) {
            temp.get(j).add(nums[i]);
            Collections.sort(temp.get(j));
            if (!res.contains(temp.get(j))) res.add(temp.get(j));
        }
    }

    return res;
  }

  private List<List<Integer>> twoSum(int[] nums, int target, int exclude) {
    Map<Integer, Integer> map = new HashMap<>();
    List<List<Integer>> res = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
        if (i == exclude) continue;
        int complement = target - nums[i];
        if (map.get(complement) != null) {
            List<Integer> temp = new ArrayList<>();
            temp.add(complement);
            temp.add(nums[i]);
            res.add(temp);
        }

        map.put(nums[i], i);
    }

    return res;
  }
}
