// Alternate approach using Binary Search - https://www.youtube.com/watch?v=LHfS7bA6dCA
    
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 1, end = arr.length - 1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if((arr[mid - 1] < arr[mid]) && (arr[mid] > arr[mid + 1])) {
                return mid;
            }
            
            else if((arr[mid - 1] < arr[mid]) && (arr[mid] < arr[mid + 1])) {
                start = mid + 1;
            }
            
            else {
                end = mid - 1;
            }
        }
        
        return -1;
    }
}
