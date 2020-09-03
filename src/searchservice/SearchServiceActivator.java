package searchservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class SearchServiceActivator implements BundleActivator {
		ServiceRegistration publishServiceRegistration;

		public void start(BundleContext context) throws Exception{
			System.out.println("Search Service Starts");
			SearchServicePublish publisherService = new SearchServicePublishImpl();
			publishServiceRegistration = context.registerService(SearchServicePublish.class.getName(),publisherService,null);

			
		}

		
		public void stop(BundleContext context) throws Exception{
			System.out.println("Search Service Ends !");
			publishServiceRegistration.unregister();
		}
}
