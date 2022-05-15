class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> elements = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(!elements.contains(nums[i])) {
                elements.add(nums[i]);
            } else {
                return true;
            }
        }
        
        return false;
    }
}