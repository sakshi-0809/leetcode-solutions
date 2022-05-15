class Solution {
    public boolean isPalindrome(String s) {
        String input = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                input += Character.toLowerCase(s.charAt(i));
            }
        }
        
        int start = 0, end = input.length() - 1;
        
        while(start < end) {
            if(input.charAt(start) != input.charAt(end))
                return false;
            
            start++;
            end--;
        }
        
        return true;
    }
}