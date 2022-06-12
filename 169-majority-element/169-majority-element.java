// Solution using Hash Map

// public int majorityElement(int[] nums) {
//     int majorityCount = nums.length / 2;

//     HashMap<Integer, Integer> freq = new HashMap<>();

//     for(int i = 0; i < nums.length; i++) {
//         freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
//     }

//     for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
//         if(entry.getValue() > majorityCount)
//             return entry.getKey();
//     }

//     return -1;
// }

class Solution {
    public int majorityElement(int[] nums) {
        int majorityCount = nums.length / 2;
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            if(entry.getValue() > majorityCount)
                return entry.getKey();
        }
        
        return -1;
    }
}