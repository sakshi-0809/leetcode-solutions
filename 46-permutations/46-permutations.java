class Solution {
    List<List<Integer>> result = new ArrayList<>();   
    
    public void helper(int[] nums, List<Integer> current, Set<Integer> visited) {
        if(current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(!visited.contains(nums[i])) {
                current.add(nums[i]);
                visited.add(nums[i]);
                
                helper(nums, current, visited);
                
                current.remove(current.size() - 1);
                visited.remove(nums[i]);
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) { 
        helper(nums, new ArrayList<>(), new HashSet<>());
            
        return result;
    }
}