class Solution {
    public void backtrack(int[] candidates, int target, int total, int i, List<Integer> current
                                     , List<List<Integer>> result) {
        
        if(total == target) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        // i is a pointer to which element from candidates can we choose right now
        // so if i >= candidates then we obv can't choose any more element to add to the combination
        
        if(i >= candidates.length || total > target) {
            return;
        }
        
        // include the ith element and recursively call
        
        current.add(0, candidates[i]);
        
        backtrack(candidates, target, total + candidates[i], i, current, result);
        
        // not include the ith element and recursively call
        
        current.remove(0);
        
        backtrack(candidates, target, total, i + 1, current, result);
        
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        // current array list storing the combination
        
        List<Integer> current = new LinkedList<>();

        backtrack(candidates, target, 0, 0, current, result);
        
        return result;
    }
}