package Check;



import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import mypackage.Registration;
import mypackage.User;



public class CheckRegistration {
	
	private User user;
	private boolean duplicate=false;
	private final Logger logger = LogManager.getLogger(CheckRegistration.class.getName());
	
	public boolean valid(User user){
		
		/*
		 String ret = ERROR;
         Connection conn = null;

      try {
         String URL = "jdbc:mysql://localhost/battleship";
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(URL, "root", "rootpwd");
         
         String sql = "SELECT * FROM User WHERE email=?";
         
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1,user.getEmail());
         
         ResultSet rs = ps.executeQuery();

         if(rs.next()) {
          setduplicate(true);
          // the email exists already
          return false 
         }
         else{
         /* insert the info in the DB here. 
          * 
          * 
          * Think of synchronization
          /*
                    
                 setduplicate(false);         
                 return true;
         
             }
         
        
         
         }catch(SQLException se){
         
         //Handle errors for JDBC
         logger.error("connection to DB failed or database error");
         setduplicate(false);
         // do not need to return here. but should appear outside the block(return false)
         
         //Release resources 
         try{
            if(conn!=null)
               conn.close();
            }catch(SQLException se){
                    logger.error(" failed to close connection ");
             }
      
         }catch(Exception e){
         //Handle errors for Class.forName
         logger.error(" errors for Class.forName :",e.printStackTrace());
         setduplicate(false);
         // do not need to return here will be done outside the block
        
        //Release resources 
         try{
            if(conn!=null)
               conn.close();
            }catch(SQLException se){
                    logger.error(" failed to close connection :",se.printStackTrace());
             }
         
         }	       		  
		  
		  */		 
		 
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
