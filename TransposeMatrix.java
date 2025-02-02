package com.tutorial.DSA;
//Java Program to Find the tranpose of Matrix
public class TransposeMatrix {
	/*
	 * Description: Method to find the transpose of a matrix
	 * Parameter: 2D Array of Integer
	 * Return: 2D Array of Integer
	 */
	public int[][] transposeMatrix(int[][] arr) {
		int rows = arr.length;
        int cols = arr[0].length;
        int[][] transposeMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = arr[i][j];
            }
        }
        return transposeMatrix;
	}
}