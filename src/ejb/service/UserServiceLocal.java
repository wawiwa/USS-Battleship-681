package ejb.service;

import javax.ejb.Local;

import ejb.domain.User;

@Local
public interface UserServiceLocal {
	
	public User createNewPlayerInDb(User user);
	
	public User findUserByEmail(User user);
	
	public void addWin(User user);
	
	// find user by name

}
