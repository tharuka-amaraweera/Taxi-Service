package bookingservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

import PaymentService.pubservice;

public class BookingServiceActivator implements BundleActivator {

	ServiceRegistration registerBookingService;

	public void start(BundleContext context) throws Exception {
		System.out.println("Booking Service Starts");
		BookingService bookingServicePublisher = new bookingserviceImpl();
		registerBookingService = context.registerService(BookingService.class.getName(), bookingServicePublisher, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Booking Service Ends");
		registerBookingService.unregister();
	}

}
