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
    
    // Alternate approach using Binary Search - https://www.youtube.com/watch?v=LHfS7bA6dCA
    
    // int start = 0, end = arr.length - 1;
        
    // while(start < end) {
    //    int mid = start + (end - start) / 2;

    // this means we are still in the increasing area of the array
    
    //    if(arr[mid] < arr[mid + 1]) {
    //        start = mid + 1
    //    }

    // this means we are in the decreasing area of the array
    
    //    else {
    //        end = mid - 1;
    //    }
    // }

    // return start;
}