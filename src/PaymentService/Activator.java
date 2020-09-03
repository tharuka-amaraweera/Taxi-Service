package PaymentService;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publishserviceregistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Payment Service Started");
		pubservice publisher = new pubserviceImpl();
		publishserviceregistration = context.registerService(pubservice.class.getName(), publisher, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Payment Service Terminated");
		publishserviceregistration.unregister();
	}

}
