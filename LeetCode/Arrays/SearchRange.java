public class SearchRange {
  public int[] searchRange(int[] nums, int target) {
    int left = 0, right = nums.length - 1, mid = right + left / 2, i = -2, j = 0;

    while (right > left) {
        System.out.println("Left: " + left + ", Right: " + right + ", Mid: " + mid);
        if (target == nums[mid]) {
            i = mid; j = mid;
            while (nums[i] == target || nums[j] == target) {
                if (i >=0 && nums[i] == target) i--;
                if (j <= nums.length - 1 && nums[j] == target) j++;
            }
            break;
        } else if (nums[mid] > target) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }

        mid = (right + left) >> 1;
    }

    return new int[] {i + 1, j - 1};
  }
}
