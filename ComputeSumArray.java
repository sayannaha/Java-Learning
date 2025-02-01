package com.tutorial.DSA;
//Java Program to Compute the Sum of Array Elements
public class ComputeSumArray {
	/*
	 * Description: Method to find out the sum of the Elements of Array
	 * Parameter: Array of Numbers
	 * Return: Integer
	 */
	public int computeSumOfArray(int[] arr) {
		if (arr.length < 1) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
