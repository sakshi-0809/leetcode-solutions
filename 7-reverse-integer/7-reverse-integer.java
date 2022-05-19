class Solution {
    public int reverse(int x) {
        int reverseInt = 0;
        
        while(x != 0) {
            int remainder = x % 10;
            
            if (reverseInt > Integer.MAX_VALUE / 10 || reverseInt < Integer.MIN_VALUE / 10) {
                return 0;
            }
            
            reverseInt = (reverseInt * 10) + remainder;
            x = x / 10;
        }
        
        return reverseInt;
    }
}