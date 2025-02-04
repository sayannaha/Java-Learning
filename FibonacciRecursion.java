package com.tutorial.DSA;
public class FibonacciRecursion {
	/*
	 * Description: Method to get the next Fibonacci Number in the series
	 * Parameter: Integer
	 * Return: Integer
	 */
	public int findNextInFibo(int num) {
		if (num < 2) {
			return num;
		}
		return (findNextInFibo(num - 1) + findNextInFibo(num - 2));
	}
}