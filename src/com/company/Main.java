package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[5];

        int[] arr2 = {56,14,20,35,89};

        int[][] matrix = {{10,11,15,17},
                          {22,25,28,29},
                          {33,32,36,38}};
    }

    public static int maxVal(int[][] matrix){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] >max)
                    max = matrix[row][col];
            }
        }
        return max;
    }
}
