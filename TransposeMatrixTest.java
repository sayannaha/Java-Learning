package com.tutorial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.tutorial.DSA.TransposeMatrix;
class TransposeMatrixTest {
	TransposeMatrix tra = new TransposeMatrix();
	@Test
	void testTranspose() {
		int[][] inputMatrix = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
		int[][] outputMatrix = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
		assertEquals(outputMatrix, tra.transposeMatrix(inputMatrix));
	}
}