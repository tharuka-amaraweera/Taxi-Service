package taxidatastore;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class taxiDataStoreActivator implements BundleActivator {

	ServiceRegistration taxiDataStoreRegister;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Taxi Data Store Service starts");
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Taxi Data Store Service Ends");
		//taxiDataStoreRegister.unregister();
	}

}
