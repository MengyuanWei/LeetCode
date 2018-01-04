class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int max_left = 0, max_right = 0;
        int ans = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] > max_left) {
                    max_left = height[left];
                } else {
                    ans += max_left - height[left];
                }
                left++;
            } else {
                if (height[right] > max_right) {
                    max_right = height[right];
                } else {
                    ans += max_right - height[right];
                }
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] test = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(s.trap(test));
        
    }
}