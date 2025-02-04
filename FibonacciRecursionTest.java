package com.tutorial;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.tutorial.DSA.FibonacciRecursion;
class FibonacciRecursionTest {
	FibonacciRecursion fibo = new FibonacciRecursion();
	@Test
	void testFibonacci() {
		int[] expectedOutput = {0, 1, 1, 2, 3, 5, 8};
		int limit = 7;
		int[] inputArray = new int[limit];
		for (int i = 1; i <= 6; i++) {
			inputArray[i] = fibo.findNextInFibo(i);
		}
		assertEquals(expectedOutput, inputArray);
	}
}