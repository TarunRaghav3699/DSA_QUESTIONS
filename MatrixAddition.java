class MatrixAddition {
    public static void main(String args[]) {
        int[][] result = new int[row][column]
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matrix2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

        int row = matrix1.length;
        int column = matrix2[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                add[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

    }
}
