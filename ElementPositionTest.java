package com.tutorial;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.tutorial.DSA.ElementPosition;
class ElementPositionTest {
	ElementPosition element = new ElementPosition();
	@Test
	void testgetElementPosition() {
		int[] inputArray = {5, 7, 7, 8, 8, 10};
		int target = 7;
		int[] expectedValue = {1, 2};
		assertEquals(expectedValue, element.getElementPosition(inputArray, target));
	}
}