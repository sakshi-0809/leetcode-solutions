class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> frequencies = new HashMap<>();
        
        String result = "";
        
        for(int i = 0; i < s.length(); i++) {
            frequencies.put(s.charAt(i), frequencies.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<>((char1, char2) -> frequencies.get(char2) - frequencies.get(char1));
        
        pq.addAll(frequencies.keySet());
        
        while(pq.size() > 0) {
            Character current = pq.poll();
            int frequency = frequencies.get(current);
            
            for(int i = 0; i < frequency; i++) {
                result += current;
            }
        }
        
        return result;
    }
}