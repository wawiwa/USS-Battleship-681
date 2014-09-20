package edu.gmu.swe681.service;

import javax.ejb.Local;

import edu.gmu.swe681.domain.User;

@Local
public interface UserServiceLocal {
	
	public User createNewPlayerInDb(User user);
	
	public User findUserByEmail(User user);
	
	public void addWin(User user);
	
	// find user by name

}
