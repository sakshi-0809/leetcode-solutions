class Solution {
    // Bottom Up Dynamic Programming
    
    HashMap<Integer, Integer> memo = new HashMap<>();
    
    public int climbStairs(int n) {
        if(memo.containsKey(n))
            return memo.get(n);
        
        if(n < 0) 
            return 0;
        
        if(n == 0)
            return 1;
        
        int valFromRecursion;
        
        valFromRecursion = climbStairs(n - 1) + climbStairs(n - 2);
        
        memo.put(n, valFromRecursion);
        
        return memo.get(n);
    }
}