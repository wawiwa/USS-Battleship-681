package ejb.dao;

import javax.ejb.Stateless;

import ejb.domain.User;

@Stateless
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDaoLocal{

	
}
