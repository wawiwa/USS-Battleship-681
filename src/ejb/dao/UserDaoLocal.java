package ejb.dao;

import javax.ejb.Local;

import ejb.domain.User;

@Local
public interface UserDaoLocal extends GenericDao<User> {

}
