package com.tutorial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.tutorial.DSA.ComputeSumArray;
class ComputeSumArrayTest {
	ComputeSumArray testCompute = new ComputeSumArray();
	@Test
	void testComputeSum() {
		int expectedOutput = 100;
		int[] inputArray = {20, 25, 25, 30};
		assertEquals(expectedOutput, testCompute.computeSumOfArray(inputArray));
	}

}
