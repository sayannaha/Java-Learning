package com.tutorial.DSA;
/*
 * Selection sort is a simple, in-place comparison sorting algorithm 
 * that repeatedly selects the smallest (or largest) element 
 * from the unsorted portion of a list 
 * and moves it to the beginning, 
 * resulting in a sorted sublist that grows with each iteration.
 */
public class SelectionSort {
	/*
	 * Description: Method to perform Selection Sort
	 * Parameter: Array of Integers
	 * Return: Array of Integers
	 */
	public int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}