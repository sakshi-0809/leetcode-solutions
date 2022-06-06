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
        
        List<Integer> result = new ArrayList<>();
        
        for(int i = bucket.length - 1; i >= 0 && result.size() < k; i--){
            if (bucket[i] == null) continue;
            
            if (bucket[i].size() <= k - result.size())
                result.addAll(bucket[i]);
            
            else 
                result.addAll(bucket[i].subList(0, k - result.size()));
        }
        
        int[] topK = new int[k];
        
        for(int i = 0; i< k; i++)
        {
            topK[i] = result.get(i);
        }
        
        return topK;
    }
}