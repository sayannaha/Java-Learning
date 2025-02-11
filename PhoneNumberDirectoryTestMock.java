package com.tutorial;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tutorial.DSA.PhoneNumberDirectory;
class PhoneNumberDirectoryTestMock {
	private PhoneNumberDirectory directory;
	@BeforeEach
	void setup() {
		this.directory = mock(PhoneNumberDirectory.class);
	}
	@Test
	void test() {
		//given
		int[] arr = {5, 10};
		when(directory.getPhoneNumbers()).thenReturn(arr);
		int[] expected = arr;
		//when
		int[] actual = directory.getPhoneNumbers();
		//then
		assertEquals(expected, actual);
	}
}