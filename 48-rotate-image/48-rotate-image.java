class Solution {
    public void rotate(int[][] matrix) {
        // taking transpose of the matrix
        
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // flipping or reversing each row of the transpose
        
        for(int i = 0; i < matrix.length; i++) {
            int colLen = matrix[0].length;
                
            for(int j = 0; j < colLen / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][colLen - j - 1];
                matrix[i][colLen - j - 1] = temp;
            }
        }
    }
}