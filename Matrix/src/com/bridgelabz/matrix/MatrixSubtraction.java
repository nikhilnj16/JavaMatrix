package com.bridgelabz.matrix;

public class MatrixSubtraction {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] b = {{1,2,3},{1,2,3},{1,2,3}};

        int[][] c = new int[3][3];
        int rows = a.length;
        int cols = a[0].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols ; j++){
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
