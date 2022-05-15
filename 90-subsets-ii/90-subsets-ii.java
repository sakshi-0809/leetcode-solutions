class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
                                                           
        List<List<Integer>> answer = new ArrayList<>();
        
        // adding the first empty set i.e. []
        
        answer.add(new ArrayList<>());
                                                           
        int start = 0, end = 0;                                                 
        
        for(int i = 0; i < nums.length; i++) {
            start = 0;
            
            if(i > 0 && nums[i] == nums[i - 1]) {
                start = end + 1;
            }
            
            end = answer.size() - 1;
            
            for(int j = start; j <= end; j++) {
                List<Integer> internal = new ArrayList<>(answer.get(j));
                internal.add(nums[i]);
                answer.add(internal);
            }
        }
        
        return answer;
    }
}