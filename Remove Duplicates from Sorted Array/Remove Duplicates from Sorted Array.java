class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] test = {1, 1, 2, 3, 6, 6, 6, 6};
        System.out.println(s.removeDuplicates(test));
    }
}