package clientone;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import PaymentService.pubservice;
import bookingservice.BookingService;
import cancelservice.CancelServicePublish;
import searchservice.SearchServicePublish;
import vehicle_booking_service.Booking_interface;

public class ClientOneActivator implements BundleActivator {

	ServiceReference clientOneReference;
	ServiceReference referenceBooking;
	ServiceReference searchServiceReference;
	ServiceReference cancelServiceReference;
	ServiceReference clienttwoReference;
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Client one enters");


		clienttwoReference = context.getServiceReference(Booking_interface.class.getName());
		Booking_interface taxiserviceavailable = (Booking_interface) context.getService(clienttwoReference);
		
		
		clientOneReference = context.getServiceReference(BookingService.class.getName());
		BookingService taxiServiceavailable = (BookingService) context.getService(clientOneReference);
		
		
		searchServiceReference = context.getServiceReference(SearchServicePublish.class.getName());
		SearchServicePublish searchServicePublish = (SearchServicePublish) context.getService(searchServiceReference);
		
		cancelServiceReference = context.getServiceReference(CancelServicePublish.class.getName());
		CancelServicePublish cancelServicePublish = (CancelServicePublish) context.getService(cancelServiceReference);
		
		
		//payment
	    System.out.println("Booking service requests for payment");
		referenceBooking = context.getServiceReference(pubservice.class.getName());
		pubservice paymentService = (pubservice) context.getService(referenceBooking);
		
		//Check all the available vehicles
		System.out.println(searchServicePublish.checkCabAvailability());
		//Search for a specific vehicle brand
		System.out.println(searchServicePublish.searchSpecificCab());
		//add quntity
		System.out.println("please enter the Quntity");
		taxiserviceavailable.setQuntity();
		System.out.println();
				
				//add type
				System.out.println("............................................................");
				System.out.println("please enter the Type");
				System.out.println("1.A/C");
				System.out.println("2.Non A/C");
				taxiserviceavailable.settype();
				System.out.println();
				
				//add starting point
				System.out.println("............................................................");
				System.out.println("please enter the Starting point");
				taxiserviceavailable.setstart();
				System.out.println();
				
				//add destination point
				System.out.println("............................................................");
				System.out.println("please enter the Destination point");
				taxiserviceavailable.setdstination();
				
				//add phone number
				System.out.println();
				System.out.println("............................................................");
				System.out.println("please enter the Contact Number");
				taxiserviceavailable.setphone();
				
		
		//Display summary receipt
		System.out.println(taxiServiceavailable.DisplayBookingReceipt());
		//Display totalCharge
		System.out.println(paymentService.getTotalCharge());
		//Display all the booking details
		System.out.println(cancelServicePublish.displayAllBookings());
		//Cancel a specific booking
		System.out.println(cancelServicePublish.cancelCabBooking());
		
		
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Thank you!!");
		context.ungetService(clientOneReference);
		context.ungetService(referenceBooking);
	}

}
