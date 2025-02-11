package com.tutorial;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
class MockTest {
	List arr = spy(ArrayList.class);
	@Test
	void test() {
		assertEquals(0, arr.size());
		arr.add(100);
		arr.add(200);
		assertEquals(2, arr.size());
	}
}