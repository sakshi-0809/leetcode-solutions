class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder("");
        
        // iterate the strings from the end 
        
        int i = a.length()-1, j = b.length()-1;
        
        int carry = 0, sum = 0;
        
        while(i >= 0 || j >= 0){
            
            sum = carry; 
            
            if(j >= 0){
                // charAt(i) - '0' will return the integer value
                
                sum = sum + b.charAt(j--) - '0';
            }
            
            if(i >= 0){
                sum = sum + a.charAt(i--) - '0';
            }
            
            // sum will have an integer value e.g., i = 1, j = 1 then sum = 2
            // converting it to binary before appending
            
            sb.append(sum % 2);
            
            // calculating carry for the next iteration
            
            carry = sum / 2;
        }
        
        if(carry == 1){
            sb.append(carry);
        }
        
        // the result string was built backwards, hence reversing it before returning
        // used .toString() because the function needs to return a string
        
        return sb.reverse().toString();
    }
}