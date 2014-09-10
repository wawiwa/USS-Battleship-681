package logger;
import mypackage.Registration;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LoggerFacility {
	private final Logger logger =null;
	
	
	
	
	public void logInfo(Level message){
		LogManager.getRootLogger();
		//this.logger.log(message, null);
	}

}
