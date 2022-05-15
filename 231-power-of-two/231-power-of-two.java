class Solution {
    public boolean helper(int n, int remainder) {
        if(n <= 0)
            return false;
        
        if(n == 1 && remainder == 0)
            return true;
        
        if(remainder == 1)
            return false;
        
        return helper(n / 2, n % 2);
    }
    
    public boolean isPowerOfTwo(int n) {
        return helper(n, 0);
    }
}