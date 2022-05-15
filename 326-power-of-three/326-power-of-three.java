class Solution {
    public boolean helper(int n, int remainder) {
        if(n <= 0)
            return false;
        
        if(n == 1 && remainder == 0)
            return true;
        
        if(remainder == 1 || remainder == 2)
            return false;
        
        return helper(n / 3, n % 3);
    }
    
    public boolean isPowerOfThree(int n) {
        return helper(n, 0);
    }
}