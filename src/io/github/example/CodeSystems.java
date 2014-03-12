package io.github.semr.ts.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.osgi.service.log.LogService;

@Path("codeSystems")
public class CodeSystems {
	
    
    @GET
    @Produces("text/turtle")
    public String getCodeSystem(){

    	JerseyRegistration.logService.log(LogService.LOG_INFO, "Code System get called!");
    	return "Some code system";
        
    }
    

}
