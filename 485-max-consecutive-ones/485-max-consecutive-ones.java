class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0, end, maxLength = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                start = i;
                break;
            }
        }
        
        // if(i == nums.length)
        //     return 0;
        
        end = start;
        
        
        while(end < nums.length) {
            if(nums[end] == 1)
                end++;
            
            else {
                start = end + 1;
                end = end + 1;
            }
            
            int length = end - start;
            maxLength = Math.max(maxLength, length);
        }
        
        return maxLength;
    }
}