package actions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import models.User;
import jpa.Game_stat_op;
import jpa.User_op;
import jpa.Game_stat_op;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import rep_ok.Checkregistration;

import com.opensymphony.xwork2.*;

public class Registration extends ActionSupport implements ModelDriven<User>, Preparable{
	 
	
	private static final long serialVersionUID = 1L;
	/*private final Logger logger = LogManager.getLogger(Registration.class.getName());*/
	private User user=new User();
	private Checkregistration check;
	private User_op user_op=new User_op();
	Game_stat_op game=new Game_stat_op();
	private String failure_message=null;
	
	@Override
	public String execute() throws Exception{	
		
		check=new Checkregistration();
		if(check.valid(user)){
			
			user_op.insert(user);
			game.insert(user);
			System.out.println("inside:"+user.getEmail());
			
						//logger.info("successful registration :",Registration.class.getName());
			//logger.info("just log info");
			//logger.debug("just log debug");
			//logger.warn("just log warn");
			//should go  to login.jsp 
			addActionMessage("Registration successful!");
			addActionMessage("Please log in!");
			
			return "success";
			
		}
		  if(check.getduplicate()){
			 //setFailure_message("The email:"+user.getEmail()+" exists already");
		    // logger.info("attempt to register failed due to email existing already:",Registration.class.getName());
			//should go back to rigisteration.jsp and ask for a different email
			  addActionError("This email has already been registered");
			  return "input";
		  }
		  
		  if(!check.getduplicate()){
			 // setFailure_message("a problem has occured. Please try again later");
			//  logger.info("attempt to register failed due to DB or ClassforName:",Registration.class.getName());
			  //should go back to index.jsp due to transaction error or unavailability
			  addActionError("An error has occured please try again later!");
			  return "error";
		  }else {
			  return "error";
		  }
	
			
				
	}
	
	@Override
	public void validate(){

	      if (user.getName() == null || user.getName().trim().equals(""))
	      {
	    	  addActionError("The name is required");	        
	      }
	      if((user.getName() != null && !user.getName().trim().equals(""))&&(user.getName().length()<2||user.getName().length()>15)){
	    	
	    	  System.out.println("inside");
	    	  addActionError("name must be between 2 and 15 characters");
	    	 
	      }
	      
	      if (user.getPassword() == null || user.getPassword().trim().equals(""))
	      {
	    	  addActionError("The password is required");
	      }
	      if (user.getPassword2() == null || user.getPassword2().trim().equals(""))
	      {
	    	  addActionError("The password is required");
	      }
	      
	      if (user.getEmail() == null || user.getEmail().trim().equals(""))
	      {
	         addActionError("The email is required!");
	      }
	      

	      if(user.getPassword() != null && !user.getPassword().trim().equals("") && user.getPassword2() != null && !user.getPassword2().trim().equals("")
	    		  && !user.getPassword().trim().equals(user.getPassword2().trim())){
	    	  // check passwords match if and only if  password fields are neither empty nor null
	    		System.out.println("pwds:"+user.getPassword()+""+user.getPassword2());
	           addActionError("the passwords do not match");
	       	        
	      }
	      
	    
	    	    
	    	   if (user.getEmail() != null && !user.getEmail().trim().equals("")){
	    	  /* check email format if and only if email fields are neither empty nor null  */    		   
	    		   
	    	  
	            String  expression="^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	               CharSequence inputStr = user.getEmail();
	               Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
	               Matcher matcher = pattern.matcher(inputStr);	               
	               if(!matcher.matches())
	                
	            	   addActionError("Invalid email address");
	            	   
	       }
	    	   	   
	      		
	}	
	
	@Override
	public User getModel() {
		
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public String getFailure_message() {
		return failure_message;
	}

	public void setFailure_message(String failure_message) {
		this.failure_message = failure_message;
	}
  
}