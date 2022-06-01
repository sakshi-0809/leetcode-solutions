class Solution {
    public void reverse(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }    
    }
    
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
            
        reverse(digits);
        
        for(int i = 0; i < digits.length; i++) {
            if(digits[i] != 9) {
                digits[i] += 1;
                break;
            } else {
                digits[i] = 0;
            }
        }
        
        if(digits[digits.length - 1] == 0) {
            digits = new int[digits.length + 1];
            
            digits[digits.length - 1] = 1;
        }
        
        reverse(digits);
        
        return digits;
    }
}