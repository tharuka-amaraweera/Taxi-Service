package cancelservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class CancelServiceActivator implements BundleActivator {
	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception{
		System.out.println("Cancel Service Starts");
		CancelServicePublish publisherService = new CancelServicePublishImpl();
		publishServiceRegistration = context.registerService(CancelServicePublish.class.getName(),publisherService,null);

		
	}

	
	public void stop(BundleContext context) throws Exception{
		System.out.println("Cancel Service Ends");
		publishServiceRegistration.unregister();
	}
}
