class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)
            return 0;
        
        int hayLen = haystack.length();
        
        int nedLen = needle.length();
        
        if(hayLen < nedLen)
            return -1;
        
        for(int i = 0; i <= hayLen - nedLen; i++) {
            int j;
            
            for(j = 0; j < nedLen; j++) {
                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            
            // found the needle, then j = nedLen
            
            if(j == nedLen)
                return i;
            
            // did not find the needle, simply broke out of the inner loop cause of the if condition
            
            // then just let the outer loop continue
        }
        
        // if we come out of this loop without returning, then obv we didn't find the needle
        
        return -1;
    }
}