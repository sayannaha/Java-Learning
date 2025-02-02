package com.tutorial.DSA;
//Java Array Program For Array Rotation
public class ArrayRotation {
	/*
	 * Description: Method to Rotate an Array
	 * Return: Array of Integer
	 * Parameter: Array of Integer, Point to reverse
	 */
	public int[] rotateArray(int[] arr, int d) {
		int temp[] = new int[arr.length];
		int k = 0;
		for (int i = d; i < arr.length; i++) {
            temp[k] = arr[i];
            k++;
        }
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        return arr;
	}
}