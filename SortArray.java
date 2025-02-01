package com.tutorial.DSA;

import java.util.Scanner;

public class SortArray {

	/*
	 * Description: Method to Sort an Array
	 * Parameters: Array of number
	 * Return: Array of number
	 */
	private static int[] sortMyArray(int[] arr) {
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
	
	/*
	 * Description: Main Method
	 */
	public static void main(String[] args) {
		int[] arr = {12, 34, 6, 78, 90, 32, 21, 14}; //change the array according to your wants :-)
		System.out.print("Before Sorting the array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < (arr.length - 1)) {
				System.out.print(", ");
			} else {
				System.out.println("");
			}
		}
		sortMyArray(arr);
		System.out.print("After Sorting the array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < (arr.length - 1)) {
				System.out.print(", ");
			}
		}
	}
}
