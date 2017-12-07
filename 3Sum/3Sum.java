import java.util.*;

class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		if (nums.length == 0) {
			return ans;
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i - 1] == nums[i]) {
				continue;
			}
			int target = -nums[i];
			int l = i + 1;
			int r = nums.length - 1;
			twoSum(nums, l, r, target, ans);
		}
		return ans;
	}
	public void twoSum(int[] nums, int l, int r, int target, List<List<Integer>> ans) {
		while (l < r) {
			if (nums[l] + nums[r] == target) {
				ArrayList<Integer> t = new ArrayList<>();
				t.add(-target);
				t.add(nums[r]);
				t.add(nums[l]);
				ans.add(t);
				l++;
				r--;
				while (l < r && nums[l] == nums[l - 1]) l++;
				while (l < r && nums[r] == nums[r + 1]) r--;
			} else if (nums[l] + nums[r] > target) {
				r--;
			} else {
				l++;
			}
		}
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] a = {-1, 0, 1, 2, -1, -4};
		System.out.print(s.threeSum(a));
	}
}