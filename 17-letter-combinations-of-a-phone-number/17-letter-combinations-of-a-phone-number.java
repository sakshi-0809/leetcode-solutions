class Solution {
    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<String>();
        }
        
        HashMap<Character, String> map = new HashMap<>();
        
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        return helper(0, map, "", digits);
    }

    private static ArrayList<String> helper(int i, HashMap<Character, String> map, String current, String digits) {
        if (current.length() == digits.length()) {
            ArrayList<String> result = new ArrayList<>();
            result.add(current);
            return result;
        }
        
        ArrayList<String> result = new ArrayList<>();

        for (char c: map.get(digits.charAt(i)).toCharArray()) {
            result.addAll(helper(i + 1, map, current + c, digits));
        }
        
        return result;
    }
    
}