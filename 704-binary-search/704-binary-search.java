// Binary Search using recursion

class Solution {
    // why are we passing start and end as arguments 
    // because we need these to be passed for every recursive function call

    public int helper(int[] nums, int target, int start, int end) {
        if(start > end)
            return -1;
        
        // defined in the body of the function because it is specific to the particular function call
        
        int mid = start + ((end - start) / 2);
        
        if(nums[mid] == target)
            return mid;
        
        if(target < nums[mid])
            return helper(nums, target, start, mid - 1);
        
        return helper(nums, target, mid + 1, end);
    }
    
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }
}