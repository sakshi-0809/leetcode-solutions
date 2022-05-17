class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0, maxLength = 0, currentLength = 0;
        
        while(start < nums.length) {
            if(nums[start] == 0)
                currentLength = 0;
            
            else
               currentLength += 1;
        
            
            maxLength = Math.max(maxLength, currentLength);
            
            start++;
        }
        
        return maxLength;
    }
}