package bookingservice;

import java.util.ArrayList;
import java.util.*;
import taxidatastore.bookingDataStore;
import taxidatastore.taxi_booking;

public class bookingserviceImpl implements BookingService {

	public String DisplayBookingReceipt() {
		
		int bid=0;
		int distance=0;
		int vid=0;
		int charge=0;
		
		bookingDataStore book = new bookingDataStore();
		book.addBooking();
		int booking [] = book.getLastBooking();
		bid=booking[0];
		distance=booking[1];
		vid=booking[2];
		System.out.println("Booking ID : "+bid);
		System.out.println("Vehicle ID : "+ vid);
		System.out.println("Distance : "+distance+" KM");
		//System.out.println("Total Charge : "+ totalCharge);
		
		return "Booking Details Summary";
		
	}
}
