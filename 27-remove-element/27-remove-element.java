class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0, end = nums.length - 1;
        
        // checking for start == end also because element at that index might be equal to val, 
        // in that case, line number 14 and 15 executes and end reduced by 1 since nums[end] = nums[start] = val
        // hence we return end + 1 (and not start + 1)
        
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