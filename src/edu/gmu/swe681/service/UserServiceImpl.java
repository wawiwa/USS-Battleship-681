package edu.gmu.swe681.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.gmu.swe681.dao.UserDaoLocal;
import edu.gmu.swe681.domain.User;

@Stateless
public class UserServiceImpl implements UserServiceLocal {

	@EJB UserDaoLocal pdl;
	
	public User createNewPlayerInDb(User player) {
		return pdl.create(player);
	}

	@Override
	public User findUserByEmail(User player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addWin(User user) {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
