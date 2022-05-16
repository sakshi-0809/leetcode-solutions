class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        
        int start = 0, end = 0;
        int subsetLength = 1;
        
        HashMap<Character, Integer> occurence = new HashMap<>();
        
        
        while(end < s.length()) {
            if(occurence.containsKey(s.charAt(end))) {
                if(occurence.get(s.charAt(end)) + 1 > start)
                    start = occurence.get(s.charAt(end)) + 1;
            }
                
            occurence.put(s.charAt(end), end);
            
            if(end - start + 1 > subsetLength) 
                subsetLength = end - start + 1;
            
            end++;
        }
        
        return subsetLength;
    }
}