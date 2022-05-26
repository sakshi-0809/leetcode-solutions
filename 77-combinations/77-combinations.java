class Solution {
    public void helper(int n, int k, int currentIndex, List<Integer> current, List<List<Integer>> result) {
        if(current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        if(currentIndex > n) {
            return;
        }
        
        current.add(currentIndex);
        
        helper(n, k, currentIndex + 1, current, result);
        
        current.remove(current.size() - 1);
        
        helper(n, k, currentIndex + 1, current, result);
    }
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        
        helper(n, k, 1, new ArrayList<Integer>(), result);
        
        return result;
    }
}