package com.bridgelabz.matrix;

public class MatrixSumOfRowCol {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{3,2,5},{3,6,2}};
        int row, col, sumRow, sumCol;
        row = matrix.length;
        col = matrix[0].length;

        for(int i = 0; i<row; i++ ){
            sumRow = 0;
            for(int j = 0; j<col; j++ ){
                sumRow += matrix[i][j];
            }
            System.out.println("Sum of row" + (i+1) + " : " + sumRow);
        }

        for(int i = 0; i<col; i++ ){
            sumCol = 0;
            for(int j = 0; j<row; j++ ){
                sumCol += matrix[j][i];
            }
            System.out.println("Sum of col" + (i+1) +" : " + sumCol);
        }
    }
}
