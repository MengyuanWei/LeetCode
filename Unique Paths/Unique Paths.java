class Solution {
    public int uniquePaths(int m, int n) {
        int step = m + n - 2; // total steps that need to go
        int down = m - 1; // number of steps that need to go down
        double ans = 1;
        for (int i = 1; i <= down; i++) {
            // here calculate the total possible path number
            // Combination(step, down) = n! / (k!(n - down)!)
            // reduce the numerator and denominator and get
            ans = ans * (step - down + i) / i;
        }
        return (int)ans;
        
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.uniquePaths(3, 7));
    }
}