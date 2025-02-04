package com.tutorial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.tutorial.DSA.FactorialOfNumber;
class FactorialOfNumberTest {
	FactorialOfNumber factTest = new FactorialOfNumber();
	@Test
	void testFact() {
		int inputElement = 4;
		int expectedOutput = 24;
		assertEquals(expectedOutput, factTest.factWithoutUsingRecursion(inputElement));
		assertEquals(expectedOutput, factTest.factUsingRecursion(inputElement));
	}
}