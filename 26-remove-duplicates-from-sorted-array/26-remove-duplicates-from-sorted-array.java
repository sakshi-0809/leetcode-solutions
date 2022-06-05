class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 0, current = 0;
        
        while(current < nums.length - 1) {
            if(nums[current] != nums[current+1]) { 
                nums[unique] = nums[current];
                unique++;
            }
            
            current++;
        }
        
        if(nums[current] != nums[unique])
            nums[unique] = nums[current];
    
    
        return unique + 1;
    }
}