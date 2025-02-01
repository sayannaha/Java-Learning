package com.tutorial.DSA;
//Java Program to Find the Largest Element in Array
public class LargestInArray {
	/*
	 * Description: Method to Find the Largest Element in Array
	 * Parameter: Array of Numbers
	 * Return: Integer
	 */
	public int findLargestElement(int[] arr) {
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
}