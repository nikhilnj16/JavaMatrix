package com.bridgelabz.matrix;

public class MatrixTranspose {
    public static void main(String[] args) {
        int row, col, sumRow, sumCol;
        int[][] matrix = {{1,4,2},{9,4,2},{4,8,3}};
        row = matrix.length;
        col = matrix[0].length;

        int[][] transpose = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
