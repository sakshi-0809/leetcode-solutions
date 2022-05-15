class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        
        int[] result = new int[len];
        int prefix = 1, postfix = 1;
        
        // calculating the prefix inside output array itself
        
        for(int i = 0; i < len; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        
        // calculating the postfix and multiplying with the required index in output array i.e. w required prefix
        
        for(int i = len - 1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }
        
        return result;
    }
}