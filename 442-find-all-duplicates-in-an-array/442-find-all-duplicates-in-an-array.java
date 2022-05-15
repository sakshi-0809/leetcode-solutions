class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            int reqIndex = Math.abs(nums[i]);
            
            if(nums[reqIndex - 1] < 0)
                duplicates.add(Math.abs(nums[i]));
            else 
                nums[reqIndex - 1] *= -1;
        }
        
        return duplicates;
    }
}