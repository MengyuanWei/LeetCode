class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int sofarMin = prices[0];
        int maxPro = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > sofarMin) {
                maxPro = Math.max(maxPro, prices[i] - sofarMin);
            } else {
                sofarMin = prices[i];
            }
        }
        return maxPro;
    }
    public static void main(String[] args) {
        int[] test1 = {7, 1, 5, 3, 6, 4};
        int[] test2 = {7, 6, 4, 3, 1};
        Solution s = new Solution();
        System.out.println(s.maxProfit(test1));
        System.out.println(s.maxProfit(test2));
    }
}