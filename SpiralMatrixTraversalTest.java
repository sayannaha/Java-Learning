package com.tutorial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.tutorial.DSA.SpiralMatrixTraversal;
class SpiralMatrixTraversalTest {
	SpiralMatrixTraversal testing = new SpiralMatrixTraversal();
	@Test
	void test() {
        int[][] inputMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
        int[] expectedOutput = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        assertEquals(expectedOutput, testing.spiralOrder(inputMatrix));
	}
}