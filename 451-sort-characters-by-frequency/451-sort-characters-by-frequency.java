class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> frequencies = new HashMap<>();
        
        for(char current: s.toCharArray()) {
            frequencies.put(current, frequencies.getOrDefault(current, 0) + 1);
        }
        
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
            (ch1, ch2) -> frequencies.get(ch2) - frequencies.get(ch1));
        
        maxHeap.addAll(frequencies.keySet());
        
        StringBuilder result = new StringBuilder();
        
        while(!maxHeap.isEmpty()) {
            char current = maxHeap.poll();
            
            int frequency = frequencies.get(current);
            
            for(int i = 0; i < frequency; i++) {
                result.append(current);
            }
        }
        
        return result.toString();
    }
}