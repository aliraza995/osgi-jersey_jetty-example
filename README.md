osgi-jersey_jetty-example
=========================

An example of osgi + jersey + jetty using web services. 


**Bundles Required** at run time are :


   ID|State      |Level|Name
    0|Active     |    0|System Bundle (4.2.1)
    1|Active     |    1|Apache Felix Dependency Manager (3.1.0)
    2|Active     |    1|Apache Felix Dependency Manager Shell (3.0.1)
    3|Active     |    1|Apache Felix Log Service (1.0.1)
    7|Active     |    1|osgi.core (5.0.0.201203141902)
    8|Active     |    1|osgi.cmpn (5.0.0.201305092017)
   10|Active     |    1|Apache Felix EventAdmin (1.3.2)
   12|Active     |    1|Apache Felix Http Jetty (2.2.1)
   13|Active     |    1|Javassist (3.18.1.GA)
   14|Active     |    1|javax.annotation API (1.2.0)
   15|Active     |    1|Bean Validation API (1.1.0.Final)
   16|Active     |    1|HK2 API module (2.2.0)
   17|Active     |    1|aopalliance version 1.0 repackaged as a module (2.2.0)
   18|Active     |    1|org.objectweb.asm.all version 5.0_BETA repackaged as a module (2.2.0)
   19|Active     |    1|Injection API (JSR 330) version 1 repackaged as OSGi bundle (2.2.0)
   20|Active     |    1|ServiceLocator Default Implementation (2.2.0)
   21|Active     |    1|OSGi resource locator bundle - used by various API providers that rely on META-INF/services mechanism to locate providers. (1.0.1)
   22|Active     |    1|HK2 Implementation Utilities (2.2.0)
   23|Active     |    1|jersey-repackaged-guava (2.6.0)
   24|Active     |    1|jersey-core-client (2.6.0)
   25|Active     |    1|jersey-core-common (2.6.0)
   26|Active     |    1|jersey-core-server (2.6.0)
   27|Active     |    1|javax.ws.rs-api (2.0.0)
   28|Active     |    1|commons.api (0.0.0)
   29|Active     |    1|jersey-container-servlet (2.6.0)
   30|Active     |    1|jersey-container-servlet-core (2.6.0)
   
   **Jersey Registration** service logs may look like the following
   
   [33] example
  class io.github.example.JerseyRegistration registered
    org.osgi.service.http.HttpService service required available
    org.osgi.service.event.EventAdmin service required available
    org.osgi.service.log.LogService service required available
   
   
   
