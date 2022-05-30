class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0, end = nums.length - 1;
        
        while(start <= end) {
            if(nums[start] != val)
                ++start;
            
            else {
                if(nums[end] == val) {
                    --end;    
                }
                
                else {
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    
                    ++start;
                    --end;
                }
            }
        }
        
        return end + 1;
    }
}