class Solution {
    // Solution using Bucket Sort
    
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        
        for (int n: nums) {
            frequencies.put(n, frequencies.getOrDefault(n, 0) + 1);
        }
        
        List<Integer> bucket[] = new ArrayList[nums.length + 1];
        
        for(int key : frequencies.keySet()){
            int freq = frequencies.get(key);
            
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            
            bucket[freq].add(key);
        }
        
        int result[] = new int[k];
        
        int index = 0;
        
        for(int i = bucket.length - 1; i >= 0; i--){
            if(bucket[i] != null){
                for(int val : bucket[i]){
                    result[index++] = val;
                    
                    if(index == k) return result;
                }
            }
        }
        
        return result;
    }
}