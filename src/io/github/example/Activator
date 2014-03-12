package io.github.example;


import org.apache.felix.dm.DependencyActivatorBase;
import org.apache.felix.dm.DependencyManager;

import org.osgi.framework.BundleContext;
import org.osgi.service.event.EventAdmin;
import org.osgi.service.http.HttpService;
import org.osgi.service.log.LogService;


public class Activator extends DependencyActivatorBase{

	  
	    
	    @Override
		public void destroy(BundleContext bundleContext, DependencyManager manager)
				throws Exception {
			//TODO
		}


		@Override
		public void init(BundleContext bundleContext, DependencyManager manager)
				throws Exception {
			
			manager.add(createComponent()
			.setImplementation(JerseyRegistration.class)
			.add(createServiceDependency()
			.setService(HttpService.class)
			.setRequired(true))
			.add(createServiceDependency()
			.setService(EventAdmin.class)
			.setRequired(true))
			.add(createServiceDependency()
			.setService(LogService.class)
			.setRequired(true)));
			
	    }

}
