package io.github.example;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class JerseyApplication extends Application  {

	
	@Override
    public Set<Class<?>> getClasses() {
        
		Set<Class<?>> result = new HashSet<Class<?>>();
        result.add(CodeSystems.class);
        return result;
    }
	
}
