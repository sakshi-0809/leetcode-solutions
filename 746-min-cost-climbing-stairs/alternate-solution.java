class Solution {
    // Recursion + Memoization
    
    public int helper(int[] cost, int current, int[] memo) {
        if(current == cost.length - 1) {
            return cost[current];
        }
        
        if(current >= cost.length) {
            return 0;
        }
        
        if(memo[current] != 0) {
            return memo[current];
        }
        
        int oneStep = helper(cost, current + 1, memo) + cost[current];
        
        int twoStep = helper(cost, current + 2, memo) + cost[current];
        
        memo[current] = Math.min(oneStep, twoStep);
        
        return memo[current];   
    }
    
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(helper(cost, 0, new int[cost.length]), helper(cost, 1, new int[cost.length]));
    }
}
