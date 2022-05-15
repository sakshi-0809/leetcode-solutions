class Solution {
    public int singleNumber(int[] nums) {
        int result = 0; 
        
        for(int i = 0; i < nums.length; i++) {
            // XOR each number in the array, since XOR of same numbers is 0
            // at the end we'll get result = number which occurs only once
            
            result ^= nums[i];
        }
        
        return result;
    } 
}