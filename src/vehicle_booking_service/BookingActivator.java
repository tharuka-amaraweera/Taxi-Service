package vehicle_booking_service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class BookingActivator implements BundleActivator {

	ServiceRegistration reg;

	

	public void start(BundleContext context) throws Exception {
		System.out.println("booking service started");
		
		Booking_interface mm= new Booking_function();
		reg = context.registerService(Booking_interface.class.getName(), mm, null);
		
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("booking service stopped");
		reg.unregister();
	}

}
