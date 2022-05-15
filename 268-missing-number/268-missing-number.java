// Similar Question and Logic -> "448. Find All Numbers Disappeared in an Array"

class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        
        while(i < nums.length) {
            if(nums[i] != i && nums[i] < nums.length && nums[nums[i]] != nums[i]) {
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }   
            else {
                i++;
            }
        }
        
        for(i = 0; i < nums.length; i++) {
            if(nums[i] != i)
                return i;
        }
        
        // refer to test case 2
        // when all numbers [0 to n-1] are present, then the absent number will be n i.e., nums.length
        return nums.length;
    }
}