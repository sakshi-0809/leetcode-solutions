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
        
        digits[0] += 1;
        
        if(digits[0] <= 9) {
            reverse(digits);
            
            return digits;
        }
        
        int i = 1, carry = 1;
        
        digits[0] = 0;
        
        while(i < digits.length) {
            digits[i] += carry;
            
            if(digits[i] > 9) {
                digits[i] = 0;
                carry = 1;
            }
            
            else
                carry = 0;
            
            i++;
        }
        
        if(carry == 1) {
            result = Arrays.copyOf(digits, digits.length + 1);
            
            result[digits.length] = 1;
            
            reverse(result);
            
            return result;
        }
        
        reverse(digits);
        
        return digits;
    }
}