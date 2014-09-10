package mypackage;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import Check.CheckRegistration;

import com.opensymphony.xwork2.*;

public class Registration extends ActionSupport implements ModelDriven<User>, Preparable{
	 
	
	private static final long serialVersionUID = 1L;
	private final Logger logger = LogManager.getLogger(Registration.class.getName());
	private User user=new User();
	private CheckRegistration check;
	private String failure_message=null;
	
	@Override
	public String execute() throws Exception{	
		
		check=new CheckRegistration();
		if(check.valid(user)){
			System.out.println("inside:"+user.getEmail());
			logger.info("successful registration :",Registration.class.getName());
			//logger.info("just log info");
			//logger.debug("just log debug");
			//logger.warn("just log warn");
			//should go  to login.jsp 
			return "success";
			
		}
		  if(check.getduplicate()){
			 setFailure_message("The email:"+user.getEmail()+" exists already");
			  logger.info("attempt to register failed due to email existing already:",Registration.class.getName());
			//should go back to rigisteration.jsp and ask for a different email
			  return "input";
		  }
		  
		  if(!check.getduplicate()){
			  setFailure_message("a problem has occured. Please try again later");
			  logger.info("attempt to register failed due to DB or ClassforName:",Registration.class.getName());
			  //should go back to index.jsp due to transaction error or unavailability
			  return "error";
		  }else {
			  return "error";
		  }
	
			
				
	}
	
	@Override
	public void validate(){

	      if (user.getName() == null || user.getName().trim().equals(""))
	      {
	         addFieldError("name","The name is required");
	      }
	      
	      if (user.getPassword() == null || user.getPassword().trim().equals(""))
	      {
	         addFieldError("password","The password is required");
	      }
	      if (user.getPassword2() == null || user.getPassword2().trim().equals(""))
	      {
	         addFieldError("password2","The password is required");
	      }
	      
	      if (user.getEmail() == null || user.getEmail().trim().equals(""))
	      {
	         addFieldError("email","The email is required");
	      }
	      
	      
	      if(user.getPassword() != null && !user.getPassword().trim().equals("") && user.getPassword2() != null && !user.getPassword2().trim().equals("")
	    		  && !user.getPassword().trim().equals(user.getPassword2().trim())){
	    	  // check passwords match if and only if  password fields are neither empty nor null
	    		System.out.println("pwds:"+user.getPassword()+""+user.getPassword2());
	            addFieldError("password","the passwords do not match");
	       	        
	      }
	      
	     // else{
	    	  /**/
	    	    
	    	   if (user.getEmail() != null && !user.getEmail().trim().equals("")){
	    	  /* check email format if and only if email fields are neither empty nor null  */    		   
	    		   
	    	  
	            String  expression="^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	               CharSequence inputStr = user.getEmail();
	               Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
	               Matcher matcher = pattern.matcher(inputStr);	               
	               if(!matcher.matches())
	                   addFieldError("email","Invalid email address");
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
