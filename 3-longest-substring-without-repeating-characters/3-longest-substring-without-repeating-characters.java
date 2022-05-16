class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;
        
        int start = 0, end = 1;
        int subsetLength = 1;
        
        while(end < s.length()) {
            for(int j = end - 1; j >= start; j--) {
                if(s.charAt(end) == s.charAt(j)) {
                    start = j + 1;
                    break;
                }
            }
            
            if(end - start + 1 > subsetLength) 
                subsetLength = end - start + 1;
            
            end++;
        }
        
        return subsetLength;
    }
}