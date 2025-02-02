package com.tutorial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.tutorial.DSA.ArrayRotation;
class ArrayRotationTest {
	ArrayRotation arr = new ArrayRotation();
	@Test
	void test() {
		int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8};
		int index = 3;
		int[] outputArray = {4, 5, 6, 7, 8, 1, 2, 3};
		assertEquals(outputArray, arr.rotateArray(inputArray, index));
	}
}