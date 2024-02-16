package com.bridgelabz.matrix;

public class MatrixAddition {
    //Addition of two matrix
    public static void main(String[] args) {
        int[][] a = {{1,1,1}, {2,2,2}, {3,3,3}};
        int[][] b = {{1,1,1}, {2,2,2}, {3,3,3}};

        int[][] c = new int[3][3];
        System.out.println("Matrix c: ");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        int[][] d = new int[3][3];
        System.out.println("Matrix d: ");
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                for(int k = 0; k<3; k++){
                    d[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }

    }

}
