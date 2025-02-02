package com.tutorial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.tutorial.DSA.LargestInArray;
class LargestInArrayTest {
	LargestInArray largeElement = new LargestInArray();
	@Test
	void testLargestInArray() {
		int expectedInput = 2200;
		int[] actualInput = {12, 45, 2, 31, 89, 90, 33, 76, 2200, 560, 999, 1};
		assertEquals(expectedInput, largeElement.findLargestElement(actualInput));
	}
}
