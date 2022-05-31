class Solution {
    List<List<Integer>> result = new ArrayList<>();   
    
    public void helper(int[] nums, List<Integer> current, boolean[] visited) {
        if(current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(visited[i]) 
                continue;
            
            // skipping the duplicate element
            
            // in [1,1,2] we want to include 1 at index 1 when we are finding permutations for 1 at index 0
            // hence we skip it only when visited[0] is true
            
            // thats why checking for visited[i-1] == true
            
            if(i != 0 && nums[i] == nums[i - 1] && visited[i - 1])
                continue;

            current.add(nums[i]);
            visited[i] = true;

            helper(nums, current, visited);

            current.remove(current.size() - 1);
            visited[i] = false;  
        }
    }
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        
        helper(nums, new ArrayList<>(), new boolean[nums.length]);
            
        return result;
    }
}