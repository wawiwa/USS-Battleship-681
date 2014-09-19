package edu.gmu.swe681.dao;

import javax.ejb.Local;

import edu.gmu.swe681.domain.Player;

@Local
public interface PlayerDaoLocal extends GenericDao<Player> {

}
