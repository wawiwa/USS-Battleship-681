package app.tests;


import app.models.User_reg;
import ejb.domain.User;
//ignore the warning since Login will be used when removing comments below

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;


public class Checklogin {
	
	private User user;
	
	//private final Logger logger = LogManager.getLogger(CheckRegistration.class.getName());
	public boolean exception=false;
	
	//used to inform whether the "false" return by valid(user) was accompanied by an exception.
	//if so the output message will be handled differently
	public boolean getexception(){return exception;}
	public void setexception(boolean exception){ this.exception=exception;}
	
	
	public boolean valid(User_reg user2){
		
		/*
		

      try {
         
         //check from the DB if the user exists based on the email provided
          //
         
     //You should invoke(Here) the appropriate class from the jpa package to check if the user is in the DB  
      //if he does check if the password is correct 
          
         if( //if he does   ){
               
           //exception here is still ="false" since everything here went well. Therefore only return .
         return true;
         
         }
         else{ //if he does not 
         
         //exception here is still ="false" since everything here went well. Therefore only return.
           return false;
          
         }
         }catch(){
         //exception occurred, therefore set exception to true before return.
         setexception(true);
         return false;       
         
         }
         */
                 
        
      return true;//just for testing
        
		
	}

	

}