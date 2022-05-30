class Solution {
    public boolean isValid(String s) {
        int index = 0;
        
        Stack<Character> parenStack = new Stack<>();
        
        while(index < s.length()) {
            char current = s.charAt(index);
            
            if(current == '(' || current == '{' || current == '[') {
                parenStack.push(current);
            }
            
            else if(parenStack.empty() != true) {
                if(current == ')' && parenStack.peek() == '(') {
                    parenStack.pop();
                }
                
                else if(current == '}' && parenStack.peek() == '{') {
                    parenStack.pop();
                }
                
                else if(current == ']' && parenStack.peek() == '[') {
                    parenStack.pop();
                }
                
                else {
                    return false;
                }
            } 
            
            else {
                return false;
            }
            
            index++;
        }
        
        if(parenStack.empty() == false || index < s.length()) 
            return false;
        
        return true;
    }
}