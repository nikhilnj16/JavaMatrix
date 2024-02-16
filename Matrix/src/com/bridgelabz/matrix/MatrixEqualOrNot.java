package com.bridgelabz.matrix;

public class MatrixEqualOrNot {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] b = {{1,2,3}, {4,5,6}, {7,8,9}};

        int rows1, rows2, cols1, cols2;
        boolean flag = true;
        rows1 = a.length;
        rows2 = b.length;
        cols1 = a[0].length;
        cols2 = a[0].length;

        if(rows1 != rows2 || cols1 != cols2){
            System.out.println("Matrices are not same");
        }

        for(int i=0; i<rows1; i++){
            for(int j=0; j<cols1; j++){
                if(a[i][j] != b[i][j]){
                    flag = false;
                }
            }
        }
        if(flag){
            System.out.println("Matrices are same");
        }
        else{
            System.out.println("Matrices are not same");
        }
    }
}
