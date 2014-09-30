package edu.gmu.swe681.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;

import edu.gmu.swe681.domain.User;

@Stateless
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDaoLocal{

	
}
