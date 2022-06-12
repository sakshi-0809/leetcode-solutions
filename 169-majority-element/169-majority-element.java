class Solution {
    // Moore's Voting Algorithm
    
    public int majorityElement(int[] nums) {
        int count = 0, resultElement = 0;
        
        for(int currentElement: nums) {
            if(count == 0)
                resultElement = currentElement;
            
            if(resultElement == currentElement)
                count++;
            else
                count--;
        }
        
        return resultElement;
    }
}