class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false, firstCol = false;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        if (i == 0) firstRow = true;
                        if (j == 0) firstCol = true;
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }
                }
            }
            
            for(int i = 1; i < matrix.length; i++) {
                for(int j = 1; j < matrix[0].length; j++) {
                    if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
            if (firstRow) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[0][j] = 0;
                }
            }
            if (firstCol) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][0] = 0;
                }
            }
            }
    public static void main(String[] args) {
        int[][] matrix  = {{0, 2, 3, 4}, {5, 6, 9, 7}, {8, 8, 9, 10}};
        Solution s = new Solution();
        s.setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}