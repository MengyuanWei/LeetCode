class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = (end + start) / 2;
            if (nums[mid] == target) return mid;
            if (target < nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }
}