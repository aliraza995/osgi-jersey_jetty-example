osgi-jersey_jetty-example
=========================

An example of osgi + jersey + jetty using web services. 


**Bundles Required** at run time are :


*   Name
*   Apache Felix Dependency Manager (3.1.0)
*   Apache Felix Dependency Manager Shell (3.0.1)
*   Apache Felix Log Service (1.0.1)
*   osgi.core (5.0.0.201203141902)
*   osgi.cmpn (5.0.0.201305092017)
*   Apache Felix EventAdmin (1.3.2)
*   Apache Felix Http Jetty (2.2.1)
*   Javassist (3.18.1.GA)
*   javax.annotation API (1.2.0)
*   Bean Validation API (1.1.0.Final)
*   HK2 API module (2.2.0)
*   aopalliance version 1.0 repackaged as a module (2.2.0)
*   org.objectweb.asm.all version 5.0_BETA repackaged as a module (2.2.0)
*   Injection API (JSR 330) version 1 repackaged as OSGi bundle (2.2.0)
*   ServiceLocator Default Implementation (2.2.0)
*   OSGi resource locator bundle - used by various API providers that rely on META-INF/services mechanism to locate providers. (1.0.1)
*   HK2 Implementation Utilities (2.2.0)
*   jersey-repackaged-guava (2.6.0)
*   jersey-core-client (2.6.0)
*   jersey-core-common (2.6.0)
*   jersey-core-server (2.6.0)
*   javax.ws.rs-api (2.0.0)
*   commons.api (0.0.0)
*   jersey-container-servlet (2.6.0)
*   jersey-container-servlet-core (2.6.0)
   

**Jersey Registration** service logs may look like the following
   
-   [33] example
-   class io.github.example.JerseyRegistration registered
-     org.osgi.service.http.HttpService service required available
-     org.osgi.service.event.EventAdmin service required available
-     org.osgi.service.log.LogService service required available
   
   
   
