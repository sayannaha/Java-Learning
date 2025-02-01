package com.tutorial.DSA;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class SortArrayTest {
	SortArray arr = new SortArray();
	@Test
	void test() {
		int[] inputArray = {5, 4, 3, 2, 1};
		int[] expectedArray = {1, 2, 3, 4, 5};
		assertEquals(expectedArray, arr.sortMyArray(inputArray));
	}
}