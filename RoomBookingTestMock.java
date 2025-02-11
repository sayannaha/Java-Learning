package com.tutorial;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import com.tutorial.DSA.RoomBooking;
class RoomBookingTestMock {
	RoomBooking book = mock(RoomBooking.class);
	@Test
	void test() {
		when(book.isRoomAvailable(7)).thenReturn(true).thenReturn(false);
		assertTrue(book.isRoomAvailable(7));
		assertFalse(book.isRoomAvailable(7));
		int[] arr = {2, 8, 9, 10, 4, 5};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 10) {
				book.replaceDigits(arr[i]);
			}
		}
		verify(book).replaceDigits(arr[2]);
	}
}