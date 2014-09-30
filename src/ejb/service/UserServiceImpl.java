package ejb.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ejb.dao.UserDaoLocal;
import ejb.domain.User;

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
