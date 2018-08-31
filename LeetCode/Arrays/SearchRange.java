public class SearchRange {
  public int[] searchRange(int[] nums, int target) {
    if (nums.length < 2) {
      if (nums[0] == target) {
        if (nums[1] == target) {
          return new int[] {0, 1};
        } else {
          return new int[] {0, 0};
        }
      } else if (nums[1] == target){
        return new int[] {1, 1};
      } else {
        return new int[] {-1, -1};
      }
    }
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
