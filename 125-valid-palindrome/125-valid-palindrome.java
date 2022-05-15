class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
            return true;
        
        int start = 0, end = s.length() - 1;
        
        while(start < end) {
            // not using while, hence it will skip only the first non alpha-numeric character
            // e.g. ", " will only skip , and not " "
            
            if(!Character.isLetterOrDigit(s.charAt(start)))
                start++;
            
            // that's why using else if and else conditions, so that in one iteration if we find a non alpha-numeric
            // once it gets skipped we don't compare, just move to the next iteration 
            
            else if(!Character.isLetterOrDigit(s.charAt(end)))
                end--;
            
            
            else if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            
            else {
                start++;
                end--;
            }
        }
        
        return true;
    }
}