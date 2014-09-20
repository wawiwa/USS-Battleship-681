package rep_ok;


import models.User;
import jpa.User_op;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;


public class Checkregistration {
	
	
	private boolean duplicate=false;
	private User_op user_op=new User_op();
	//private final Logger logger = LogManager.getLogger(CheckRegistration.class.getName());
	
	public boolean valid(User user){//This is to verify that the email has not being used yet
		
		
		user_op.select(user);
		
		//If the result is non empty, set setduplicate(true) and return false.
		
		 //else set setduplicate(false) and return true.
		
		
		//else an error occurs, setduplicate(false) and return false
		
		
		 //just for testing
		setduplicate(false);
		return true;
		
	}

	public boolean getduplicate() {
		return duplicate;
	}

	public void setduplicate( boolean duplicate) {
		this.duplicate = duplicate;
	}

}