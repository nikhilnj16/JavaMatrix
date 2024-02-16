package com.bridgelabz.matrix;

public class IdentityMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,0,0},{0,1,0},{0,0,1}};
        int rows, cols;
        boolean flag = true;
        rows = matrix.length;
        cols = matrix[0].length;

        if (rows == cols) {
            System.out.println("Matrix is not square matrix");
        }
        else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i == j && matrix[i][j] != 1) {
                        flag = false;
                    }
                    if (i != j && matrix[i][j] != 0) {
                        flag = false;
                    }
                }
            }
        }
        if(flag){
            System.out.println("Given matrix is identity matrix");
        }else{
            System.out.println("Given matrix is not identity matrix");
        }
    }
}
