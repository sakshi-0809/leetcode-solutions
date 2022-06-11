class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        
        while(start < end) {
            int mid = start + (end - start) / 2;
  
            // this means we are still in the increasing area of the array
    
            if(arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }

            // this means we are in the decreasing area of the array
    
            else {
                end = mid;
            }
        }

        return start;
    }
}
