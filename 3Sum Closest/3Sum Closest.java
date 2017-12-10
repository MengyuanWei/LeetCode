import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int t_sum = nums[i] + nums[l] + nums[r];
                if (t_sum == target) {
                    return t_sum;
                } else if (sum < target) {
                    if (Math.abs(target - t_sum) < Math.abs(target - sum)) {
                        sum = t_sum;
                    }
                    l++;
                    
                } else {
                    if (Math.abs(target - t_sum) < Math.abs(target - sum)) {
                        sum = t_sum;
                    }
                    r--;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] test = {-1, 2, 1, -4};
        System.out.print(s.threeSumClosest(test, 1));
    }
}