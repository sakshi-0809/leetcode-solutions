class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        if(s.equals(t))
            return true;
        
        HashMap<Character, Integer> frequency = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            frequency.put(s.charAt(i), frequency.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for(int i = 0; i < t.length(); i++) {
            frequency.put(t.charAt(i), frequency.getOrDefault(t.charAt(i), 0) - 1);
            
            if(frequency.get(t.charAt(i)) < 0)
                return false;
        }
        
        return true;
    }
}