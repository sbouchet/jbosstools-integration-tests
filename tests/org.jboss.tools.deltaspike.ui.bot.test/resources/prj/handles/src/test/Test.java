package test;

import org.apache.deltaspike.core.api.exception.control.ExceptionHandler;
import org.apache.deltaspike.core.api.exception.control.Handles;
import org.apache.deltaspike.core.api.exception.control.event.ExceptionEvent;

@ExceptionHandler
public class Test {

	void printExceptions(@Handles String evt) {
		
	}
	
}
