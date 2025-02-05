package com.tutorial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.tutorial.DSA.SearchMyElement;
class SearchMyElementTest {
	SearchMyElement search = new SearchMyElement();
	@Test
	void testSearchElementInArray() {
		int element = 10;
		int[] inputArray = {0, 1, 4, 6, 10, 90, 34};
		int expectedOutput = 4;
		assertEquals(expectedOutput, search.searchMyElementInArray(inputArray, element));
	}
}