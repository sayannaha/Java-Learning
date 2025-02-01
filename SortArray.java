package com.tutorial.DSA;
import java.util.Scanner;
public class SortArray {
	/*
	 * Description: Method to Sort an Array
	 * Parameters: Array of number
	 * Return: Array of number
	 */
	public int[] sortMyArray(int[] arr) {
		if (arr.length < 1) {
			return null;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
