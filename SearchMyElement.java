package com.tutorial.DSA;
//Program to find the index of a particular element in an array
public class SearchMyElement {
	/*
	 * Description: Method to find the index of a particular element in an array
	 * Parameter: Array of integer, element
	 * Return: integer
	 */
	public int searchMyElementInArray(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}
		return -1;
	}
}