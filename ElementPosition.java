package com.tutorial.DSA;
//Find the First and Last Position of an Element in a Sorted Array
public class ElementPosition {
	/*
	 * Description: Method to find First and Last instance of an element in an array
	 * Parameters: Array of Integers, Target
	 * Return: Array of Integers
	 */
	public int[] getElementPosition(int[] arr, int target) {
		int[] retVal = {-1, -1};
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				retVal[temp] = i;
				temp++;
				break;
			}
		}
		for (int j = arr.length - 1; j >= 0; j--) {
			if (arr[j] == target) {
				retVal[temp] = j;
				temp++;
				break;
			}
		}
		return retVal;
	}
}