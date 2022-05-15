class Solution {
     public int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1;
        
        while(start <= end) {
            int mid = start + ((end - start) / 2);
            
            if(mid < end && nums[mid] > nums[mid + 1])
                return mid;
            
            if(mid > start && nums[mid] < nums[mid - 1])
                return mid-1;
            
            // case 1
            
            if(nums[mid] == nums[start] && nums[mid] == nums[end]) {
                // check if start or end - 1 is the pivot
                
                // checking start < end to avoid array index out of bounds
                if(start < end && nums[start] > nums[start + 1])
                    return start;
                
                start = start + 1;
                
                // checking end > start to avoid array index out of bounds
                if(end > start && nums[end] < nums[end - 1])
                    return end - 1;
                
                end = end - 1;
            }
            
            else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[end] < nums[mid]))
                start = mid + 1;
            else 
                end = mid - 1;
        }
        
        return -1;
    }
    
    public boolean binarySearch(int[] nums, int target, int start, int end) {
        
        while(start <= end) {
            int mid = start + ((end - start) / 2);
            
            if(nums[mid] == target)
                return true;
            
            else if(nums[mid] > target)
                end = mid - 1;
            
            else
                start = mid + 1;
        }
        
        return false; 
    }
    
    public boolean search(int[] nums, int target) {
        // find the pivot in the array using binary search
        
        int pivot = findPivot(nums);
        
        // if pivot = -1 then array is not rotated
        
        if(pivot == -1)
            return binarySearch(nums, target, 0, nums.length - 1);
        
        // if pivot is the target element
        
        if(nums[pivot] == target)
            return true;
     
        
        if(target >= nums[0])
            return binarySearch(nums, target, 0, pivot - 1);
        
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
}