package actions;

import java.util.Date;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import rep_ok.Checklogin;

import com.opensymphony.xwork2.*;

import models.User_reg;

import org.apache.struts2.interceptor.SessionAware;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;



public class Login extends ActionSupport implements ModelDriven<User_reg>, Preparable,SessionAware{
	 
	
	private static final long serialVersionUID = 1L;
	/*private final Logger logger = LogManager.getLogger(Registration.class.getName());*/
	private User_reg user_reg=new User_reg();
	private Checklogin check;
	private Map<String, Object> session;
	
	
	@Override
	public String execute() throws Exception{	
		
		check=new Checklogin();
		if(check.valid(user_reg)){
			System.out.println("inside0:"+user_reg.getEmail());
			//logger.info("successful registration :",Registration.class.getName());
			//logger.info("just log info");
			//logger.debug("just log debug");
			//logger.warn("just log warn");
			//should go  to login.jsp 		
			
			session.put("logedin","true");			
			session.put("context",new Date());			
			session.put("player_email", user_reg.getEmail());
			addActionMessage("Log in successfull!");
			System.out.println("inside1:"+user_reg.getEmail());
			return "success";
			
		} else{
			 addActionError("Bad credential. Please try again!");
			return "input"; 
		  
	 	  }		 
				
	}
	
	public String home(){		
		return "success";
	}
	public String logout(){		 System.out.println("herrre");
		/*
		 * Along the way we will be closing resources and saving states in this method. 
		 * 
		 * */
		/*
		System.out.println("inside logout:"+user_reg.getEmail());
		if(session==null){
			return "success";
		}else{
			System.out.println("inside log out 2:"+user_reg.getEmail());
			session.remove("logedin");
			addActionMessage("You Have Been Logged Out Successfully!");
			return "success";	
		}*/
	if(session==null){
		return "success";
	}else{
		
		session.remove("logedin");
		session.remove("context");
		session.remove("player_email");
		addActionMessage("You Have Been Logged Out Successfully!");
		return "success";	}
		
	}
	
	@Override
	public void validate(){
      
		 System.out.println(session);
	      if (user_reg.getPassword() == null || user_reg.getPassword().trim().equals(""))
	      {
	    	  System.out.println("error pwd:"+user_reg.getPassword());
	    	  addActionError("The password is required");
	      }
	      	      
	      if (user_reg.getEmail() == null || user_reg.getEmail().trim().equals(""))
	      {
	    	  System.out.println("email required:"+user_reg.getEmail());
	         addActionError("The email is required!");
	      }
	       
	         	    
	   	   if (user_reg.getEmail() != null && !user_reg.getEmail().trim().equals("")){
	    	  /* check email format if and only if email fields are neither empty nor null  */    		   
	    		   
	    	  
	            String  expression="^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	               CharSequence inputStr = user_reg.getEmail();
	               Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
	               Matcher matcher = pattern.matcher(inputStr);	               
	               if(!matcher.matches()){
	            	   System.out.println("bad email:"+user_reg.getEmail());
	            	  
	            	   addActionError("Invalid email address");}
	            	   
	       }
	   	   
	      		
	}	
	
	

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User_reg getModel() {
		// TODO Auto-generated method stub
		return user_reg;
	}

	@Override
	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		this.session=map;
	}
	public Map<String, Object> getSession() {
		// TODO Auto-generated method stub
		return session;
		
	}

	
  
}