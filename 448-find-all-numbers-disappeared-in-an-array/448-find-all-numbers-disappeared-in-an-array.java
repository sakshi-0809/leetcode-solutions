class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0;
        
        while(i < nums.length) {
            if(nums[i] != i + 1 && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        
        for(i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1) {
                result.add(i+1);
            }
        }
        
        return result;
    }
}