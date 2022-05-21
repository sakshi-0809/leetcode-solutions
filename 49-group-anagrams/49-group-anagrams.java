class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramGroup = new HashMap<>();
        
        List<List<String>> result = new ArrayList<>();
        
        for(int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            
            Arrays.sort(charArray);
            
            String sorted = new String(charArray);
            
            if(anagramGroup.containsKey(sorted)) {
                List<String> current = anagramGroup.get(sorted);
                
                current.add(strs[i]);
                
                anagramGroup.put(sorted, current); 
            } else {
                List<String> current = new ArrayList<>();
                
                current.add(strs[i]);
                
                anagramGroup.put(sorted, current);
            }
        }
        
        for(Map.Entry<String, List<String>> e : anagramGroup.entrySet()) {
            result.add(e.getValue());
        }
        
        return result;
    }
}