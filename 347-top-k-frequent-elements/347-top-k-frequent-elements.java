class Solution {
    // Solution using Max Heap
    
     public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        // key in hashmap stores the number, and value stores the frequency of the number
         
        for(int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) +1);
        }
        
        // x and y are 2 separate objects in the queue, 
        // compare(y[0], x[0]) means that we want to sort the queue in descending order based on the first element of the object
         
        // the object will be an int array, with [0] = value from hashmap i.e. the frequence 
        // and [1] = key from the hashmap
         
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y) -> (Integer.compare(y[0],x[0])));
        
        for(Map.Entry<Integer, Integer> e : freqMap.entrySet()) {
            int[] newNum = {e.getValue(), e.getKey()};
            pq.add(newNum);
        }
        
        
        int[] result = new int[k];
        
        // popping the first k elements of the priority queue
         
        for( int i=0; i<k;i++) {
            result[i] = pq.poll()[1];
        }
        
        return result;  
    }
}