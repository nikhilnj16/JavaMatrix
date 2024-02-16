package com.bridgelabz.matrix;

public class TriangularMatrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {1,2,3}, {1,2,3}};
//        int[][] b = {{1,2,3}, {1,2,3}, {1,2,3}};

        int rows, cols;
        rows = a.length;
        cols = a[0].length;

        //Lower Triangular matrix
        System.out.println("Lower triangular matrix: ");
        if (rows == cols){
            for(int i = 0; i<rows; i++){
                for(int j = 0; j<cols; j++){
                    if(j>i){
                        a[i][j] = 0;
                        System.out.print(a[i][j] + " ");
                    }
                    else {
                        System.out.print(a[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }

        //Upper Triangular matrix
        System.out.println("Upper triangular matrix: ");
        int[][] b = {{1,2,3}, {1,2,3}, {1,2,3}};
        if (rows == cols){
            for(int i = 0; i<rows; i++){
                for(int j = 0; j<cols; j++){
                    if(i>j){
                        b[i][j] = 0;
                        System.out.print(b[i][j] + " ");
                    }
                    else {
                        System.out.print(b[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
