class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];
        
        // moving slow pointer by 1 and fast pointer by 2, until they collide
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        // once they collide, move fast back to 1st index, then move both slow and fast by 1
        fast = nums[0];
        
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }
}