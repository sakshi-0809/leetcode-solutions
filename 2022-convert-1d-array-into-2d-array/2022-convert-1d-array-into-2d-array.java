class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        
        int row = 0, column = 0;
        
        // because if number of elements in array aren't exactly m * n
        // then 2D array will either be left empty at some places, or 1D array will contain extra remaining elements
        
        // in both cases we have to return an empty array
        
        if(original.length != m * n) 
            return new int[0][0];
        
        for(int i = 0; i < original.length; i++) {
            if(column < n) {
                result[row][column] = original[i];
                column++;
            }
            else {
                column = 0;
                result[++row][column] = original[i];
                column++;
            } 
        }
        
        return result;
    }
}