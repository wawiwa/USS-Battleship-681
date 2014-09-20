package edu.gmu.swe681.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.gmu.swe681.dao.PlayerDaoLocal;
import edu.gmu.swe681.domain.Player;

@Stateless
public class PlayerServiceImpl implements PlayerServiceLocal {

	@EJB PlayerDaoLocal pdl;
	
	public Player createNewPlayerInDb(Player player) {
		return pdl.create(player);
	}

	@Override
	public Player findUserByEmail(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
