package com.bridgelabz.matrix;

public class MatrixFrequency {
    public static void main(String[] args) {
        int[][] a = {{4,2,3}, {3,7,6}, {9,5,6}};
        int rows, cols, countEven, countOdd;
        rows = a.length;
        cols = a.length;
        countEven=0;
        countOdd=0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(a[i][j]%2==0){
                   countEven+=1;
                }
                else{
                    countOdd+=1;
                }
            }
        }
        System.out.println("No of even elements : " + countEven);
        System.out.println("No of odd elements : " + countOdd);
    }
}
