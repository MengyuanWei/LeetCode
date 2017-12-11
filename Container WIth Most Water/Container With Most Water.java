class Solution {
    
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            int h = Math.min(height[l], height[r]);
            maxarea = Math.max(maxarea, h * (r - l));
            while (l < r && height[l] <= h) {
                l++;
            }
            while (l < r && height[r] <= h) {
                r--;
            }
        }	
        return maxarea;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int[]a = new int[]{4, 5, 3, 3, 8};
        System.out.print(s.maxArea(a));
    }
}