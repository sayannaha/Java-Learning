package com.tutorial;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
class SpyTest {
	List arr = mock(ArrayList.class);
	@Test
	void test() {
		assertEquals(0, arr.size());
		arr.add(100);
		arr.add(200);
		assertEquals(0, arr.size());
	}
}