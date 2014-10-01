package ejb.service;

import javax.ejb.Local;

import app.models.User_reg;
import ejb.domain.User;

@Local
public interface UserServiceLocal {
	
	// also creates a game
	public User createNewUserInDb(User user);
	
	public User findUserByEmail(User user);
	
	public void addWin(User user);
	
	public boolean doesUserExist(User user);
	
	public boolean checkPassword(User_reg user_reg);
	
	public boolean doesUserExist(String email);
}
