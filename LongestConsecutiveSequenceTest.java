package com.tutorial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.tutorial.DSA.LongestConsecutiveSequence;
class LongestConsecutiveSequenceTest {
	LongestConsecutiveSequence seq = new LongestConsecutiveSequence();
	@Test
	void test() {
		int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
		int expectedValue = 9;
		assertEquals(expectedValue, seq.longestConsecutive(arr));
	}
}