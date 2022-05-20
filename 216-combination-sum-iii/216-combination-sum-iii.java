class Solution {
    public void backtrack(int k, int target, int total, int i, List<Integer> current
                                     , List<List<Integer>> result) {
        
        if(total == target) {
            if(current.size() == k)
                result.add(new ArrayList<>(current));
            
            return;
        }
        
        // i is a pointer to which element from candidates can we choose right now
        // so if i >= candidates then we obv can't choose any more element to add to the combination
        
        if(i > 9 || total > target || current.size() > k) {
            return;
        }
        
        // include the ith element and recursively call
        
        current.add(0, i);
        
        backtrack(k, target, total + i, i + 1, current, result);
        
        // not include the ith element and recursively call
        
        current.remove(0);
        
        backtrack(k, target, total, i + 1, current, result);
        
    }
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        
        // current array list storing the combination
        
        List<Integer> current = new LinkedList<>();

        backtrack(k, n, 0, 1, current, result);
        
        return result;
    }
}