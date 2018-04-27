class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        for (int i = 0; i + 1 < nums.length; i++) {
            if (nums[i + 1] < nums[i]) return nums[i + 1];
        }
        return nums[0];
    }
}