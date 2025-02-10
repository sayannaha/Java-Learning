package com.tutorial.DSA;
/*
 * Write a Java program that takes a two-dimensional array (matrix) of integers 
 * and prints its elements in spiral order. 
 * In spiral order, you start at the top‐left corner 
 * and traverse the first row from left to right, 
 * then the last column from top to bottom, 
 * then the last row from right to left, 
 * and finally the first column from bottom to top. 
 * Continue this process with the inner submatrix 
 * until all elements have been printed
 */
public class SpiralMatrixTraversal {
    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0]; 
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];
        int index = 0;        
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;        
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                result[index++] = matrix[top][j];
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[index++] = matrix[i][right];
            }
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result[index++] = matrix[bottom][j];
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[index++] = matrix[i][left];
                }
                left++;
            }
        }        
        return result;
    }
}