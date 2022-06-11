class Solution {
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
        if(nums.length == 1)
            return nums[0];
        
        if(nums.length == 2) 
            return Math.max(nums[0], nums[1]);
        
        int[] withFirstHouse = new int[nums.length - 1];
        
        int[] withLastHouse = new int[nums.length - 1];
        
        int x = 0, y = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                withFirstHouse[x++] = nums[i];
            } else if(i == nums.length - 1) {
                withLastHouse[y++] = nums[i];
            } else {
                withFirstHouse[x++] = nums[i];
                withLastHouse[y++] = nums[i];
            }
        }
        
        int max = 0;
        
        max = Math.max(helper(withFirstHouse, 0), max);
        
        // have to clear the memoziation hash map before calling helper again
        
        memo.clear();
        
        max = Math.max(helper(withLastHouse, 0), max);
        
        return max;
    }
}