package jpa;
import ejb.domain.User;

public class User_op {
	
	public User_op() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean insert(User u){
	/* the table schema is:Id,email{pk}, pwd, username, date.
		*/
		return true;
	}
	 
   public boolean select(User u){
		
		
		return true;
	}

}