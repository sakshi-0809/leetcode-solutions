class Solution {
    List<List<Integer>> result = new ArrayList<>();   
    
    public void helper(int[] nums, List<Integer> current, boolean[] visited) {
        if(current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(!visited[i]) {
                current.add(nums[i]);
                visited[i] = true;
                
                helper(nums, current, visited);
                
                current.remove(current.size() - 1);
                visited[i] = false;
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) { 
        helper(nums, new ArrayList<>(), new boolean[nums.length]);
            
        return result;
    }
}