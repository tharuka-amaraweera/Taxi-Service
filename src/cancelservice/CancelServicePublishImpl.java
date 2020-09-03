package cancelservice;

import java.util.*;
import taxidatastore.*;

public class CancelServicePublishImpl implements CancelServicePublish {

	public String displayAllBookings() {
		
		System.out.println("----- Display All the Available Booking Details ---- ");
		System.out.println("BookingReference ID | UserReferenceID | StartLocation | DestinationLocation | NoOfKM | NoOfExtraKM | Charge | ExtraCharge | BookingDate | ReleseDate | Duration | Quantity");

		bookingDataStore booking = new bookingDataStore();
		// booking.addBooking();

		Iterator<taxi_booking> itr = booking.bl.iterator();

		while (itr.hasNext()) {

			taxi_booking st2 = (taxi_booking) itr.next();
			System.out.println(st2.bookId + " " + st2.ref_vId + " " + st2.ref_uId + " " + st2.startLocation + " "
					+ st2.destin_location + " " + st2.noOfKM + " " + st2.noOfExtraKM + " " + st2.charge + " "
					+ st2.extraCharge + " " + st2.bookDate + " " + st2.releaseDate + " " + st2.duration + " "
					+ st2.quantity);
		}

		return "All Booking Details Displayed Successfully";

	}

	public String cancelCabBooking() {
		
		System.out.println("----- Cancel a Specific Vehicle Booking ---- ");

		bookingDataStore booking = new bookingDataStore();
		// booking.addBooking();

		System.out.println("Please Enter Booking Reference Number to be Canceled :");
		Scanner in2 = new Scanner(System.in);
		String bookingRef = in2.next();

		Iterator<taxi_booking> itr = booking.bl.iterator();
		while (itr.hasNext()) {
			taxi_booking st3 = (taxi_booking) itr.next();
			String bookingID = String.valueOf(st3.bookId);
			if (bookingID.contains(bookingRef))
				itr.remove();

		}
		System.out.println("All Available Cab Details After Cancelling Specifified Booking are Displayed: ");
		displayAllBookings();

		return "Canceled Specific Booking Successfully";

	}

}
