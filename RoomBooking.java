package com.tutorial.DSA;
public class RoomBooking {
	public int COUNT_OF_ROOMS = 10;
	public boolean isRoomAvailable(int numberOfRooms) {
		if (numberOfRooms > 10) {
			return false;
		} else if (numberOfRooms > COUNT_OF_ROOMS) {
			return false;
		} else {
			COUNT_OF_ROOMS = COUNT_OF_ROOMS - numberOfRooms;
			return true;
		}
	}
	public int replaceDigits(int num) {
		return 10 - num;
	}
}