package edu.gmu.swe681.dao;

import javax.ejb.Local;

import edu.gmu.swe681.domain.User;

@Local
public interface UserDaoLocal extends GenericDao<User> {

}
