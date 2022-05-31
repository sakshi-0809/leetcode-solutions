class Solution {
    // memoization using HashMap
    
    HashMap<Integer, Integer> memo = new HashMap<>(); 
    
    public int helper(int[] nums, int index) {
        // returning the max amount for an index if it has already been processed before and is stored in the hash map
        
        if(memo.containsKey(index))
            return memo.get(index);
        
        if(index == nums.length)
            return 0;
        
        if(index == nums.length - 1)
            return nums[index];
        
        int maxAmount = Math.max(nums[index] + helper(nums, index + 2), helper(nums, index + 1));
        
        // memoizing or storing the max amount for a particular index 
        
        memo.put(index, maxAmount);
        
        return maxAmount;
    }
    
    public int rob(int[] nums) {
        return helper(nums, 0);
    }
}