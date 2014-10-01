package ejb.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import app.models.User_reg;
import ejb.dao.UserDaoLocal;
import ejb.domain.User;

@Stateless
public class UserServiceImpl implements UserServiceLocal {

	@EJB UserDaoLocal pdl;
	
	public User createNewUserInDb(User user) {
		return pdl.create(user);
	}

	@Override
	public User findUserByEmail(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addWin(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean doesUserExist(User user) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean checkPassword(User_reg user_reg) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean doesUserExist(String email) {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	

	
}
