package io.github.example;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

import javax.servlet.ServletException;

import org.glassfish.jersey.servlet.ServletContainer;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
import org.osgi.service.http.HttpService;
import org.osgi.service.http.NamespaceException;
import org.osgi.service.log.LogService;

public class JerseyRegistration {
	
	
	private volatile HttpService httpService;
	private volatile EventAdmin eaService;
	protected volatile static LogService logService;
	
	
	public void start() {
		
		registerServlets();

	}
		
	public void stop() {
		
		logService.log(LogService.LOG_INFO, "JERSEY BUNDLE: UNREGISTERING SERVLETS");
        httpService.unregister("/rest");
        logService.log(LogService.LOG_INFO, "JERSEY BUNDLE: SERVLETS UNREGISTERED");
	
	}
		
	private void registerServlets() {
		 
	        try {
	        	
	            rawRegisterServlets();
	        
	        } catch (InterruptedException ie) {
	            throw new RuntimeException(ie);
	        } catch (ServletException se) {
	            throw new RuntimeException(se);
	        } catch (NamespaceException se) {
	            throw new RuntimeException(se);
	        }
	 }
	 
	 private void rawRegisterServlets() throws ServletException, NamespaceException, InterruptedException {
	    	
	        logService.log(LogService.LOG_INFO, "JERSEY BUNDLE: REGISTERING SERVLETS");
	        logService.log(LogService.LOG_INFO, "JERSEY BUNDLE: HTTP SERVICE = " + httpService.toString());

	        // TODO - temporary workaround
	        // This is a workaround related to issue JERSEY-2093; grizzly (1.9.5) needs to have the correct context
	        // classloader set
	        ClassLoader myClassLoader = getClass().getClassLoader();
	        ClassLoader originalContextClassLoader = Thread.currentThread().getContextClassLoader();
	        
	        try {
	        	
	            Thread.currentThread().setContextClassLoader(myClassLoader);
	            httpService.registerServlet("/rest", new ServletContainer(), getJerseyServletParams(), null);
	       
	        } finally {
	            
	        	Thread.currentThread().setContextClassLoader(originalContextClassLoader);
	        
	        }
	        // END of workaround - after grizzly updated to the recent version, only the inner call from try block will remain:
	        // httpService.registerServlet("/jersey-http-service", new ServletContainer(), getJerseyServletParams(), null);

	        sendAdminEvent();
	        logService.log(LogService.LOG_INFO,"JERSEY BUNDLE: SERVLETS REGISTERED");
	        
	    }
	 
	 private void sendAdminEvent() {
	       
	    HashMap<String, String> hashtable = new HashMap<String, String>();
	    hashtable.put("context-path", "/");
	    eaService.sendEvent(new Event("jersey/test/DEPLOYED", hashtable));
	        
	 }


	@SuppressWarnings("UseOfObsoleteCollectionType")
	private Dictionary<String, String> getJerseyServletParams() {
		
	    Dictionary<String, String> jerseyServletParams = new Hashtable<String, String>();
	    jerseyServletParams.put("javax.ws.rs.Application", JerseyApplication.class.getName());
	    return jerseyServletParams;
	
	}
	

}
