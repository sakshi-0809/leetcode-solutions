class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDifference = Integer.MAX_VALUE;
        int result = 0;
        
        Arrays.sort(nums);
                
        for(int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            
            while(start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                
                if(Math.abs(sum - target) < minDifference) {
                    minDifference = Math.abs(sum - target);
                    result = sum;
                }
                
                if(sum < target) 
                    start++;
                
                else
                    end--;
            }
        }
        
        return result;
    }
}