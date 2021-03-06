// https://leetcode.com/problems/climbing-stairs/discuss/2155622/Evolve-from-Rec-to-DP-Java

class Solution {
    // Bottom Up Dynamic Programming
    
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        
        dp[n] = 1;
        
        dp[n - 1] = 1;
        
        for(int i = n - 2; i >= 0; i--) { 
            dp[i] = dp[i + 1] + dp[i + 2];
        }
        
        return dp[0];
    }
}