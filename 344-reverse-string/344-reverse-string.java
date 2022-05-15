// Recursive approach
// swap the start and end element of the array
// then call the function with start + 1 and end - 1

// e.g. [h, e, l, l, o]
// swap h and o i.e., [o, e, l, l, h]
// call array with start = 1 and end = 3 so next time e and l get swapped, and so on

class Solution {
    public void helper(char[] str, int start, int end) {
        if(start >= end)
            return;
        
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
        
        helper(str, start + 1, end - 1);
    }
    
    public void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }
}