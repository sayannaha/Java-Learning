package com.tutorial.DSA;
//Java Class to Understand Recursion
public class FactorialOfNumber {
	/*
	 * Description: Method to find the Factorial of a number
	 * Parameter: Integer
	 * Return: Integer
	 */
	public int factWithoutUsingRecursion(int num) {
		if (num < 2) {
			return num;
		}
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
	/*
	 * Description: Method to find the Factorial of a number using Recursion
	 * Parameter: Integer
	 * Return: Integer
	 */
	public int factUsingRecursion(int num) {
		if (num < 2) {
			return num;
		}
		return num * factUsingRecursion(num - 1);
	}
}