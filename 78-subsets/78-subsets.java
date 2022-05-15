class Solution {
    public void helper(int index, int[] nums, List<Integer> current, List<List<Integer>> answer) {
        if(index == nums.length) {
            answer.add(new ArrayList<Integer>(current));
            return;
        }
        
        helper(index + 1, nums, new ArrayList(current), answer);
        
        current.add(nums[index]);
        
        helper(index + 1, nums, current, answer);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        
        helper(0, nums, new ArrayList<Integer>(), answer);
            
        return answer;
    }
}