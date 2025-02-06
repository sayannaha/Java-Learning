package com.tutorial;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.tutorial.DSA.SelectionSort;
class SelectionSortTest {
	SelectionSort sort = new SelectionSort();
	@Test
	void testSelectionSort() {
		int[] inputArray = {99, 57, 122, 34, 12, 9, 1000, 790};
		int[] outputArray = {9, 12, 34, 57, 99, 122, 790, 1000};
		assertEquals(outputArray, sort.selectionSort(inputArray));;
	}
}